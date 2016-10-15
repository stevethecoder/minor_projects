package org.elevenfifty.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Collections {

	public static void main(String[] args) {
		Automobile[] cars = new Automobile[1];
		cars[0] = new Hyundai("Elantra");
		
		List<Automobile> carList = new LinkedList<>();
		carList.add(new Hyundai("Veloster"));
		carList.add(new Hyundai("Elantra"));
		carList.add(new Hyundai("Elantra"));
		carList.add(new Hyundai("Genesis"));
		carList.add(new Hyundai("Elantra"));
		carList.add(new Hyundai("Elantra"));
		carList.get(3).drive();
		carList.remove(4);

		for(Automobile car : cars) {
			car.drive();
		}
		
		honkThoseHorns(carList);
		
		for(Automobile car : carList) {
			if("Veloster".equals(car.getModel())) {
				car.brake();
			}
		}
		
		
		Map<String, Automobile> carMap = new HashMap<>();
		carMap.put("Genesis", new Hyundai("Genesis"));
		carMap.put("Elantra", new Hyundai("Elantra"));
		carMap.put("foo", new Hyundai("Veloster Turbo"));
		
		carMap.get("Genesis").brake();
		carMap.get("foo").brake();
		
/*		for(Iterator<Automobile> itr = carCollection.iterator(); itr.hasNext(); ) {
			Automobile car = itr.next();
			itr.remove();
		}
*/		
	}
	
	public static void honkThoseHorns(Collection<? extends Automobile> cars) {
		for(Automobile car : cars) {
			car.honk();
		}
	}

}
