package com.training.view;

import java.util.Scanner;

import com.training.controller.TrainerController;
import com.training.exception.ValidationException;
import com.training.model.PostTrainingDetailsModel;
<<<<<<< HEAD
import com.training.model.TrainerModel;
=======
import com.training.model.TrainerViewFeedbackModel;
>>>>>>> branch 'master' of https://github.com/TrainingmanagementSystem11/TMS_ApplicationSource
import com.training.validation.TrainerModelValidator;

public class TrainerMainView {
	public void mainMenu() {
		
		System.out.println("\n");
		System.out.println("\t \t ========Main Menu========");
		System.out.println("=>1. Post Training");
		System.out.println("=>2. View FeedBack");
		System.out.println("=>3. Exit");
		Scanner scanner=new Scanner(System.in);	
			System.out.print("\nOption:");
			int option=scanner.nextInt();
			
			switch(option) {
			
			case 1:
				postTraining();
			       break;
			case 2:viewFeedback();
				   break;
			case 3:System.exit(0);
				   break;			
			default:System.out.println("!ERROR[SELECT APPROPRIATE OPTION]");
			        mainMenu();
			}
	
	}

	private void viewFeedback() {
		// TODO Auto-generated method stub
				  
		  try(Scanner scanner=new Scanner(System.in);){
			  System.out.print("Please Enter Employee Id:");
			  int employeeId=scanner.nextInt();
			  
			  TrainerViewFeedbackModel model=new TrainerViewFeedbackModel();
			  model.setEmployeeId(employeeId);
			  TrainerController trainerController=new TrainerController();
			  trainerController.handleviewFeedbackDetails(model);
			  
			  
		  }catch(Exception e) {
			  e.printStackTrace();
		  }
		
	}


	private void postTraining() {
		// TODO Auto-generated method stub
		
		try(Scanner scanner=new Scanner(System.in);){
			
			int employeeId=0;
			System.out.print("Employee Id:");
			if(scanner.hasNextInt()) {
			employeeId=scanner.nextInt();
			}
			else {
				try {
					throw new ValidationException("[!ERROR:Invalid Employee Id]");
					}catch(ValidationException e) {
						System.out.println(e.getMessage());
						mainMenu();
					}
			}
			TrainerModelValidator validator=new TrainerModelValidator();
			System.out.print("Course Name:");
			String courseName=scanner.next();
			
			boolean validcourseName=validator.validcourseName(courseName);
			if(!validcourseName)
				try {
				throw new ValidationException("[!ERROR:Invalid CourseName]");
				}catch(ValidationException e) {
					System.out.println(e.getMessage());
					mainMenu();
				}
			
			PostTrainingDetailsModel model=new PostTrainingDetailsModel();
			model.setEmployeeId(employeeId);
<<<<<<< HEAD

			TrainerModel controller=new TrainerModel();
			controller.handleCourse(model);

=======
>>>>>>> branch 'master' of https://github.com/TrainingmanagementSystem11/TMS_ApplicationSource
			model.setCourseName(courseName);
			TrainerController controller=new TrainerController();
			controller.handlepostTrainingDetails(model);
<<<<<<< HEAD

=======
>>>>>>> branch 'master' of https://github.com/TrainingmanagementSystem11/TMS_ApplicationSource
			
		   mainMenu();
		}catch(Exception e) {
			System.out.println("!Error processing request. Please try again later");
		}
	}
}