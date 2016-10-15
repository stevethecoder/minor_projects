package org.elevenfifty.java201.cars;

public class RunCars {

	public static void main(String[] args) {
		Hyundai veloster = new Hyundai(2013, "Veloster", 4);

		if(veloster instanceof Car)
			System.out.println("Car");
		if(veloster instanceof Hyundai)
			System.out.println("Hyundai");
		if(veloster instanceof Vehicle)
			System.out.println("Vehicle");
		if(veloster instanceof Drivable)
			System.out.println("Drivable");
		
		veloster.drive();
		veloster.printCapacity();
		
		Truck f150 = new Ford(2002, "F150", 3000);
		
		f150.drive();
		f150.printCapacity();
		
		Truck ram = new Truck(2006, "Dodge", "Ram", 5000);
		
		
/*		if(veloster instanceof Car) {
			((Car)veloster).printCapacity();
		} else if(veloster instanceof Truck) {
			((Truck)veloster).printCapacity();
		}
*/		
		//veloster.printCapacity();
		//((Truck)veloster).printCapacity();

		driveToStore(veloster);
		driveToStore(f150);
		haul(f150);
		haulLoad(f150);
		haulLoad(ram);
	}
	
	public static void driveToStore(Drivable d) {
		d.drive();
		System.out.println("...all the way to the store");
	}
	
	public static void haul(Vehicle v) {
		v.drive();
		v.printCapacity();
	}
	
	public static void haulLoad(Truck t) {
		t.printCapacity();
		if(t.getMaxWeight() < 4000) {
			System.out.println("Your truck isn't tough enough");
		} else {
			t.drive();
		}
	}

}
