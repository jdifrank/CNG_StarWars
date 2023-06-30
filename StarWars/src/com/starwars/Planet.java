package com.starwars;

public class Planet extends Place{
	//Constructor
	public Planet(String n, boolean b) {
		super(n, b);
	}
	
	//Overridden toString
	@Override
	public String toString() {
		return("Planet Name: " + getName() + "\nPart of Empire?: " + getEmpire() + "\n");
	}

}
