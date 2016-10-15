package org.elevenfifty.java201;

import static java.lang.Math.pow;

public class HelloWorld {
	private final String bar = "Bar";
	private int m;
	private String t;

	public HelloWorld() {
		t = "DefaultValue";
	}
	
	public HelloWorld(String defaultValue) {
		t = defaultValue;
	}
	
	public HelloWorld(int m) {
		this.m = m;
	}
	
	public static void main(String[] args) {
		final String name = 
				args.length < 1 ? "Monkey" : args[0];

		System.out.println("Hello, " + name + "!");

		for (int i = 0; i < args.length; i++) {
			System.out.println(name + " " + args[i]);

		}

		// 12 ^ 2
		System.out.println(pow(12, 2));

		final int k;
		k = 1569959723;
		Integer c = null;

		long l = k;
		float f = k;
		double d = k;
		double g = f;
		// short h = (short)k;
		// System.out.println(h);

		System.out.println(Integer.valueOf(k).compareTo(11113));
		String s = String.valueOf(k);
		System.out.println(s);

		// i
		// new HelloWorld().foo();
		HelloWorld hw = new HelloWorld(23);
		hw.foo();
		hw.foo(k); // invoke foo(int)
		hw.foo(c);
	}

	public void foo(Integer k) {
		if (k != null)
			System.out.println(k - 1);
	}

	public void foo() {
		System.out.println("foo");
		System.out.println(bar);
		System.out.println(t);
		// name
		// i
	}

}
