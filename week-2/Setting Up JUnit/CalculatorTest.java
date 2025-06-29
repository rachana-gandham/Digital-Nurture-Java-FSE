package com.example;

import static org.junit.Assert.*;
import org.junit.Test;


public class CalculatorTest {
	@Test
	public void testAdd() {
		Calculator c=new Calculator();
		int res=c.add(2,3);
		assertEquals(5,res);
	}
	@Test
	public void testAdd1() {
		Calculator c=new Calculator();
		int res=c.add(-13,-3);
		assertEquals(-16,res);
	}
	@Test
	public void testAdd2() {
		Calculator c=new Calculator();
		int res=c.add(-13,3);
		assertEquals(-10,res);
	}
}
