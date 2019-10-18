package com.training.entities;
<<<<<<< HEAD

=======
>>>>>>> branch 'master' of https://github.com/TrainingmanagementSystem11/TMS_ApplicationSource

public class Courses {
 private int courseId;
 private String courseName;
 private String startDate;
 private String endDate;
 private String Venue;
public int getCourseId() {
	return courseId;
}
public void setCourseId(int courseId) {
	this.courseId = courseId;
}
public String getCourseName() {
	return courseName;
}
public void setCourseName(String courseName) {
	this.courseName = courseName;
}
public String getStartDate() {
	return startDate;
}
public void setStartDate(String startDate) {
	this.startDate = startDate;
}
public String getEndDate() {
	return endDate;
}
public void setEndDate(String endDate) {
	this.endDate = endDate;
}
public String getVenue() {
	return Venue;
}
public void setVenue(String venue) {
	Venue = venue;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((Venue == null) ? 0 : Venue.hashCode());
	result = prime * result + courseId;
	result = prime * result + ((courseName == null) ? 0 : courseName.hashCode());
	result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
	result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
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
	if (Venue == null) {
		if (other.Venue != null)
			return false;
	} else if (!Venue.equals(other.Venue))
		return false;
	if (courseId != other.courseId)
		return false;
	if (courseName == null) {
		if (other.courseName != null)
			return false;
	} else if (!courseName.equals(other.courseName))
		return false;
	if (endDate == null) {
		if (other.endDate != null)
			return false;
	} else if (!endDate.equals(other.endDate))
		return false;
	if (startDate == null) {
		if (other.startDate != null)
			return false;
	} else if (!startDate.equals(other.startDate))
		return false;
	return true;
}
@Override
public String toString() {
	return "Courses [courseId=" + courseId + ", courseName=" + courseName + ", startDate=" + startDate + ", endDate="
			+ endDate + ", Venue=" + Venue + "]";
}
 
<<<<<<< HEAD
=======
}
/*public class Courses{
private	String courseName;
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
>>>>>>> branch 'master' of https://github.com/TrainingmanagementSystem11/TMS_ApplicationSource
}
<<<<<<< HEAD
=======
>>>>>>> branch 'master' of https://github.com/TrainingmanagementSystem11/TMS_ApplicationSource
*/
>>>>>>> branch 'master' of https://github.com/TrainingmanagementSystem11/TMS_ApplicationSource
