package com.starwars;

public class Character {
	//class variables
	public String name;	
	public String homePlanet;
	public String location;
	public boolean isAlive;
	
	//constructor
	public Character(String name, String homePlanet, String location, boolean isAlive) {
		this.name = name;
		this.homePlanet = homePlanet;
		this.location = location;
		this.isAlive = isAlive;
	}
	
	//getters + setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHomePlanet() {
		return homePlanet;
	}
	public void setHomePlanet(String homePlanet) {
		this.homePlanet = homePlanet;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public boolean isAlive() {
		return isAlive;
	}
	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}
	
	//Overridden toString
	@Override
	public String toString() {
		return("\nName: " + this.name + "\nHome Planet: " + this.homePlanet + "\nCurrent Location: "
			  + this.location + "\nAlive?: " + this.isAlive + "\n");
	}


	
	
}
