package com.training.model;

public class FeedbackTraineeModel {
  private int employeeId;
  private String courseName;
  private String feedback;
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
public String getFeedback() {
	return feedback;
}
public void setFeedback(String feedback) {
	this.feedback = feedback;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((courseName == null) ? 0 : courseName.hashCode());
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
	FeedbackTraineeModel other = (FeedbackTraineeModel) obj;
	if (courseName == null) {
		if (other.courseName != null)
			return false;
	} else if (!courseName.equals(other.courseName))
		return false;
	if (employeeId != other.employeeId)
		return false;
	if (feedback == null) {
		if (other.feedback != null)
			return false;
	} else if (!feedback.equals(other.feedback))
		return false;
	return true;
}
@Override
public String toString() {
	return "FeedbackTraineeModel [employeeId=" + employeeId + ", courseName=" + courseName + ", feedback=" + feedback
			+ "]";
}
  
} 
