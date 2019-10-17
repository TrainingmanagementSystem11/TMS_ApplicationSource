package com.training.view;

import com.training.model.PostTrainingDetailsModel;
import com.training.model.TrainerViewFeedbackModel;
public class TrainerView {
	
	private TrainerMainView mainView=new TrainerMainView();

	
public void postTrainingSuccess(PostTrainingDetailsModel model) {
		
		System.out.println("\n Training Updated successful for employee id=>"+model.getEmployeeId());
		mainView.mainMenu();
	}
	
	public void postTrainingFailure(PostTrainingDetailsModel model) {

		System.out.println("\n Training Update unsuccessful for employee id=>"+model.getEmployeeId());
		mainView.mainMenu();
	}
	public void validationFailedError() {
		  System.out.println("Data validation failed!!");
	  }

	public void viewTrainingFeedbackSuccess(TrainerViewFeedbackModel model) {
		// TODO Auto-generated method stub
		System.out.println("\n View Feedback successful for employee id=>"+model.getEmployeeId());
		mainView.mainMenu();
	}

	public void viewTrainingFeedbackFailure(TrainerViewFeedbackModel model) {
		// TODO Auto-generated method stub
		System.out.println("\n View Feedback unsuccessful for employee id=>"+model.getEmployeeId());
		mainView.mainMenu();
		
	}
	
	
}

