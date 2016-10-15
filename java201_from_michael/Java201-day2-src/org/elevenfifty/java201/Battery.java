package org.elevenfifty.java201;

import static org.elevenfifty.java201.BatterySizes.AAA;

public enum Battery {
	AlkalineAAA(AAA, "Alkaline"), 
	LiOnAAA(AAA, "LiOn"), 
	NiCDAAA(AAA, "NiCD");

	private BatterySizes size;
	private String type;

	Battery(BatterySizes size, String type) {
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
