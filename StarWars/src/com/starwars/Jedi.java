package com.starwars;

class Jedi extends Character{
	//sub class constructor
	public Jedi(String name, Planet homePlanet, Place location, boolean isAlive) {
		super(name, homePlanet, location, isAlive);
	}
	
	//Overridden toString
	@Override
	public String toString() {
		return("Jedi: " + getName() + "\nHome Planet: " + getHomePlanet().getName() + "\nCurrent Location: "
			   + getLocation().getName() + "\nAlive?: " + isAlive() + "\n");
	}

}
