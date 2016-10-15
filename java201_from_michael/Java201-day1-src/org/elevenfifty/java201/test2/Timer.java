package org.elevenfifty.java201.test2;

import org.elevenfifty.java201.test1.Clock;

public class Timer extends Clock {

	public void update() {
		addHour();
	}

	public void print() {
		System.out.println("Time: " + getCurrentHour());
	}
}
