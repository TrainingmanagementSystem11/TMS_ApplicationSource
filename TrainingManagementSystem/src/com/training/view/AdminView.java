 package com.training.view;


import java.util.Date;
import java.util.List;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import javax.xml.bind.ValidationException;

import com.training.controller.AdminController;
import com.training.controller.TraineeController;
import com.training.model.AdminModel;
import com.training.model.TraineeModel;
public class AdminView 
{
	static Scanner scanner=new Scanner(System.in);
	static AdminModelValidator adminModelValidator = new AdminModelValidator();
	public static void mainAdminMenu()
  {

		 System.out.println("*Welocome to Admin HomePage**");
		System.out.println("====================================");
        System.out.println("1.Schedule Training");
        System.out.println("2.Number Of Attendees");
        System.out.println("3.Add Venue");
		    try{
			System.out.print("\nOption:");
			int option=scanner.nextInt();
			
			switch(option) {     
		
	     	case 1:ScheduleTraining();
			   break;
	    	case 2:NumberOfAttendees();
			   break;
		    case 3:AddVenue();
			   break;
    		default:System.out.println("!ERROR[SELECT APPROPRIATE OPTION]");
	           mainAdminMenu();  
      } 
     }catch(Exception e) {
			
			System.out.println("!ERROR[SELECT APPROPRIATE OPTION]");
		}     
    }
  
	private static void ScheduleTraining() {
		// TODO Auto-generated method stub
     
    System.out.println("Enter startDate(dd-mm-yyyy):");
    String date =scanner.next();
    Date datex = null;
    boolean flag = true;
	do
    {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
        try {
            datex=dateFormat.parse(date);
            flag=false;
        }
        catch(Exception e) {
            System.out.println("Enter valid date in specified format");
        }
    }
    while(flag);
	
	    System.out.println("Enter endDate(dd-mm-yyyy):");
	    String date1 =scanner.next();
	    Date datex1 = null;
	    boolean flag1 = true;
		do
	    {
	        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
	        try {
	            datex1=dateFormat.parse(date);
	            flag1=false;
	        }
	        catch(Exception e) {
	            System.out.println("Enter valid date in specified format");
	        }
	    }
	    while(flag);
		
	
	
	}
	

	public static void AddVenue() {
		// TODO Auto-generated method stub
		String courseName;
		String venue;
		System.out.print("courseName:");
		courseName = scanner.next();
		boolean validCourseName=adminModelValidator.validString(courseName);
        if(!validCourseName) {
			try {
				throw new ValidationException("[!ERROR:Invalid courseName]");
				}catch(ValidationException e) {
				 System.out.println(e.getMessage());
				 AddVenue();
				}
        }
		
		System.out.print("venue:");
		venue = scanner.next();
		boolean validVenueName=adminModelValidator.validString(venue);
        if(!validVenueName) {
			try {
				throw new ValidationException("[!ERROR:Invalid VenueName]");
				}catch(ValidationException e) {
				 System.out.println(e.getMessage());
				}
		 	
        }
	

		 }
	public static void NumberOfAttendees() {
		// TODO Auto-generated method stub
		String courseName;
		System.out.print("courseName:");
		courseName = scanner.next();
		boolean validCourseName=adminModelValidator.validString(courseName);
        if(!validCourseName) {
			try {
				throw new ValidationException("[!ERROR:Invalid courseName]");
				}catch(ValidationException e) {
				 System.out.println(e.getMessage());
			
				}
			
		
	}
                 AdminController admincontroller  = new AdminController();
                 admincontroller.numberOfAttendees();
	}
	}

