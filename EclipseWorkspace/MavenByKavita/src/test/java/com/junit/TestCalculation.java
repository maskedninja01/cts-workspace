package com.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.cts.junit.Calculation;

public class TestCalculation {
	Calculation tc = new Calculation();
	
	@Test
	public void testAddition() {
		assertEquals(20,tc.addition(10,10));
	}
}
