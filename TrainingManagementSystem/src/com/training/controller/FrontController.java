package com.training.controller;

import com.training.model.UserModel;
import com.training.service.UserService;
import com.training.view.AdminView;
import com.training.view.ErrorView;
import com.training.view.ManagerView;
import com.training.view.TraineeView;
import com.training.view.TrainerView;
import com.virtusa.exception.UserException;
import com.virtusa.helper.UserFactory;

public class FrontController {

	private UserService userService;
	public FrontController() {
		this.userService=UserFactory.createUserService();
		
	}
	
	public void userAuthentication(String userId,String password) {
		
		UserModel userModel=new UserModel();
		userModel.setUserId(userId);
		userModel.setPassword(password);
		try {
		String userType=
				userService.userAuthenticationService(userModel);
		
		if(userType.contentEquals("TRAINER")) {
			TrainerView trainerView=new TrainerView();
			trainerView.mainTrainerView();
		}else if(userType.contentEquals("ADMIN")) {
			AdminView adminView=new AdminView();
			adminView.mainAdminView();
		}
			else if(userType.contentEquals("MANAGER")) {
				ManagerView managerView=new ManagerView();
				managerView.mainManagerView();
			}
				else {
					TraineeView traineeView=new TraineeView();
					traineeView.mainTraineeView();
			}
				
		}catch(UserException e) {
			ErrorView errorView=new ErrorView();
			errorView.AuthenticationError();
			
		}
		
	}

}



