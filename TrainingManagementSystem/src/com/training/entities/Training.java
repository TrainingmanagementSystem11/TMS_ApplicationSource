package com.training.entities;

public class Training {
  private static int EmployeeId;
  private String courseName;
  private String status;
  private String Feedback;
public int getEmployeeId() {
	return EmployeeId;
}
public void setEmployeeId(int employeeId) {
	EmployeeId = employeeId;
}
public String getCourseName() {
	return courseName;
}
public void setCourseName(String courseName) {
	this.courseName = courseName;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public String getFeedback() {
	return Feedback;
}
public void setFeedback(String feedback) {
	Feedback = feedback;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + EmployeeId;
	result = prime * result + ((Feedback == null) ? 0 : Feedback.hashCode());
	result = prime * result + ((courseName == null) ? 0 : courseName.hashCode());
	result = prime * result + ((status == null) ? 0 : status.hashCode());
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
	Training other = (Training) obj;
	if (EmployeeId != other.EmployeeId)
		return false;
	if (Feedback == null) {
		if (other.Feedback != null)
			return false;
	} else if (!Feedback.equals(other.Feedback))
		return false;
	if (courseName == null) {
		if (other.courseName != null)
			return false;
	} else if (!courseName.equals(other.courseName))
		return false;
	if (status == null) {
		if (other.status != null)
			return false;
	} else if (!status.equals(other.status))
		return false;
	return true;
}
@Override
public String toString() {
	return "Training [EmployeeId=" + EmployeeId + ", courseName=" + courseName + ", status=" + status + ", Feedback="
			+ Feedback + "]";
}
  
}
