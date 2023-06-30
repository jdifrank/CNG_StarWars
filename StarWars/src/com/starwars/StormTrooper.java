package com.starwars;

class StormTrooper extends Character{
	//sub class constructor	
	public StormTrooper(String name, Planet homePlanet, Place location, boolean isAlive) {
		super(name, homePlanet, location, isAlive);
	}
	//Overridden toString
		@Override
		public String toString() {
			return("Stormtrooper: " + getName() + "\nHome Planet: " + getHomePlanet().getName() + "\nCurrent Location: "
				  + getLocation().getName() + "\nAlive?: " + isAlive() + "\n");
		}
}
