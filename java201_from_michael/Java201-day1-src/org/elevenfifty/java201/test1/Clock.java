package org.elevenfifty.java201.test1;

public class Clock {
	private int now = 0;
	
	void setHour(int hour) {
		now = hour;
	}
	
	protected void addHour() {
		now++;
	}
	
	public int getCurrentHour() {
		return now;
	}
	
	
}
