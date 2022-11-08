package com.wipro.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import com.wipro.task.*;
class TestStringConcat {
	
	DailyTasks DT = new DailyTasks();
	
	@Test
	public void testStringConcat() {
		assertEquals("AB CD", DT.doStringConcat("AB","CD"));
	}
	
}
