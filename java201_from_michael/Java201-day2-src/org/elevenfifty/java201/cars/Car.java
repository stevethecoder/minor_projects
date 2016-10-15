package org.elevenfifty.java201.cars;

public class Car extends Vehicle {
	protected int passengers;

	@Override
	public void printCapacity() {
		System.out.println("Holds " + passengers + " passengers");
	}
	
}
