package com.training.view;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

import com.training.controller.TrainerController;
import com.training.exception.ValidationException;
import com.training.model.TrainerModel;
import com.training.validation.TrainerModelValidator;

public class TrainerMainView {
	public void mainMenu() {
		System.out.println("\n");
		System.out.println("\t \t ========Main Menu========");
		System.out.println("=>1. Post Training");
		System.out.println("=>2. View FeedBack");
		System.out.println("=>3. Training Venue");
		System.out.println("=>4. Delete Training");
		System.out.println("=>5. Exit");
		try(Scanner scanner=new Scanner(System.in);){
			
			System.out.print("\nOption:");
			int option=scanner.nextInt();
			
			switch(option) {
			
			case 1:postTraining();
			       break;
			case 2:deleteTraining();
				 
				   break;
			case 3:
				   break;
			case 4:
				   break;
			case 5:System.exit(0);
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
	
			int trainerId=0;
			System.out.print("Trainer Id:");
			if(scanner.hasNextInt()) {
			trainerId=scanner.nextInt();
			}
			else {
				try {
					throw new ValidationException("[!ERROR:Invalid Trainer Id]");
					}catch(ValidationException e) {
						System.out.println(e.getMessage());
						mainMenu();
					}
			}
			
			int employeeId=0;
			System.out.print("employee Id:");
			if(scanner.hasNextInt()) {
			employeeId=scanner.nextInt();
			}
			else {
				try {
					throw new ValidationException("[!ERROR:Invalid employee Id]");
					}catch(ValidationException e) {
						System.out.println(e.getMessage());
						mainMenu();
					}
			}
			TrainerModelValidator validator=new TrainerModelValidator();
			
			System.out.print("Course Name:");
			String courseName=scanner.next();
			
			boolean validcourseName=validator.validString(courseName);
			if(!validcourseName)
				try {
				throw new ValidationException("[!ERROR:Invalid course Name]");
				}catch(ValidationException e) {
					System.out.println(e.getMessage());
					mainMenu();
				}
			
			System.out.print("Start Date(DD/MM/YYYY):");
			String startDateString=scanner.next();
			
StringTokenizer tokens=new StringTokenizer(startDateString,"/");
			
			List<String> tokensList=new ArrayList<>();
			while(tokens.hasMoreTokens()) {
				tokensList.add(tokens.nextToken());
			}
			
			int dayOfMonth=Integer.parseInt(tokensList.get(0));
			int month=Integer.parseInt(tokensList.get(1));
			int year=Integer.parseInt(tokensList.get(2));
			
			LocalDate startDate=LocalDate.of(year, month-1, dayOfMonth);
	
System.out.print("end Date(DD/MM/YYYY):");
String endDateString=scanner.next();

StringTokenizer tokens1=new StringTokenizer(endDateString,"/");

List<String> tokensList1=new ArrayList<>();
while(tokens1.hasMoreTokens()) {
	tokensList1.add(tokens1.nextToken());
}

int dayOfMonth1=Integer.parseInt(tokensList1.get(0));
int month1=Integer.parseInt(tokensList1.get(1));
int year1=Integer.parseInt(tokensList1.get(2));

LocalDate endDate=LocalDate.of(year1, month1-1, dayOfMonth1);

System.out.print("Venue:");
String venue=scanner.next();

TrainerModel model=new TrainerModel();
model.setTrainerId(trainerId);
model.setEmployeeId(employeeId);
model.setCourseName(courseName);
model.setStartDate(startDate);
model.setEndDate(endDate);
model.setVenue(venue);

TrainerController controller=new TrainerController();
controller. handlepostTrainingDetails(model);

mainMenu();
}
catch(Exception e) {

}
	}
	private void deleteTraining() {
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
			
			TrainerModel model=new TrainerModel();
			model.setEmployeeId(employeeId);
			TrainerModel controller=new TrainerModel();
			controller.handleCourse(model);
			
		   mainMenu();
		}catch(Exception e) {
			System.out.println("!Error processing request. Please try again later");
		}
	}
	}
	
