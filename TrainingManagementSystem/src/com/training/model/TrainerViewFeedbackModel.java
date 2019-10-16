package com.training.model;

public class TrainerViewFeedbackModel {

	private int employeeId;
	private String feedaback;

	public TrainerViewFeedbackModel() {
		
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getFeedaback() {
		return feedaback;
	}

	public void setFeedaback(String feedaback) {
		this.feedaback = feedaback;
	}

	@Override
	public String toString() {
		return "TrainerViewFeedbackModel [employeeId=" + employeeId + ", feedaback=" + feedaback + ", getEmployeeId()="
				+ getEmployeeId() + ", getFeedaback()=" + getFeedaback() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + employeeId;
		result = prime * result + ((feedaback == null) ? 0 : feedaback.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TrainerViewFeedbackModel other = (TrainerViewFeedbackModel) obj;
		if (employeeId != other.employeeId)
			return false;
		if (feedaback == null) {
			if (other.feedaback != null)
				return false;
		} else if (!feedaback.equals(other.feedaback))
			return false;
		return true;
	}
	
}