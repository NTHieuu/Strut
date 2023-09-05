package com.strut.strutstut.services;

import com.strut.strutstut.dao.UserDAO;
import com.strut.strutstut.models.User;

import java.util.List;

public class UserService {
    private final UserDAO userDAO = new UserDAO();

    public List<User> saveAndReadAll(User user){
        return userDAO.saveAndReadAll(user);
    }

    public List<User> readAll(){
        return userDAO.readAll();
    }

    public void deleteUserById(Integer id){
        userDAO.deleteUserById(id);
    }

}
