package com.training.model;

public class PostTrainingDetailsModel {

	private int employeeId;
	private String courseName;
	public PostTrainingDetailsModel() {
		
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	@Override
	public String toString() {
		return "PostTrainingDetailsModel [employeeId=" + employeeId + ", courseName=" + courseName
				+ ", getEmployeeId()=" + getEmployeeId() + ", getCourseName()=" + getCourseName() + ", hashCode()="
				+ hashCode() + ", getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((courseName == null) ? 0 : courseName.hashCode());
		result = prime * result + employeeId;
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
		PostTrainingDetailsModel other = (PostTrainingDetailsModel) obj;
		if (courseName == null) {
			if (other.courseName != null)
				return false;
		} else if (!courseName.equals(other.courseName))
			return false;
		if (employeeId != other.employeeId)
			return false;
		return true;
	}
}