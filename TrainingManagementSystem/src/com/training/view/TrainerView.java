package com.training.view;

import com.training.model.PostTrainingDetailsModel;

public class TrainerView {
	
	private TrainerMainView mainView=new TrainerMainView();

	
public void showpostTrainingSuccess(PostTrainingDetailsModel model) {
		
		System.out.println("\n Updated successful for employee id=>"+model.getEmployeeId());
		mainView.mainMenu();
	}
	
	public void showpostTrainingFailure(PostTrainingDetailsModel model) {
		System.out.println("\n Update unsuccessful for employee id=>"+model.getEmployeeId());
		mainView.mainMenu();
	}
	
	public void validationFailedError() {
		  System.out.println("Data validation failed!!");
	  }
}
