package com.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.cts.junit.EvenOrOdd;

public class TestEvenOdd {
	
	EvenOrOdd eo = new EvenOrOdd();
	@Test
	public void testEvenOdd() {
		assertEquals(true,eo.checkEvenOdd(16));
	}
	
	@Test
	public void testEvenOdd2() {
		assertEquals(false,eo.checkEvenOdd(15));
	}
}
