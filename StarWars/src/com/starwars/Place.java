package com.starwars;

abstract class Place {
	
	//class variables
	private final String name;
	private boolean isEmpire;
	
	//constructor
	protected Place (String n, boolean i) {
		name = n;
		isEmpire = i;
	}
	
	//getters + setter for isEmpire in case a place is conquered/liberated from empire
	protected String getName() {
		return this.name;
	}
	protected boolean getEmpire() {
		return isEmpire;
	}
	protected void setEmpire(boolean b) {
		isEmpire = b;
	}
	
	@Override
	public String toString() {
		return("Place: " + this.name + "\nPart of Empire?: " + this.isEmpire + "\n");
	}
	
}
