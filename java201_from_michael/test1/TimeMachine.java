package org.elevenfifty.java201.test1;

public class TimeMachine extends Clock {

	public void goBack() {
		setHour( getCurrentHour() - 2 );
	}
	
	public void print() {
		System.out.println("Time: " + getCurrentHour());
	}

}
