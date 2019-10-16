 package com.training.view;


import java.util.Date;
import java.util.List;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import javax.xml.bind.ValidationException;
import com.training.controller.AdminController;
import com.training.controller.TraineeController;
import com.training.model.AttendeesAdminModel;
import com.training.model.ScheduleAdminModel;
import com.training.model.TraineeModel;
import com.training.model.VenueAdminModel;
public class AdminView 
{
	static Scanner scanner=new Scanner(System.in);
	static AdminModelValidator adminModelValidator = new AdminModelValidator();
	static AdminController admincontroller  = new AdminController();
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
     
    System.out.println("Enter startDate(yyyy-mm-dd):");
    String start_date =scanner.next();
    Date datex = null;
    boolean flag = true;
	do
    {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
        try {
            datex=dateFormat.parse(start_date);
            flag=false;
        }
        catch(Exception e) {
            System.out.println("Enter valid date in specified format");
        }
    }
    while(flag);
	
	    System.out.println("Enter endDate(yyyy-mm-dd):");
	    String end_date =scanner.next();
	    Date datex1 = null;
	    boolean flag1 = true;
		do
	    {
	        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
	        try {
	            datex1=dateFormat.parse(end_date);
	            flag1=false;
	        }
	        catch(Exception e) {
	            System.out.println("Enter valid date in specified format");
	        }
	    }
	    while(flag);
		System.out.println("Enter course_name");
		String course_name =scanner.next();
		boolean validVenueName=adminModelValidator.validString(course_name);
        if(!validVenueName) {
			try {
				throw new ValidationException("Updated Successfully");
				}catch(ValidationException e) {
				 System.out.println(e.getMessage());
				}	}
		ScheduleAdminModel scheduleAdminModel = new ScheduleAdminModel();
		scheduleAdminModel.setStartDate(start_date);
		scheduleAdminModel.setEndDate(end_date);
		scheduleAdminModel.setCourse_name(course_name);
		admincontroller.updateDateController(scheduleAdminModel);
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
        VenueAdminModel venueAdminModel = new VenueAdminModel();
        venueAdminModel.setCourse_name(courseName);
        venueAdminModel.setVenue(venue);
        admincontroller.venueController(venueAdminModel);

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
         		AttendeesAdminModel adminModel = new AttendeesAdminModel();
         		adminModel.setCourseName(courseName);
                 admincontroller.numberOfAttendees(adminModel);
	}
	}

<<<<<<< HEAD
	private static void ViewHistory() {
		// TODO Auto-generated method stub
		
	}

	public void adminView() {
		// TODO Auto-generated method stub
		
	} 
}
  
=======
>>>>>>> branch 'master' of https://github.com/TrainingmanagementSystem11/TMS_ApplicationSource
