package com.training.entities;

import java.time.LocalDate;

public class Trainer{
	private String firstName;
	private String lastName;
	private int courseId;
	private String courseName;
	private LocalDate startDate;
	private LocalDate endDate;
	private String venue;
	public Trainer() {
		
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
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
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	public String getVenue() {
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
	}
	@Override
	public String toString() {
		return "Trainer [firstName=" + firstName + ", lastName=" + lastName + ", courseId=" + courseId + ", courseName="
				+ courseName + ", startDate=" + startDate + ", endDate=" + endDate + ", venue=" + venue + "]";
	}
	
}