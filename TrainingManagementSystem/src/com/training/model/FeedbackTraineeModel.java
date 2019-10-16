package com.training.model;

public class FeedbackTraineeModel {
  private int employee_id;
  private String course_name;
  private String feedback;
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
	result = prime * result + ((course_name == null) ? 0 : course_name.hashCode());
	result = prime * result + employee_id;
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
	if (course_name == null) {
		if (other.course_name != null)
			return false;
	} else if (!course_name.equals(other.course_name))
		return false;
	if (employee_id != other.employee_id)
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
	return "FeedbackTraineeModel [employee_id=" + employee_id + ", course_name=" + course_name + ", feedback="
			+ feedback + "]";
}

} 
