package org.elevenfifty.java201;

import java.util.ArrayList;
import java.util.List;

import org.elevenfifty.java201.fruit.Apple;
import org.elevenfifty.java201.fruit.Fruit;
import org.elevenfifty.java201.fruit.Lemon;
import org.elevenfifty.java201.fruit.Orange;
import org.elevenfifty.java201.fruit.Peelable;
import org.elevenfifty.java201.fruit.Strawberry;

public class FruitExample {

	public static void main(String[] args) {
		Apple a = new Apple();
		a.setColor("Red");
		a.setOrigin("Indiana");

		System.out.println(a.toString());
		a.core();

		Fruit f = new Strawberry();
		System.out.println(f);
		
		Apple[] apples = new Apple[5];
		List<Fruit> bucketOfApples = new ArrayList<>();
		bucketOfApples.add(new Apple());
		bucketOfApples.add(new Strawberry());
		
		Peelable l = new Lemon();
		Peelable o = new Orange();

		l.peel();
		l.peel();
		
		while(!o.isPeeled()) {
			o.peel();
		}
		
	}

}
