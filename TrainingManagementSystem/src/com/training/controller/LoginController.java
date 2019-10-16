package com.training.controller;

import java.sql.SQLException;

import com.training.helper.FactoryLoginDB;
import com.training.model.LoginModel;
import com.training.service.LoginService;
import com.training.view.AdminView;
import com.training.view.ErrorView;
import com.training.view.ManagerView;
import com.training.view.TraineeView;
import com.training.view.TrainerMainView;

public class LoginController {
	
private LoginService loginService;

	
	public LoginController() {
		this.loginService=
				FactoryLoginDB.createLoginService();
	}

	public void userAuth(int employeeId, String password) throws ClassNotFoundException,SQLException  {
		// TODO Auto-generated method stub
		
		LoginModel loginModel=new LoginModel();
		loginModel.setEmployeeId(employeeId);
		loginModel.setPassword(password);
		
		try {
			String outcome=loginService.userAuthenticationService(loginModel);
			if(outcome.contentEquals("MANAGER")){
				ManagerView managerView=new ManagerView();
				managerView.ApproveorRejectStatus();
			}
			else if(outcome.contentEquals("ADMIN")) {
				AdminView adminView=new AdminView();
				adminView.mainAdminMenu();
			}
			else if(outcome.contentEquals("TRAINEE")) {
				TraineeView traineeView=new TraineeView();
				traineeView.mainTraineeView();
			}
			else if(outcome.contentEquals("TRAINER")) {
				TrainerMainView trainermainView=new TrainerMainView();
				trainermainView.mainMenu();
			}else {
				ErrorView errorView=new ErrorView();
				errorView.AuthenticationError();
			}
		
	}catch(Exception e) {
		System.out.println("User Authentication failed.");
	}
	}

	public void userAuthentication(int employeeId, String password) {
		// TODO Auto-generated method stub
		
	}

	public void userAuth(String employeeId, String password) {
		// TODO Auto-generated method stub
		
	}

}
