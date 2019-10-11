package com.training.view;

import java.util.Scanner;

public class AdminView {
	public static final Scanner scanner = new Scanner(System.in);
	public static void adminMenu()
{
		System.out.println("*Welocome to Admin HomePage**");
		System.out.println("====================================");
        System.out.println("1.View History");
        System.out.println("2.Schedule Training");
        System.out.println("3.Number Of Attendees");
        System.out.println("4.Add Venue");
        }
	     
	     switch(ch) {
	     case 1:
	    	 System.out.println(viewHistory);
	     case 2:
	    	 System.out.println(ScheduleTraining);
	     case 3:
		     System.out.println(NumberOfAttendees);
	     case 4:
		     System.out.println(Add Venue);
		  default
		  System.out.println(GoToBackHome));
	     }
	
	
}
