package com.starwars;

public class Ship extends Place{
	//class variables
	private Place location;
	
	//super constructor + location param
	Ship(String n, Place p, boolean i) {
		super(n, i);
		location = p;
	}
	
	//getters + setter for location in case location changes
	public Place getLocation() {
			return location;
	}
	public void setLocation(Place p) {
			location = p;
	}
	
	@Override
	public String toString() {
		return ("Ship Name: " + getName() + "\nLocation: " + getLocation().getName() + "\nEmpire Ship?: " + getEmpire() + "\n");
	}
}
