package org.elevenfifty.java201.cars;

public class Ford extends Truck {

	public Ford(int year, String model, int maxWeight) {
		super(year, "Ford", model, maxWeight);
	}

	@Override
	public void drive() {
		super.drive();
		System.out.println(
				"Gotta love driving around in my Ford " + model + " carrying " + maxWeight + " of cargo in the back");
	}
}
