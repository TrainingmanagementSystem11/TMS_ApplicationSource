package com.training.entities;
public class Courses{
	String courseName;
 private int course_Id;
 private int employee_Id;
 private int startDate;
 private int endDate;
public String getCourseName() {
	return courseName;
}
public void setCourseName(String courseName) {
	this.courseName = courseName;
}
public int getCourse_Id() {
	return course_Id;
}
public void setCourse_Id(int course_Id) {
	this.course_Id = course_Id;
}
public int getEmployee_Id() {
	return employee_Id;
}
public void setEmployee_Id(int employee_Id) {
	this.employee_Id = employee_Id;
}
public int getStartDate() {
	return startDate;
}
public void setStartDate(int startDate) {
	this.startDate = startDate;
}
public int getEndDate() {
	return endDate;
}
public void setEndDate(int endDate) {
	this.endDate = endDate;
}
@Override
public String toString() {
	return "Courses [courseName=" + courseName + ", course_Id=" + course_Id + ", employee_Id=" + employee_Id
			+ ", startDate=" + startDate + ", endDate=" + endDate + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((courseName == null) ? 0 : courseName.hashCode());
	result = prime * result + course_Id;
	result = prime * result + employee_Id;
	result = prime * result + endDate;
	result = prime * result + startDate;
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
	Courses other = (Courses) obj;
	if (courseName == null) {
		if (other.courseName != null)
			return false;
	} else if (!courseName.equals(other.courseName))
		return false;
	if (course_Id != other.course_Id)
		return false;
	if (employee_Id != other.employee_Id)
		return false;
	if (endDate != other.endDate)
		return false;
	if (startDate != other.startDate)
		return false;
	return true;
}
}