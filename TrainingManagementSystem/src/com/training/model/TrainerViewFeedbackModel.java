package com.training.model;

public class TrainerViewFeedbackModel {

	private int employeeId;
	private String feedback;

	public TrainerViewFeedbackModel() {
		
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedaback) {
		this.feedback = feedaback;
	}

	@Override
	public String toString() {
		return "TrainerViewFeedbackModel [employeeId=" + employeeId + ", feedback=" + feedback + ", getEmployeeId()="
				+ getEmployeeId() + ", getFeedaback()=" + getFeedback() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + employeeId;
		result = prime * result + ((feedback == null) ? 0 : feedback.hashCode());
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
		if (feedback == null) {
			if (other.feedback != null)
				return false;
		} else if (!feedback.equals(other.feedback))
			return false;
		return true;
	}
	
}