package com.training.model;

public class AdminModel {
	
	private String startDate;
	private String endDate;
	private String venue;
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
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
	}
	  
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
	result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
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
		AdminModel other = (AdminModel) obj;
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
		if (venue == null) {
			if (other.venue != null)
				return false;
		} else if (!venue.equals(other.venue))
			return false;
		return true;
	}
@Override
	public String toString() {
		return "AdminModel [startDate=" + startDate + ", endDate=" + endDate + ", venue=" + venue + "]";
	}


}