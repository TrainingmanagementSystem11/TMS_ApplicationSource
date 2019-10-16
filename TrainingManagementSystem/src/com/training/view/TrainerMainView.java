package com.training.view;

import java.util.Scanner;

import com.training.controller.TrainerController;
import com.training.exception.ValidationException;
import com.training.model.PostTrainingDetailsModel;
import com.training.validation.TrainerModelValidator;

public class TrainerMainView {
	public void mainMenu() {
		
		System.out.println("\n");
		System.out.println("\t \t ========Main Menu========");
		System.out.println("=>1. Post Training");
		System.out.println("=>2. View FeedBack");
		System.out.println("=>3. Exit");
		try(Scanner scanner=new Scanner(System.in);){
			
			System.out.print("\nOption:");
			int option=scanner.nextInt();
			
			switch(option) {
			
			case 1:
				postTraining();
			       break;
			case 2:
				   break;
			case 3:System.exit(0);
				   break;			
			default:System.out.println("!ERROR[SELECT APPROPRIATE OPTION]");
			        mainMenu();
				  
			}
			
		}catch(Exception e) {
			
			System.out.println("!ERROR[SELECT APPROPRIATE OPTION]");
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
			model.setCourseName(courseName);
			TrainerController controller=new TrainerController();
			controller.handlepostTrainingDetails(model);
			
		   mainMenu();
		}catch(Exception e) {
			System.out.println("!Error processing request. Please try again later");
		}
	}
}