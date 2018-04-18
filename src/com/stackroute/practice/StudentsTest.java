package com.stackroute.practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StudentsTest1 {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		//Arrange
		Students s = new Students();
		int expectedValue = 4;
		//Set
		boolean actualValue = s.numberofStudents();
		//Assert
        assertEquals(expectedValue,actualValue);	
	}

}
