package org.elevenfifty.java201;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotSame;

import org.elevenfifty.java201.fruit.Apple;
import org.junit.Test;

public class TestFruit {

	@Test
	public void testEquals() {
		Apple b = new Apple();
		b.setColor("Red");
		b.setOrigin("Indiana");
		
		Apple a = new Apple();
		a.setColor("Red");
		a.setOrigin("Indiana");
		
		assertNotSame(a, b);
		assertEquals(a, b);
	}
	
	@Test
	public void testNotEquals() {
		Apple b = new Apple();
		b.setColor("Red");
		b.setOrigin("Indiana");
		
		Apple a = new Apple();
		a.setColor("Yellow");
		a.setOrigin("Indiana");

		Apple c = new Apple();
		c.setColor("Red");
		c.setOrigin("Michigan");
		
		assertNotSame(a, b);
		assertNotSame(c, b);
		assertNotSame(a, c);
		assertNotEquals(a, b);
		assertNotEquals(c, b);
		assertNotEquals(a, c);
	}

}
