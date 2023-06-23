package com.starwars;

public class Ship extends Place{
	//class variables
	public String name;
	public boolean isEmpire;
	public String location;
	
	//constructor
	public Ship(String n, String l, boolean b) {
		this.name = n;
		this.location = l;
		this.isEmpire = b;
	}
	
	//getters + setters
	public String getName() {
		return this.name;
	}
	public void setName(String n) {
		this.name = n;
	}
	public String getLocation() {
			return this.location;
	}
	public void setLocation(String l) {
			this.location = l;
	}
	public boolean getEmpire() {
		return this.isEmpire;
	}
	public void setEmpire(boolean e) {
		this.isEmpire = e;
	}
	@Override
	public String toString() {
		return ("Name: " + this.name + "\nLocation: " + this.location + "\nEmpire Ship?: " + this.isEmpire + "\n");
	}
}
