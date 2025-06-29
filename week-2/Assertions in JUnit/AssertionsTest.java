package com.example;

import static org.junit.Assert.*;
import org.junit.Test;
public class AssertionsTest {
		@Test
		public void testAssertions() {
			assertEquals(13,5+8);
			assertTrue(8>3);
			assertFalse(14>17);
			assertNull(null);
			assertNotNull(new Object());
		}

}
