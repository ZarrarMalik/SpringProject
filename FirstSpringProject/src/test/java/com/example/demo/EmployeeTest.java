package com.example.demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class EmployeeTest {
	Employee employee = new Employee();
	@Test
	public void shouldRetrunName() {
		String name = "Jenny";
		assertEquals(null,employee.geteName());
	}
	

}
