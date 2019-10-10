package com.training.controller;

import com.training.model.TraineeModel;
import com.training.service.TraineeService;

public class TraineeController {
	 public void handlecourse(TraineeModel model) {
			
			TraineeModelValidator validator=new TraineeModelValidator();
					
			if(validator.validate(model)) {
			
			String outcome=traineeService.registerCourse(model);
			if(outcome.contentEquals("selected")) {
				System.out.println("Course Selected Successfully"); 
			}else {
				System.out.println("Course is not  enrolled"); 
			}
		}else {
			System.out.println("Data Validation Failed"); 
		}
		}
		public void UpdateFeedback(TraineeModel model){
		  String outcome=TraineeService.updatingfeedback(model);
			if(outcome.contentEquals("success")) {
				System.out.println("Feedback is successfully updated");
			}else {
				System.out.println("Feedback is failed to update");
			}
	       public void handleDeleteCourse(TraineeModel model){
	         String outcome=traineeService.deleteCourse(model);
			if(outcome.contentEquals("success")) {
				System.out.println("Nominee cancelled successfully");
			}else {
				System.out.println("Nominee cancelled successfully");
			}}
			
	       public void handlestatus(TraineeModel model){
	         
	       
	       
	       
	       }
	       
	       
	       
	       
		

	     }
}
