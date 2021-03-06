package com.giacomini.andrea.MethodsAndEncapsulation.ApplyingAccessModifiers.Examples.goose;

import com.giacomini.andrea.MethodsAndEncapsulation.ApplyingAccessModifiers.Examples.duck.DuckTeacher;

public class LostDuckling {
	
	public void swim(){
		
		DuckTeacher teacher = new DuckTeacher();
		teacher.swim();											// All'interno di "LostDuckling" è possibile richiamare il metodo 
																// "swim()" della classe "DuckTeacher", dopo aver creato un'istanza 
																// di quella classe, in quanto il metodo "swim()" è stato etichettato
																// come PUBLIC e quindi richiamabile da qualsiasi posizione
																// all'interno dell'alberatura del progetto.
		
		System.out.println("Thanks " + teacher.name);			// Lo stesso discorso vale anche per il campo "name" della classe
																// "DuckTeacher".
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
