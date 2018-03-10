package com.giacomini.andrea.OCP.AdvancedClassDesign.CreatingNestedClasses;

import com.giacomini.andrea.OCP.AdvancedClassDesign.CreatingNestedClasses.Enclosing.Nested;

/*
 * N.B: L'ultimo tipo di classe innestata non è una classe inner. Una "static nested class" è una classe STATIC definita 
 *     	a livello di membro. Può essere istanziata senza un'oggetto della classe che la racchiude, per questo motivo non
 *     	può accedere alle variabili d'istanza senza uno specifico oggetto della classe che la racchiude. Per esempio, 
 *     	"new OuterClass().var" permette l'accesso alla variabile d'istanza "var".
 *     	In altre parole, è come una classe normale eccetto per i seguenti punti:
 *     
 *     		- L'innesto crea uno spazio dei nomi perché il nome della classe che la contiene deve essere usato per riferisi 
 *     		  ad essa;
 *     
 *     		- può essere resa PRIVATE oppure si può usare uno degli altri modificatori d'accesso per incapsularla;
 *     
 *     		- la classe che la racchiude può riferisi ai campi e ai metodi della classe innestata STATIC;
 *     
 *     	Guarda gli esempi: com.giacomini.andrea.OCP.AdvancedClassDesign.Test.TestNestedStaticClass;
 *     
 *     	N.B: E' permesso importare una classe innestata STATIC usando un regolare import. E' permesso usare sia il regolare
 *     		 import che l'import statico.
 *     
 *      Guarda gli esempi: com.giacomini.andrea.OCP.AdvancedClassDesign.Test.TestNestedStaticClass;
 *      				   com.giacomini.andrea.OCP.AdvancedClassDesign.Test2.Toucan;
 */

public class StaticNestedClasses {

	public static void main(String[] args){
		
	}
}

class Enclosing {
	
	// Classe innestata STATIC;
	static class Nested {
		
		private int price = 6;
	}
	
	public static void main(String[] args){
		
		Nested nested = new Nested();
		
		// N.B: La classe più esterna può accedere ai campi e ai metodi della classe STATIC innestata;
		System.out.println(nested.price);
	}
}
