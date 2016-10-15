package org.elevenfifty.java201;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestMath {

	@Test
	public void testMaxIntInt() {
		assertEquals(30, Math.max(1, 30));
		assertEquals(30, Math.max(30, 1));
	}

	@Test
	public void testMinIntInt() {
		assertEquals(1, Math.min(1, 30));
		assertEquals(1, Math.min(30, 1));
		assertEquals(-30, Math.min(-30, 1));
	}
	
	@Test
	public void testCreateInteger() {
		assertEquals(123, new Integer(123).intValue());
		assertEquals(123, new Integer("123").intValue());
	}

}
