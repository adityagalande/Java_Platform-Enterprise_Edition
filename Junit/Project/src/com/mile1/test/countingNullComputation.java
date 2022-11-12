package com.mile1.test;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.mile1.main.StudentMain;
import com.mile1.sevice.StudentService;

class countingNullComputation {

	StudentMain sm = new StudentMain();
	StudentService sv = new StudentService();
	
	@Test
	public void testNumberOfNullObjects() {
		int res = sv.findNumberOfNullObjects(sm.data);
		boolean val = false;
		if(res > 0) {
			val = true;
		}
		assertTrue(val);
	}
	
	
	@Test
	public void testNumberOfNullName() {
		int res = sv.findNumberOfNullName(sm.data);
		boolean val = false;
		
		if(res > 0) {
			val=true;
		}
		
		assertTrue(val);
	}

	
	@Test
	public void testNumberOfNullMarksArray() {
		int res = sv.findNumberOfNullMarksArray(sm.data);
		boolean val=false;
		
		if(res > 0) val=!val;
		
		assertTrue(val);
	}
}