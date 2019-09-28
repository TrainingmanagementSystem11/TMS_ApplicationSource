package com.training.dao;

import java.util.List;

import com.training.entities.User;
import com.training.repository.UserRepository;
import com.training.utilities.UserTypes;

public class UserDAOImpl implements UserDAO {
private List<User> userList=null;

public UserDAOImpl() {
	
	this.userList=UserRepository.getUserRepository();
}

@Override
public boolean userAuth(String userId, String password) {
	// TODO Auto-generated method stub
	boolean result=false;
	for(User user:userList) {	
		if(user.getUserId().equals(userId)) {
			
			if(user.getPassword().equals(password)) {
				result= true;
									
			}
		}
	}
	
	return result;
}

@Override
public String retrieveUserType(String userId) {
	// TODO Auto-generated method stub
	
	String returnUserType=null;
	for(User user:userList) {
		if(user.getUserId().equals(userId)){
		UserTypes userTypes=user.getUserType();
		
		switch(userTypes) {
		
		case TRAINER:
			returnUserType="TRAINER";
			break;
		case ADMIN:
			returnUserType="ADMIN";
			break;
			
		case TRAINEE:
			returnUserType="TRAINEE";
			break;
		case MANAGER:
			returnUserType="MANAGER";
			break;
		
		}
		
	}
	}
	return returnUserType;
}

}

	
	