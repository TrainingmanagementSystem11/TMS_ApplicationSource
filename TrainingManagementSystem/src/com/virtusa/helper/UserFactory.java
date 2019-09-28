package com.virtusa.helper;

import com.training.dao.UserDAO;
import com.training.dao.UserDAOImpl;
import com.training.service.UserService;
import com.training.service.UserServiceImpl;

public class UserFactory {
	public static UserDAO createUserDAO() {
		UserDAO userDAO=new UserDAOImpl();
		return userDAO;
	}
	public static UserService createUserService() {
		UserService userService=new UserServiceImpl();
		return userService;
	}
}


