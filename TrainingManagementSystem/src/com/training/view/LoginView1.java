package com.training.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

import com.training.controller.LoginController;

public class LoginView1 {

public void loginMenu() throws ClassNotFoundException, SQLException{
	
		
		try(
				InputStreamReader reader=
				new InputStreamReader(System.in);
					BufferedReader buffer=new BufferedReader(reader);
					
		     ){
				System.out.println("***************************");	
				System.out.print("Enter Employee ID:");
				String employeeId=buffer.readLine().trim();
				
				System.out.print("Enter Password:");
				String password=buffer.readLine().trim();
				System.out.println("***************************");
				
				LoginController controller=new LoginController();
				controller.userAuth(employeeId,password);
				
				
			}catch(IOException e) {
				e.printStackTrace();
			
	} }
}
