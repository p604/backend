package com.paulnaismyth.Dao;
import com.paulnaismyth.Entity.User;
import com.paulnaismyth.Entity.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import javax.swing.text.html.parser.Entity;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Collection;

@Repository
public class UserDao {

    @Autowired
    DataSource dataSource;

    @Autowired
    JdbcTemplate jdbcTemplate;

    private static Map<Integer, User> users;

    static {

        users = new HashMap<Integer, User>(){
            {
                put(1, new User(1, "Paul", "Nai", "paulnaismyth@hotmail.com"));
            }
        };
    }

    public Collection<User> getAllUsers(){
        return this.users.values();
    }



    public void updateUser(User user){
        User u = users.get(user.getId());
        u.setEmail(user.getEmail());
        u.setFirst_name(user.getFirst_name());
        u.setLast_name(user.getLast_name());
        users.put(user.getId(), user);
    }

    public void insertUserToDb(User user){
        this.users.put(user.getId(), user);
    }



    public User getUserById(int id) {
        return this.users.get(id);
    }

    public void register(User user){
        String sql = "insert into users values(?,?,?,?,?)";

        jdbcTemplate.update(sql, new Object[]{user.getUsername(), user.getPassword(), user.getFirst_name(),
                            user.getLast_name(), user.getEmail()});
    }

    public User validateUser(Login login){

        String sql = "select * from users where username='" + login.getUsername() + "' and password='" + login.getPassword() +"'";

        List<User> users = jdbcTemplate.query(sql, new UserMapper());

        return users.size() > 0 ? users.get(0) : null;
    }

}

class UserMapper implements RowMapper<User>{

    public User mapRow(ResultSet rs, int arg1) throws SQLException {
        User user = new User();

        user.setUsername(rs.getString("username"));
        user.setPassword(rs.getString("password"));
        user.setFirst_name(rs.getString("first_name"));
        user.setLast_name(rs.getString("last_name"));
        user.setEmail(rs.getString("email"));

        return user;
    }

}
