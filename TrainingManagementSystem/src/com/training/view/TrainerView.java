package com.training.view;

import com.training.model.PostTrainingDetailsModel;
import com.training.model.TrainerModel;

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
	
	public void showDeleteSuccess(TrainerModel model){
		System.out.println("\n Training details deleted for employee id=>"+model.getEmployeeId());
			
	}
	  public void showDeleteFailure(TrainerModel model){
			System.out.println("\n Training details deletion failed for employee id=>"+model.getEmployeeId());
	  }
	public void validationFailedError() {
		  System.out.println("Data validation failed!!");
	  }
}
