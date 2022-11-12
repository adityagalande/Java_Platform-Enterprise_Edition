package com.mile1.sevice;

import com.mile1.bean.Student;

public class StudentService {
	
	public int findNumberOfNullMarksArray(Student[] s) {
		int c=0;
//		if(s != null) {  this is mistake -> handle null ss object in for loop.
			for(Student ss : s) {
				if(ss != null && ss.getMark() != null) {
					c++;
				}
			}
//		
		
		return c;
	}

	
	public int findNumberOfNullName(Student[] s) {
		int c=0;
//		if(s != null) {
			for(Student ss : s) {
				if(ss != null && ss.getName() != null) {
					c++;
				}
			}
//		}
		
		return c;
	}
	
	
	public int findNumberOfNullObjects(Student[] s) {
		int c=0;
		
		for(Student ss : s) {
			if(ss == null) {
				c++;
			}
		}
		return c;
	}
}
