package com.training.controller;


import com.training.helper.FactoryEmployeeDB;
import com.training.model.FeedbackTraineeModel;
import com.training.model.StatusManagerModel;
import com.training.model.TraineeModel;
import com.training.service.TraineeService;
//import com.training.validation.TrainerModelValidator;
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
		     System.out.println(model.getCourse_name());
		     System.out.println(model.getEmployee_id());
			
			boolean outcome=traineeService.registerCourse(model);
			if(outcome==true) {
				System.out.println("Course Selected Successfully"); 
			}else if(outcome==false){
				System.out.println("Course is not  enrolled"); 
			}
		else {
			System.out.println("Data Validation Failed"); 
		}
	}
		public void UpdateFeedback(FeedbackTraineeModel model){
			System.out.println(model.getCourse_name());
		     System.out.println(model.getEmployee_id());
		     System.out.println(model.getFeedback());
		  boolean outcome=traineeService.updatingfeedback(model);
		  System.out.println(outcome);
			if(outcome==true) {
				System.out.println("Feedback is successfully updated");
			}else {
				System.out.println("Feedback is failed to update");
			}}
		
		
	      public void handleDeleteCourse(int employee_id,String course_name){
	         boolean outcome=traineeService.deleteCourse(employee_id,course_name);
	         
			if(outcome==true){
				System.out.println("Nominee cancelled successfully");
			}else {
				System.out.println("Nominee is not cancelled successfully");
}
			
	      }
		public void handlestatus(int employee_id,String course_name) {
			// TODO Auto-generated method stub
			StatusManagerModel trainee=traineeService.viewStatus(employee_id,course_name);
			traineeView.displayStatus(trainee);
		
	     }

	 

}
