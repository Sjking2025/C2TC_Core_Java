package com.tnsif.packagetest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
	public Calculator calculator;
	
	//This runs before every single @test Method
	@BeforeEach
	void setUp() {
		calculator = new Calculator();
	}
	@Test
	@DisplayName("1 + 1 should equal 2")
	void testAddition() {
		int result = calculator.add(1, 1);
	// Assertions verify the expected vs actual value
	assertEquals(2, result, "The addition result should be 2");
	}
	
	
	@Test
	@DisplayName("Should throw exception when dividing by zero")
	void testDivisionByZero() {
		//Assertions can also check if the correct exception is thrown
		assertThrows(ArithmeticException.class,()->{
			calculator.divide(10,0);
		});
	}
	

}
