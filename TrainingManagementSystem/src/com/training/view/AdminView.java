package com.training.view;


import java.util.Date;
import java.util.List;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import javax.xml.bind.ValidationException;

import com.training.controller.TraineeController;
import com.training.model.AdminModel;
import com.training.model.TraineeModel;
import com.virtusa.validation.EmployeesModelValidator;
public class AdminView 
{
	static Scanner scanner=new Scanner(System.in);
	public static void mainAdminMenu()
  {

		 System.out.println("*Welocome to Admin HomePage**");
		System.out.println("====================================");
        System.out.println("1.View History");
        System.out.println("2.Schedule Training");
        System.out.println("3.Number Of Attendees");
        System.out.println("4.Add Venue");
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
    try(Scanner scanner=new Scanner(System.in);){
			
			int startDate;
			int endDate;
			String courseName;
			System.out.print("startDate:");
			System.out.print("endDate:");
			System.out.print("courseName:");
			if(scanner.hasNextInt()) {
				startDate =scanner.nextInt();
				endDate =scanner.nextInt();
			}
			   else {
				try {
				throw new ValidationException("[!ERROR:Invalid Date]");
				}catch(ValidationException e) {
				 System.out.println(e.getMessage());
				}
				mainAdminMenu();  
			   }	
          }
     
    System.out.println("Enter Date(dd-mm-yyyy):");
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
                                 
	}
	

	public static void AddVenue() {
		// TODO Auto-generated method stub
		String courseName;
		String venue;
		System.out.print("courseName:");
		System.out.print("venue:");
		if(scanner.hasNextInt()) {
			courseName = scanner.nextLine();
			venue = scanner.nextLine();
		} else {
			try {
				throw new ValidationException("[!ERROR:Invalid courseName]");
				}catch(ValidationException e) {
				 System.out.println(e.getMessage());
				}
			     mainAdminMenu();  
		}
	}
	
	public static void NumberOfAttendees() {
		// TODO Auto-generated method stub
		
	}

	public void showstartDate(List<AdminModel> models) {
		// TODO Auto-generated method stub
		
	}

	
}

