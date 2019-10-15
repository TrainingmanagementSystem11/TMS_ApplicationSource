package com.training.view;

import java.util.Scanner;

import com.training.controller.TraineeController;

import com.training.model.FeedbackTraineeModel;
import com.training.model.TraineeModel;


public class TraineeView {
	public void mainTraineeView() {
	  
		
		System.out.println("\n");
		System.out.println("\t \t ========Main Menu========");
		System.out.println("=>1.Select Course ");
		System.out.println("=>2. Check Status");
		System.out.println("=>3. Give Feedback");
		System.out.println("=>4. Cancel Course");
		System.out.println("=>5. View History");
		System.out.println("=>6. Exit");
		try(Scanner scanner=new Scanner(System.in);){
			
			System.out.print("\nOption:");
			int option=scanner.nextInt();
			
			switch(option) {
			
			case 1:selectcourse();
			       break;
			case 2:
				  // checkstatus();
				   break;
			case 3://givefeedback();
				   break;
			case 4://cancelcourse();
				   break;
			case 5://viewhistory();
				   break;
			case 6:System.exit(0);
			        break;
			default:System.out.println("!ERROR[SELECT APPROPRIATE OPTION]");
			        mainTraineeView();
				  
			}
			
		}catch(Exception e) {
			
			System.out.println("!ERROR[SELECT APPROPRIATE OPTION]");
		}
		
	}
	public void selectcourse()
	{
	  try(Scanner scanner=new Scanner(System.in);){
			
			int employeeId=0;
			System.out.print("Employee Id:");
			
			employeeId=scanner.nextInt();
			System.out.print("Enter Course name:");
			String courseName=scanner.next();
			TraineeModel model=new TraineeModel();
			model.setEmployeeId(employeeId);
		    model.setCourseName(courseName);
		    TraineeController controller=new TraineeController();
		    controller.handlecourse(model);
		    mainTraineeView();
			}catch(Exception e) 
	  {
				e.printStackTrace();
			}
		} 
	
	 /*   public void checkstatus()
	    {
	      try(Scanner scanner=new Scanner(System.in);){
			
			int employeeId=0;
			System.out.print("Employee Id:");
			if(scanner.hasNextInt()) {
			employeeId=scanner.nextInt();
			System.out.print("Enter Course name:");
			String courseName=scanner.next();
				TraineeModel  model=new TraineeModel();
				model.setEmployeeId(employeeId);
			    model.setCourseName(courseName);
			    TraineeController controller=new TraineeController();
			    controller.handlestatus(model);
			    mainTraineeView();
		}}catch(Exception e) {
			
		}
	    }
	    public void givefeedback()
	    {
	      try(Scanner scanner=new Scanner(System.in);){
		
		int employeeId=0;
		System.out.print("Employee Id:");
		if(scanner.hasNextInt()) {
		employeeId=scanner.nextInt();
		System.out.println("Enter Course Name");
		String course=scanner.next();
		System.out.println("Give Feedback:");
		String feedback=scanner.next();
		FeedbackTraineeModel model=new FeedbackTraineeModel();
		 model.setEmployeeId(employeeId);
		 model.setCourseName(course);
		 model.setFeedback(feedback);
		 TraineeController controller=new TraineeController();
		 controller.UpdateFeedback(model);
		 mainTraineeView();
		}}catch(Exception e) {
			
	    }
	    }
	    public void cancelcourse()
	    {
	       try(Scanner scanner=new Scanner(System.in);){
		
		int employeeId=0;
		System.out.print("Employee Id:");
		if(scanner.hasNextInt()) {
		employeeId=scanner.nextInt();
		System.out.println("Enter Course Name");
		String course=scanner.next();
	    TraineeModel model=new TraineeModel();
		model.setEmployeeId(employeeId);
	    model.setCourseName(course);
		TraineeController controller=new TraineeController();
		controller.handleDeleteCourse(model);
	    mainTraineeView();
	}}catch(Exception e) {
		System.out.println("[!Error processing request. Please try again later]");
	}
	    }
	    public void viewhistory()
	    {
	    }
       */ 
    }	