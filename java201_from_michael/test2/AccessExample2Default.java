package org.elevenfifty.java201.test2;

import org.elevenfifty.java201.test1.AccessExample1Public;

class AccessExample2Default extends AccessExample1Public {
	private String puppy = "Boo";
	protected String kitty = "Meow";
	
	public String getS() {
		return puppy;
	}
	
	public void printAccessExample1() {
		//AccessExample1Public example1 = new AccessExample1Public();
		System.out.println( getS() );
		System.out.println( super.getS() );

		System.out.println( bird );
		
	}
	
}
