package com.training.controller;

import com.training.helper.FactoryEmployeeDB;
import com.training.model.FeedbackTraineeModel;
import com.training.model.TraineeModel;
import com.training.service.TraineeService;
import com.training.validation.TrainerModelValidator;
import com.training.view.TraineeView;

public class TraineeController {
	public TraineeService traineeService;
	TraineeView traineeView=new TraineeView();
 public TraineeController() {
	 this.traineeService=FactoryEmployeeDB.createTraineeService();
 }
	 public void handlecourse(TraineeModel model) {
		 
		    	
		//	TrainerModelValidator validator=new TrainerModelValidator();
					
			//if(validator.validate(model)) {
		     System.out.println(model.getCourseName());
		     System.out.println(model.getEmployeeId());
			
			boolean outcome=traineeService.registerCourse(model);
			if(outcome==true) {
				System.out.println("Course Selected Successfully"); 
			}else if(outcome==false){
				System.out.println("Course is not  enrolled"); 
			}
		else {
			System.out.println("Data Validation Failed"); 
		}
		//}
	/*	public void UpdateFeedback(FeedbackTraineeModel model){
		  String outcome=TraineeService.updatingfeedback(model);
			if(outcome.contentEquals("success")) {
				System.out.println("Feedback is successfully updated");
			}else {
				System.out.println("Feedback is failed to update");
			}}
	       public void handleDeleteCourse(TraineeModel model){
	         String outcome=traineeService.deleteCourse(model);
			if(outcome.contentEquals("success")) {
				System.out.println("Nominee cancelled successfully");
			}else {
				System.out.println("Nominee cancelled successfully");
}}	
		public void handlestatus(TraineeModel model) {
			// TODO Auto-generated method stub
			
	
}
*/
	 }
	 }
