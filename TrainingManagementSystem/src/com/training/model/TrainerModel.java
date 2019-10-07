package com.training.model;

public class TrainerModel {
	private String trainerId;
	private String trainerpassword;
 public TrainerModel() {
	 
 }
public String getTrainerId() {
	return trainerId;
}
public void setTrainerId(String trainerId) {
	this.trainerId = trainerId;
}
public String getTrainerpassword() {
	return trainerpassword;
}
public void setTrainerpassword(String trainerpassword) {
	this.trainerpassword = trainerpassword;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((trainerId == null) ? 0 : trainerId.hashCode());
	result = prime * result + ((trainerpassword == null) ? 0 : trainerpassword.hashCode());
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
	TrainerModel other = (TrainerModel) obj;
	if (trainerId == null) {
		if (other.trainerId != null)
			return false;
	} else if (!trainerId.equals(other.trainerId))
		return false;
	if (trainerpassword == null) {
		if (other.trainerpassword != null)
			return false;
	} else if (!trainerpassword.equals(other.trainerpassword))
		return false;
	return true;
}
@Override
public String toString() {
	return "TrainerModel [trainerId=" + trainerId + ", trainerpassword=" + trainerpassword + ", getTrainerId()="
			+ getTrainerId() + ", getTrainerpassword()=" + getTrainerpassword() + ", hashCode()=" + hashCode()
			+ ", getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
}
}
