package com.training.view;
<<<<<<< HEAD

=======
>>>>>>> branch 'master' of https://github.com/TrainingmanagementSystem11/TMS_ApplicationSource

import java.util.Scanner;

import javax.xml.bind.ValidationException;

import com.training.controller.TraineeController;

import com.training.model.FeedbackTraineeModel;
import com.training.model.StatusManagerModel;
import com.training.model.TraineeModel;



public class TraineeView {
<<<<<<< HEAD

=======
>>>>>>> branch 'master' of https://github.com/TrainingmanagementSystem11/TMS_ApplicationSource
	public  void mainTraineeView() {
	  
		
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
				     checkstatus();
				   break;
			case 3:givefeedback();
				   break;
			case 4:cancelcourse();
				   break;
		
			case 5:System.exit(0);
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
			
			int employee_id=0;
			System.out.print("Employee Id:");
			
			employee_id=scanner.nextInt();
			System.out.print("Enter Course name:");
			String course_name=scanner.next();
			TraineeModel model=new TraineeModel();
			model.setEmployee_id(employee_id);
		    model.setCourse_name(course_name);
		    TraineeController controller=new TraineeController();
		    controller.handlecourse(model);
		    mainTraineeView();
			}catch(Exception e) 
	  {
				e.printStackTrace();
			}
		} 
	
	    public void checkstatus()
	    {
	      try(Scanner scanner=new Scanner(System.in);){
			
			int employee_id=0;
			System.out.print("Employee Id:");
			if(scanner.hasNextInt()) {
			employee_id=scanner.nextInt();
			System.out.print("Enter Course name:");
			String course_name=scanner.next();
				
			    TraineeController controller=new TraineeController();
			    controller.handlestatus(employee_id,course_name);
			    mainTraineeView();
		}}catch(Exception e) {
			
		}
	    }
	    public void givefeedback()
	    {
	      try(Scanner scanner=new Scanner(System.in);){
		
		int employee_id=0;
		System.out.print("Employee Id:");
		if(scanner.hasNextInt()) {
		employee_id=scanner.nextInt();
		System.out.println("Enter Course Name");
		String course_name=scanner.next();
		System.out.println("Give Feedback:");
		String feedback=scanner.next();
		FeedbackTraineeModel model=new FeedbackTraineeModel();
		 model.setEmployee_id(employee_id);
		 model.setCourse_name(course_name);
		 model.setFeedback(feedback);
		 TraineeController controller=new TraineeController();
		 controller.UpdateFeedback(model);
		 System.out.println(model);

		 mainTraineeView();
		}}catch(Exception e) {
			e.printStackTrace();
	    }
	    }
	   public void cancelcourse()
	    {
	       try(Scanner scanner=new Scanner(System.in);){
		
		int employee_id=0;
		System.out.print("Employee Id:");
		if(scanner.hasNextInt()) {
			employee_id=scanner.nextInt();
		System.out.println("Enter Course Name");
		String course_name=scanner.next();
	   
		TraineeController controller=new TraineeController();
		controller.handleDeleteCourse( employee_id, course_name);
	    mainTraineeView();
	}}catch(Exception e) {
		System.out.println("[!Error processing request. Please try again later]");
<<<<<<< HEAD
	}}
	public void displayStatus(StatusManagerModel trainee) {
		// TODO Auto-generated method stub
		System.out.println("Status is"+trainee.getStatus());
	}    
	
	
	   

}
	

=======
	}
	    }
}
	    
	   /* public void viewhistory()
	    {
	    }
       */

	
	
>>>>>>> branch 'master' of https://github.com/TrainingmanagementSystem11/TMS_ApplicationSource
