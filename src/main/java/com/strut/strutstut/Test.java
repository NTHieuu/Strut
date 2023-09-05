package com.strut.strutstut;

import com.strut.strutstut.models.User;
import com.strut.strutstut.dao.UserDAO;

public class Test {
    public static void main(String[] args) {
        UserDAO userDAO = new UserDAO();

        User user = new User();

        user.setName("Hieu");
        user.setAge(10);

        userDAO.save(user);
    }
}
