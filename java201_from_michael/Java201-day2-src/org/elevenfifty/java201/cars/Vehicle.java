package org.elevenfifty.java201.cars;

public abstract class Vehicle implements Drivable, HasCapacity {
	protected Integer year;
	protected String make;
	protected String model;

	@Override
	public void drive() {
		System.out.println("Driving around in my " + year + " " + make + " " + model + "!");
	}
	
	//public abstract void brake();

}
