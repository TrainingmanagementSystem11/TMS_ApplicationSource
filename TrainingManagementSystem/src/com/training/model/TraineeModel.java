package com.training.model;

public class TraineeModel {
 private int employee_id;
 private String course_name;
@Override
public String toString() {
	return "TraineeModel [employee_id=" + employee_id + ", course_name=" + course_name + "]";
}
public int getEmployee_id() {
	return employee_id;
}
public void setEmployee_id(int employee_id) {
	this.employee_id = employee_id;
}
public String getCourse_name() {
	return course_name;
}
public void setCourse_name(String course_name) {
	this.course_name = course_name;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((course_name == null) ? 0 : course_name.hashCode());
	result = prime * result + employee_id;
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
	
	if (course_name == null) {
		if (other.course_name != null)
			return false;
	} else if (!course_name.equals(other.course_name))
		return false;
	if (employee_id != other.employee_id)
		return false;
	return true;
}

}

