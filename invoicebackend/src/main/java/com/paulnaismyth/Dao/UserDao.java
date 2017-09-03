package com.paulnaismyth.Dao;
import com.paulnaismyth.Entity.User;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.parser.Entity;
import java.util.HashMap;
import java.util.Map;
import java.util.Collection;

@Repository
public class UserDao {

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
}
