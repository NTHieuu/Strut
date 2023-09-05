package com.strut.strutstut.utils;

import com.strut.strutstut.models.User;
import com.strut.strutstut.dao.UserDAO;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.util.List;

public class StartupListener implements ServletContextListener {
    private final UserDAO userDAO = new UserDAO();
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        List<User> userList = userDAO.readAll();
        sce.getServletContext().setAttribute("list", userList);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        ServletContextListener.super.contextDestroyed(sce);
    }
}
