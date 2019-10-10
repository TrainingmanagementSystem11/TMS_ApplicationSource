package com.training.service;

import java.util.ArrayList;
import java.util.List;

import com.training.dao.TraineeDAO;
import com.training.model.TraineeModel;

public class TraineeServiceImpl {
	public String registerCourse(TraineeModel model)
	 {
	        Training training=new Training();
			training.setEmployeeId(model.getEmployeeId());
			training.setCourseName(model.getcourseName());
			String result="fail";
			try {
				boolean stored=TraineeDAO.storeCourseDetails(training);
				if(stored)
					result="success";
				
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("!ERROR[Registration failed because of internal issues...]");
			}
			return result;
	 
	 
	 
	 }
	 @Override
	 public String updatingfeedback(TraineeModel model)
	 {
	   Training training=new Training();
	   training.setEmployeeId(model.getEmployeeId());
	   training.setCourseName(model.getcourseName());
	   training.setfeedback(model.getfeedback());
	   String result="fail";
		try {
				boolean updated=TraineeDAO.uploadfeedback(training);
				if(updated)
					result="success";
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("!ERROR[Feedback updation failed!!]");
			}
			return result;
	 
	 }
	 @Override
		public List<TraineeModel> retrieveEmployees() {
			// TODO Auto-generated method stub
			List<TraineeModel> employeesModelList=new ArrayList<>();
			try {
				List<Training> employeesList=traineeDAO.getAllEmployeesCourse();
				for(Training training:employeesList) {
					
					TraineeModel traineeModel=new TraineeModel();
					traineeModel.setEmployeeId(training.getEmployeeId());
					traineeModel.setCourseName(training.getCourseName());
					traineeModel.setStatus(training.getSalary());				
					traineeModel.setFeedback(training.getFeedback());
					employeesModelList.add(traineeModel);
					
				}
				
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return employeesModelList;
		}
	 
	 
	 
	 @Override
	 public String deleteCourse(TraineeModel model){
	   	List<TraineeModel> traineeList= retrieveEmployees();
			String result="fail";
			boolean traineeFound=false;
			Training  training=new Training();
			for(TraineeModel traineeModel: traineeList) {
				if(traineeModel.getEmployeeId()==model.getEmployeeId()) {
					training.setEmployeeId(model.getEmployeeId());
					training.setCourseName(model.getCourseName());
					traineeFound=true;
					break;
				}
			}
			if(traineeFound) {
			try {
				boolean deleted=traineeDAO.deleteNomineeDetails(training);
				if(deleted)
					result="success";
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("!ERROR[Employee record deletion failed!!]");
			}	
			
		}
			else {
				try {
					throw new NoEmployeeFoundException("Course for Employee not found");
				} catch (NoEmployeeFoundException e) {
					// TODO Auto-generated catch block
					System.out.println("!ERROR[Employee with specified Course does not exist!!]");
				}
			}
			return result;
	   
	 
	 }
	 
	}
}
