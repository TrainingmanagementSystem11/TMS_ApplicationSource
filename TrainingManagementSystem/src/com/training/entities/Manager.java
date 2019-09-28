package com.training.entities;

public class Manager extends User {
	
	public Manager() {
		
	}
		private String managerId;
		public String getManagerId() {
			return managerId;
		}
		public void setManagerId(String managerId) {
			this.managerId = managerId;
		}
		@Override
		public String toString() {
			return "Manager [managerId="+managerId+ "]";
		
		
		
	}
	
	
}
