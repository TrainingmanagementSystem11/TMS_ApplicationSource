package com.training.model;

public class TraineeModel {
 private int employeeId;
 private String courseName;
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
	TraineeModel other = (TraineeModel) obj;
	if (courseName == null) {
		if (other.courseName != null)
			return false;
	} else if (!courseName.equals(other.courseName))
		return false;
	if (employeeId != other.employeeId)
		return false;
	return true;
}
@Override
public String toString() {
	return "TraineeModel [employeeId=" + employeeId + ", courseName=" + courseName + "]";
}
 
 
}
