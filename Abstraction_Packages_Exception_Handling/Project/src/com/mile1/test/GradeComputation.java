package com.mile1.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.mile1.bean.Student;
import com.mile1.main.StudentMain;
import com.mile1.sevice.StudentReport;

class GradeComputation {
	
	StudentReport sr = new StudentReport();
	StudentMain sm = new StudentMain();
	
	@Test
	public void testGradesA() {
			for(Student value : sm.data) {
				assertEquals("A", sr.findGrades(value));
			}
	}
	
	
	@Test
	public void testGradesC() {
			for(Student value : sm.data) {
				assertEquals("C", sr.findGrades(value));
			}
	}
	
	
	@Test
	public void testGradesF() {
			for(Student value : sm.data) {
				assertEquals("F", sr.findGrades(value));
			}
	}

}
