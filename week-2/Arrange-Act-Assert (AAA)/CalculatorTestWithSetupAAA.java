package com.example;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

public class CalculatorTestWithSetupAAA {
	private Calculator c;
		
	@Before
	public void setUp() {
		c=new Calculator();
		System.out.println("Setup : Calculator created");
	}
		
	@After
	public void tearDown() {
		c=null;
		System.out.println("Teardown : Calculator cleaned up");
	}
		
	@Test
	public void testAddPositive() { //Add 2 +ve numbers
		int res=c.add(12,3);
		assertEquals(15,res);
	}
	
	@Test
	public void testAddNegative() { //Add 2 -ve numbers
		int res=c.add(-13,-30);
		assertEquals(-43,res);
	}
	
	@Test
	public void testAdd1PosNeg() { //Add +ve and -ve number
		int res=c.add(-13,8);
		assertEquals(-5,res);
	}
}
