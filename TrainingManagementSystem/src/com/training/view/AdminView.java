package com.training.view;

import java.util.Scanner;
public class AdminView {

	public static void mainAdminMenu()
  {
		System.out.println("*Welocome to Admin HomePage**");
		System.out.println("====================================");
        System.out.println("1.View History");
        System.out.println("2.Schedule Training");
        System.out.println("3.Number Of Attendees");
        System.out.println("4.Add Venue");
        try(Scanner scanner=new Scanner(System.in);){
			System.out.print("\nOption:");
			int option=scanner.nextInt();
			
			switch(option) {     
			case 1:ViewHistory();
		       break;
		case 2:ScheduleTraining();
			   break;
		case 3:NumberOfAttendees();
			   break;
		case 4:AddVenue();
			   break;
		default:System.out.println("!ERROR[SELECT APPROPRIATE OPTION]");
		mainAdminMenu();  
     }
     }catch(Exception e) {
			
			System.out.println("!ERROR[SELECT APPROPRIATE OPTION]");
		}     
    }

	private static void AddVenue() {
		// TODO Auto-generated method stub
		
		
	}

	private static void NumberOfAttendees() {
		// TODO Auto-generated method stub
		
	}

	private static void ScheduleTraining() {
		// TODO Auto-generated method stub
		
	}

	private static void ViewHistory() {
		// TODO Auto-generated method stub
		
	} 
}
  
