package org.elevenfifty.java201.cars;

public class Truck extends Vehicle {
	protected int maxWeight;
	
	public Truck(int year, String make, String model, int maxWeight) {
		this.year = year;
		this.make = make;
		this.model = model;
		this.maxWeight = maxWeight;
	}
	
	@Override
	public void printCapacity() {
		System.out.println("Holds up to " + maxWeight + " pounds");
	}
	
	public int getMaxWeight() {
		return maxWeight;
	}
}
