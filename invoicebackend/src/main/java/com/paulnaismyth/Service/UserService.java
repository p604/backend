package com.paulnaismyth.Service;

import com.paulnaismyth.Dao.UserDao;
import com.paulnaismyth.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public Collection<User> getAllUsers(){
        return userDao.getAllUsers();
    }

    public User getUserById(int id){
        return this.userDao.getUserById(id);
    }


    public void updateUser(User user){
        this.userDao.updateUser(user);
    }

    public void insertUser(User user){
        this.userDao.insertUserToDb(user);
    }

}
