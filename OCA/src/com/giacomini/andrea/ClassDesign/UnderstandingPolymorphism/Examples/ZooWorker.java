package com.giacomini.andrea.ClassDesign.UnderstandingPolymorphism.Examples;

public class ZooWorker {

	// Questo metodo è in grado di accettare oltre al tipo "Reptile", anche i suoi sotto-tipi (sotto-classi) "Alligator" e "Crocodile"
	public static void feed(Reptile reptile){
		System.out.println("Feeding reptile " + reptile.getName());
	}
	
	public static void main(String[] args){
		feed(new Alligator());						// Feeding reptile Alligator
		feed(new Crocodile());						// Feeding reptile Crocodile
		feed(new Reptile());						// Feeding reptile Reptile
	}
}
