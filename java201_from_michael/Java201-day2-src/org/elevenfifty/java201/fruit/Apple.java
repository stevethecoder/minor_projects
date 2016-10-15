package org.elevenfifty.java201.fruit;

public final class Apple extends Fruit implements Coreable {

	boolean cored;

	public Apple() {
		super("Apple");
	}

	@Override
	public void core() {
		if (!cored) {
			cored = true;
			System.out.println("Cored an " + getName());
		}
	}

	@Override
	public boolean isCored() {
		return cored;
	}

}
