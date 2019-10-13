package com.training.validation;

import java.util.ArrayList;
import java.util.List;

import com.training.model.TrainerModel;

public class TrainerModelValidator {
public boolean validate(TrainerModel model) {
		
		boolean result=false;
		
		if(validString(model.getCourseName()) &&validNumber(model.getTrainerId())
			&&	validNumber(model.getEmployeeId())){
			result=true;
		}
		return result;
	}



	public boolean validString(String val) {
		
		boolean result=false;
		char chars[]=val.toCharArray();
		List<Character> alphabets=new ArrayList<>();
		for(int i=97;i<=122;i++) {
			alphabets.add((char)i);
		}
		
		for(char ch:chars) {
			if(alphabets.contains(ch)) {
				result=true;
			}else {
				return false;
			}
		}
		return result;
	}
	public boolean validNumber(int number) {
		boolean result=false;
		String data=String.valueOf(number);
		if(data.matches(".*[0-9]")) {
			result=true;
		}
		return result;
	}
	
}
