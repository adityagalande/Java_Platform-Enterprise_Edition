package com.mile1.sevice;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;

public class StudentReport {

	public String findGrades(Student studentObject) {
		int[] arr = studentObject.getMark();
		int sum=0;
		String grade="F";
		for(int mark : arr) {
			if(mark < 35) {
				return grade;
			}else {
				sum += mark;
			}
		}
		
		if(sum < 150) {
			grade="C";
		}else if(sum < 200) {
			grade="B";
		}else if(sum < 250) {
			grade = "A";
		}else {
			grade="A+";
		}
//		studentObject.setGrade(grade);
		return grade;
	}
	
	public String Validate(Student s) throws NullNameException, NullMarksArrayException, NullStudentObjectException {
		
		if(s == null) {
			throw new NullStudentObjectException("NullStudentObjectException");
		}else if(s.getName() == null) {
			throw new NullNameException("NullNameException");
		}else if(s.getMark() == null) {
			throw new NullMarksArrayException("NullMarksArrayException");
		}
		
		return "Valid";
	}

}
