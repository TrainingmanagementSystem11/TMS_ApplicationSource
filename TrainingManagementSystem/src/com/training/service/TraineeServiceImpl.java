package com.training.service;

import java.util.ArrayList;
import java.util.List;

import com.training.dao.TraineeDAO;
import com.training.entities.Training;
import com.training.helper.FactoryEmployeeDB;
import com.training.model.FeedbackTraineeModel;
import com.training.model.FullTraineeModel;
import com.training.model.TraineeModel;

public class TraineeServiceImpl implements TraineeService {
	
		 

	    private TraineeDAO traineeDAO;
	    
	        public TraineeServiceImpl() {
	            this.traineeDAO=FactoryEmployeeDB.createTraineeDAO();
	            
	        }
 
	public boolean registerCourse(TraineeModel model)
	 {
	
	        Training training=new Training();
			training.setEmployeeId(model.getEmployeeId());
			training.setCourseName(model.getCourse_name());
			boolean result=false;
			try {
				boolean stored=traineeDAO.storecourseDetails(training);
				if(stored)
					result=true;
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
			    e.printStackTrace();
				System.out.println("!ERROR[Registration failed because of internal issues...]");
			}
			return result;
	 
	 
	 
	 }
	@Override
	 public boolean updatingfeedback(FeedbackTraineeModel model)
	 {
	   Training training=new Training();
	   training.setEmployeeId(model.getEmployee_id());
	   training.setCourseName(model.getCourse_name());
	   training.setFeedback(model.getFeedback());
	   boolean result=false;
		try {
	 			boolean updated=traineeDAO.uploadfeedback(training);
				if(updated)
					result=true;
			} catch (Exception e) {
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
				List<Training> employeesList=traineeDAO.getAllEmployees();
				for(Training training:employeesList) {
					
					TraineeModel traineeModel=new TraineeModel();
					traineeModel.setEmployee_id(training.getEmployeeId());
					traineeModel.setCourse_name(training.getCourseName());
		
					employeesModelList.add(traineeModel);
					
				}
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return employeesModelList;
		}
	 
	
	 
	 @Override
	 public boolean deleteCourse(TraineeModel model){
	   	List<TraineeModel> traineeList= retrieveEmployees();
			boolean result=false;
			boolean traineeFound=false;
			Training  training=new Training();
			for(TraineeModel traineeModel: traineeList) {
				if(traineeModel.getEmployeeId()==model.get
						EmployeeId()) {
					training.setEmployeeId(model.getEmployeeId());
					training.setCourseName(model.getCourse_name());
					traineeFound=true;
					break;
				}
			}
			if(traineeFound) {
			try {
				boolean deleted=traineeDAO.deleteNomineeDetails(training);
				if(deleted)
					result=true;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("!ERROR[Employee record deletion failed!!]");
			}	
			
		}
			else {
				try {
					throw new Exception("Course for Employee not found");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println("!ERROR[Employee with specified Course does not exist!!]");
				}
			}
			return result;
	   
	 
	 }
	 
	}

