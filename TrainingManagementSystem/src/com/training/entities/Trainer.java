package com.training.entities;

public class Trainer extends User{

	public Trainer() {
		
	}
		private String TrainerId;
		public String getTrainerId() {
			return TrainerId;
		}
		public void setTrainerId(String TrainerId) {
			this.TrainerId = TrainerId;
		}
		@Override
		public String toString() {
			return "Trainer [TrainerId="+TrainerId+ "]";
		}
}
	


