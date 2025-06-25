package com.example.junit_example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void testAdd() {
		Calculator calc=new Calculator();
		int result=calc.add(3, 2);
		assertEquals(5,result);
	}

}
