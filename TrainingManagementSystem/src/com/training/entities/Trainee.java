package com.training.entities;

public class Trainee extends Employee {
	
	public Trainee() {
		
	}
		private String TraineeId;
		public String getTraineeId() {
			return TraineeId;
		}
		public void setTraineeId(String TraineeId) {
			this.TraineeId = TraineeId;
		}
		@Override
		public String toString() {
			return "Trainee [TraineeId="+TraineeId+ "]";
		}
}