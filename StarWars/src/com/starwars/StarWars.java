package com.starwars;

public class StarWars {

	public static void main(String[] args) {
		Place Somewhere = new Place("Somewhere", false) {};
		
		Planet Dagobah = new Planet("Dagobah", false);
		Planet Alderaan= new Planet("Alderaan", true);
		
		Ship Millenium = new Ship("Millenium Falcon", Somewhere, false);
		Ship DeathStar = new Ship("Death Star", Somewhere, true);
		
		Jedi Yoda = new Jedi("Yoda", Dagobah, Somewhere, true);
		Jedi Luke = new Jedi("Luke", Dagobah, Somewhere, true);
		Jedi Vader = new Jedi("Darth Vader", Alderaan, Somewhere, false);
		
		Character Hans = new Character("Han Solo", Alderaan, Somewhere, true) {};
		Character Leia = new Character("Princess Leia", Alderaan, Somewhere, true) {};
		
		StormTrooper ST1 = new StormTrooper("Clone 001", Alderaan, Somewhere, true);
		StormTrooper ST2 = new StormTrooper("Clone 002", Alderaan, Somewhere, true);
		StormTrooper ST3 = new StormTrooper("Clone 003", Alderaan, Somewhere, true);
		StormTrooper ST4 = new StormTrooper("Clone 004", Alderaan, Somewhere, true);
		
		System.out.println(Yoda +"\n"+ Luke +"\n"+ Vader +"\n"+ Leia +"\n"+ Hans +"\n"+
						   ST1 +"\n"+ ST2 +"\n"+ ST3 +"\n"+ ST4);
		
	}
}
