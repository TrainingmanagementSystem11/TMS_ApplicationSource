package com.training.validation;

import java.util.ArrayList;
import java.util.List;

import com.training.model.TrainerModel;

public class TrainerModelValidator {
public boolean validate(TrainerModel model) {
		
		boolean result=false;
<<<<<<< HEAD
		

		if(validString(model.getCourseName()) &&validNumber(model.getEmployeeId())
if(validcourseName(model.getCourseName()) &&validNumber(model.getCourseId())

=======
		
		if(validcourseName(model.getCourseName()) &&validNumber(model.getCourseId())
>>>>>>> branch 'master' of https://github.com/TrainingmanagementSystem11/TMS_ApplicationSource
			&&	validNumber(model.getEmployeeId())){
			result=true;
		}
		return result;
	}

public boolean validcourseName(String courseName) { {
		
		boolean result=false;
		char chars[]=courseName.toCharArray();
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
