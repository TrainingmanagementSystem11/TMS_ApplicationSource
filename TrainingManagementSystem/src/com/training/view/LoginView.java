/*package com.training.view;

import java.util.Scanner;

import com.training.controller.AdminController;
import com.training.controller.TrainerController;

public class LoginView {
        public static Scanner scanner=new Scanner(System.in);
			public static void adminLogin() {
		// TODO Auto-generated method stub
		System.out.println("Enter Admin Id:");
		String adminId=scanner.next();
		System.out.println("Enter Password:");
		String adminPassword=scanner.next();
		
		AdminController adminController=new AdminController();
		adminController.adminAuthentication(adminId, adminPassword);
		
	}
			public static void trainerLogin() {
				
				System.out.println("Enter Trainer Id:");
				String trainerId=scanner.next();
				System.out.println("Enter Password:");
				String trainerPassword=scanner.next();
				
				TrainerController trainerController=new TrainerController();
				trainerController.trainerAuthentication(trainerId, trainerPassword);
			}

}
*/