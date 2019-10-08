package com.training.user;

import java.util.Scanner;

import com.training.view.LoginView;

public class Main {
	static int role;
	static int key;
	public static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		menu();
	}
    public static void menu() {
    	
		try {
			
			System.out.println("Welcome to Training Management System ");
			System.out.println("  ---------**********Login***********--------- ");
			System.out.println();
			try {
				Thread.sleep(500);
		System.out.println("*******Please Select Anyone Option******");
		System.out.println("1.Admin Login ");
		System.out.println("2.Trainer Login");
		System.out.println("3.Manager Login");
		System.out.println("0.Exit");
		role=scanner.nextInt();
		switch(role) 
		{
		case 1:LoginView.adminLogin();
		break;
		case 2:LoginView.trainerLogin();
		break;
			default:System.out.println("*************Please Select valid Role**************");
			System.out.println();
			System.out.println();
			menu();
			case 0:exit();
			break;
		}
			}
		catch (Exception ex) {
	        System.err.println("Something went wrong");
	        System.err.println("**************Please try again*****************");
	        
	    }
			menu();
			
			}catch (Exception ex) {
	            System.err.println("Something went wrong");
	            ex.getMessage();
	            System.err.println("******************Please try again***************");}
		}
    
    private static void exit() {
        System.out.println("Thank you!");
        System.exit(0);
	}


	}


