package com.giacomini.andrea.OCA.ClassDesign.ImplementingInterfaces.Examples;

public class Bear implements Herbivore, Omnivore {

	public void eatMeat(){
		System.out.println("Eating Meal");
	}
	
	public void eatPlants(){
		System.out.println("Eating Plants");
	}
}