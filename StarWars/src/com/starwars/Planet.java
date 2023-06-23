package com.starwars;

public class Planet extends Place{
	//Constructor
	public Planet(String n, boolean b) {
		this.name = n;
		this.isEmpire = b;
	}
	//Overridden toString
	@Override
	public String toString() {
		return("Name: " + this.name + "\nPart of Empire?: " + this.isEmpire + "\n");
	}

}
