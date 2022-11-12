package com.mile1.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;
import com.mile1.main.StudentMain;
import com.mile1.sevice.StudentReport;

class exceptionComputation {
	StudentMain sm = new StudentMain();
	StudentReport sr = new StudentReport();
	
	
	//If StudentObject is null then this test get successful	
	@Test
	public void testNullStudentObjectException() {
		
		//It will fail if thrown wrong exception OR dosen't throw any exception
		//It will pass only when it throw same exception which is expected exception			
		Exception exception = assertThrows(NullStudentObjectException.class, () -> {
			
			for(Student value : sm.data) {
				assertEquals("NullStudentObjectException", sr.Validate(value));
			}

		}, "Expected exception not matching to actual exception");	
	}
	

	//If name is null then this test get successful	
	@Test
	public void testNullNameException() {
		Exception exception = assertThrows(NullNameException.class, () ->{
			for(Student value : sm.data) {
				assertEquals("NullNameException", sr.Validate(value));
			}
		}, "Expected exception not matching to actual exception");
	}
	
	
	//If array is null then this test get successful
	@Test
	public void testNullMarksArrayException() {
		Exception exception = assertThrows(NullMarksArrayException.class, () ->{
			for(Student value : sm.data) {
				assertEquals("NullMarksArrayException", sr.Validate(value));
			}
		}, "Expected exception not matching to actual exception");
	}
	
	
}