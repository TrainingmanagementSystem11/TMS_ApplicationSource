package com.training.view;

import java.util.Scanner;

public class TrainerView {
	public static final Scanner scanner = new Scanner(System.in);
	public static void trainerMenu()
	{
		System.out.println("*Welocome to Trainer HomePage**");
		System.out.println("====================================");
		System.out.println("Please Enter any one option");
		System.out.println("1.Post Training.");
		System.out.println("2.View Feedback");
		System.out.println("3.Training Venue");
		System.out.println("4.My Profile");
		System.out.println("0.Logout");
		System.out.println("====================================");
		init();
	}

	private static void init() {
		 try {
			
	        int key = scanner.nextInt();
	        switch (key) {
	       
	            case 1:
	              
	                break;
	            case 2:
	         
	                break;
	            case 3:
	             
	                break;
	            
	            default : System.out.println("**Please Enter Valid Option**");
	            trainerMenu();
	            scanner.close();
	            case 0:
	                LogoutView.LogoutMessage();
	                break;
	        }
		 }	
		 }