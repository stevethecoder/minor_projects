package org.elevenfifty.collections;

public class Hyundai implements Automobile {
	String model;
	
	public Hyundai(String model) {
		this.model = model;
	}
	
	@Override
	public String getModel() {
		return model;
	}
	
	@Override
	public void drive() {
		System.out.println("Driving in my Hyundai " + model);
	}

	@Override
	public void brake() {
		System.out.println("Coming to a stop in my Hyundai " + model);
	}

	@Override
	public void honk() {
		System.out.println("Tooting my horn: " + model);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hyundai other = (Hyundai) obj;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		return true;
	}


	
	
}
