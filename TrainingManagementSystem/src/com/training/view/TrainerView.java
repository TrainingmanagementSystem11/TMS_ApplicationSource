package com.training.view;

import com.training.model.PostTrainingDetailsModel;

import com.training.model.TrainerModel;

import com.training.model.TrainerViewFeedbackModel;


public class TrainerView {
	
	private TrainerMainView mainView=new TrainerMainView();

	
public void postTrainingSuccess(PostTrainingDetailsModel model) {
		
		System.out.println("\n Training Updated successful for employee id=>"+model.getEmployeeId());
		mainView.mainMenu();
	}
	
	public void postTrainingFailure(PostTrainingDetailsModel model) {

		System.out.println("\n Training Update unsuccessful for employee id=>"+model.getEmployeeId());
=======
		System.out.println("\n Update unsuccessful for employee id=>"+model.getEmployeeId());

		mainView.mainMenu();
	}
	public void validationFailedError() {
		  System.out.println("Data validation failed!!");
	  }


	public void showFeedback(TrainerViewFeedbackModel models) {
		// TODO Auto-generated method stub
		 System.out.println("Feedback:"+models.getTrainerViewFeedbackModel().getFeedback()+"\n");
    }
		
	}



	
}

