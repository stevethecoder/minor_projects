package org.elevenfifty.java201;

import static org.junit.Assert.*;

import org.junit.Test;

public class ObjectTest {

	@Test
	public void testIntEquals() {
		int a = 2;
		int b = 2;
		
		assertTrue(a == b);
	}

	@Test
	public void testIntegerEquals() {
		Integer a = new Integer(2);
		Integer b = new Integer(2);
		
		assertTrue(a.equals(b));
		assertFalse(a == b);
		assertTrue(a.hashCode() == b.hashCode());
	}
	
	@Test
	public void testIntegerEquals2() {
		Integer a = Integer.valueOf(2);
		Integer b = Integer.valueOf(2);
		
		assertTrue(a.equals(b));
		assertTrue(a == b);
	}
	
	@Test
	public void testObjectEquals() {
		Object o1 = new Object();
		Object o2 = new Object();
		
		//assertTrue(o1 == o1);
		assertTrue(o1.equals(o1));
		assertFalse(o1.equals(o2));
	}
	
	@Test
	public void testEqualsNull() {
		String s = "Foo";
		String t = null;
		
		"Foo".equals(t);
		s.equals(t);
	}
	
}
