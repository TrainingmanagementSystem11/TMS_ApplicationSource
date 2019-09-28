package com.training.service;

import com.training.dao.UserDAO;
import com.training.model.UserModel;
import com.virtusa.exception.UserException;
import com.virtusa.helper.UserFactory;

public class UserServiceImpl implements UserService {
		
		private UserDAO userDAO=null;
		
		public UserServiceImpl() {
			this.userDAO=UserFactory.createUserDAO();
		}
		
		@Override
		public String userAuthenticationService(UserModel userModel) {
			// TODO Auto-generated method stub
			boolean userValid=
					userDAO.userAuth(userModel.getUserId(), userModel.getPassword());
			String userType=null;
			if(userValid) {
				userType=userDAO.retrieveUserType(userModel.getUserId());	
			}
			else {
				throw new UserException("Invalid userId or password");
			}
			return userType;
		}

}
