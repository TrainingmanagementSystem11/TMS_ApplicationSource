package com.training.model;

public class VenueAdminModel {
  private String venue;
  private String courseName;
public String getVenue() {
	return venue;
}
public void setVenue(String venue) {
	this.venue = venue;
}
public String getCourse_name() {
	return courseName;
}
public void setCourse_name(String course_name) {
	this.courseName = course_name;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((courseName == null) ? 0 : courseName.hashCode());
	result = prime * result + ((venue == null) ? 0 : venue.hashCode());
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
	VenueAdminModel other = (VenueAdminModel) obj;
	if (courseName == null) {
		if (other.courseName != null)
			return false;
	} else if (!courseName.equals(other.courseName))
		return false;
	if (venue == null) {
		if (other.venue != null)
			return false;
	} else if (!venue.equals(other.venue))
		return false;
	return true;
}
@Override
public String toString() {
	return "VenueAdminModel [venue=" + venue + ", course_name=" + courseName + "]";
}
 
}