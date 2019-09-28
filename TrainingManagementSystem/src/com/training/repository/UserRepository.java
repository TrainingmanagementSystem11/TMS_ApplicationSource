
package com.training.repository;


import java.util.ArrayList;
import java.util.List;

import com.training.entities.Admin;
import com.training.entities.Manager;
import com.training.entities.Trainee;
import com.training.entities.Trainer;
import com.training.entities.User;
import com.training.utilities.UserTypes;


public class UserRepository {
	private static List<User> userRepository=
			new ArrayList<User>();
	static{
		
		Trainer trainer=new Trainer();
		trainer.setUserId("8067237");
		trainer.setPassword("shiva@123");
		trainer.setFirstName("shiva");
		trainer.setLastName("kumar");
		trainer.setEmailAddress("shiva@virtusa.com");
		trainer.setPhoneNumber("9988776655");
		trainer.setDateOfBirth("29-11-1996");
		trainer.setUserType(UserTypes.TRAINER);
		userRepository.add(trainer);
		
		Admin admin=new Admin();
		admin.setAdminId("8067238");
		admin.setPassword("admin@123");
		admin.setFirstName("ravi");
		admin.setLastName("Desai");
		admin.setEmailAddress("admin@virtusa.com");
		admin.setPhoneNumber("7741973507");
		admin.setDateOfBirth("11-10-1986");
		admin.setUserType(UserTypes.ADMIN);
		userRepository.add(admin);	
		
		Trainee trainee=new Trainee();
		trainee.setTraineeId("8067239");
		trainee.setPassword("admin@123");
		trainee.setFirstName("ravi");
		trainee.setLastName("Desai");
		trainee.setEmailAddress("trainee@virtusa.com");
		trainee.setPhoneNumber("7741973507");
		trainee.setDateOfBirth("09-10-19");
		trainee.setUserType(UserTypes.TRAINEE);
		userRepository.add(trainee);	
		
		Manager manager=new Manager();
		manager.setManagerId("8067240");
		manager.setPassword("manager@123");
		manager.setFirstName("ravi");
		manager.setLastName("Desai");
		manager.setEmailAddress("manager@virtusa.com");
		manager.setPhoneNumber("7741973507");
		manager.setDateOfBirth("10-10-1970");
		manager.setUserType(UserTypes.MANAGER);
		userRepository.add(manager);	
		
	}
	public static List<User> getUserRepository() {
		return userRepository;
	}
}

