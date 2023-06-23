package com.starwars;

public class StarWars {

	public static void main(String[] args) {
		Place somewhere = new Place();
		
		Planet Dagobah = new Planet("Dagobah", false);
		
		Planet Alderaan= new Planet("Alderaan", true);
		
		Ship Millenium = new Ship("Millenium Falcon", "Unknown", false);
		
		Ship DeathStar = new Ship("Death Star", "Endor System", true);
		
		Jedi Yoda = new Jedi("Yoda","Dagobah", "Unknown", true);
		
		Jedi Luke = new Jedi("Luke", "Tatooine", "Ahch-To", true);
		
		Jedi Vader = new Jedi("Darth Vader", "Tatooine", "Unknown", false);
		
		Character Hans = new Character("Han Solo", "Corellia", "Mos Eisly", true);
		
		Character Leia = new Character("Princess Leia", "Alderaan", "Death Star", true);
		
		StormTrooper ST1 = new StormTrooper("Clone 001", "Kamino", "Death Star", true);
		StormTrooper ST2 = new StormTrooper("Clone 002", "Kamino", "Death Star", true);
		StormTrooper ST3 = new StormTrooper("Clone 003", "Kamino", "Death Star", true);
		StormTrooper ST4 = new StormTrooper("Clone 004", "Kamino", "Death Star", true);
		
		System.out.println(Yoda.toString() + Luke.toString() + Vader.toString() + 
						   Hans.toString() + Leia.toString() + ST1.toString() + 
						   ST2.toString() + ST3.toString() + ST4.toString());
		System.out.println(Alderaan.toString());
		System.out.println(DeathStar.toString());

	}

}
