package org.elevenfifty.java201.battery;

public class AbstractBattery implements Battery {
	public static final Battery AlkalineAAA 
		= new AbstractBattery("AAA", "Alkaline");
	public static final Battery NiCDAAA 
		= new AbstractBattery("AAA", "NiCD");

	private String size;
	private String type;

	AbstractBattery(String size, String type) {
		this.size = size;
		this.type = type;
	}

	public String getSize() {
		return size.toString();
	}

	public String getType() {
		return type;
	}

}
