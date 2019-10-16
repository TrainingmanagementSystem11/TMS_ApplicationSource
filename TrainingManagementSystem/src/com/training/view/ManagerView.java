package com.training.view;

import java.util.Scanner;

import com.training.controller.ManagerController;

import com.training.model.StatusManagerModel;


public class ManagerView {
	public void ApproveorRejectStatus() {
		
		System.out.println("Welcome to TM system");
		try(Scanner scanner=new Scanner(System.in);){
			  System.out.print("Please Enter Employee Id:");
			  int employeeid=scanner.nextInt();
				System.out.print("Course Name:");
				String status=scanner.next();
				System.out.print("Enter Status:");
				StatusManagerModel model=new StatusManagerModel();
				  model.getEmployeeId();
                model.getCourseName();
                model.getStatus();
                ManagerController  managerController=new ManagerController();
    			managerController.handleApproval(model);
    			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}

