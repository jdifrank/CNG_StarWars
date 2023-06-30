package com.starwars;


abstract class Character {
	//class variables
	private final String name;	
	private final Planet homePlanet;
	private Place location;
	private boolean isAlive;
	
	//constructor
	protected Character(String n, Planet p, Place l, boolean a) {
		name = n;
		homePlanet = p;
		location = l;
		isAlive = a;
	}
	
	//getters + setters for location and isAlive in case character moves locations or dies
	protected String getName() {
		return name;
	}
	protected Planet getHomePlanet() {
		return homePlanet;
	}

	protected Place getLocation() {
		return location;
	}
	protected void setLocation(Place p) {
		location = p;
	}
	protected boolean isAlive() {
		return isAlive;
	}
	protected void isAlive(boolean b) {
		isAlive = b;
	}
	
	//Overridden toString
	@Override
	public String toString() {
		return("Character: " + name + "\nHome Planet: " + (homePlanet.getName()) + "\nCurrent Location: "
			  + location.getName() + "\nAlive?: " + isAlive() + "\n");
	}
}
