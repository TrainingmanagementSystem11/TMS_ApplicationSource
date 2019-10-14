package com.training.entities;

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
 
}
