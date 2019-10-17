package com.training.ui;

import java.sql.SQLException;

import com.training.view.LoginView1;
import com.training.view.TrainerMainView;

public class ClientUI {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
	   // LoginView1 loginView=new LoginView1();
	 //   loginView.loginMenu();
		TrainerMainView mainView=new TrainerMainView();
			mainView.mainMenu();	
	}
}
