package com.giacomini.andrea.BuildingBlocks.CreatingObjects;

/*
 * N.B: I costruttori vengono richiamati quando viene richiesta un'istanza di quella classe.
 * 		In particolare con lo statement "Constructor c = new Constructor();" stiamo dicendo a Java
 * 		il tipo (Constructor) che stiamo creando e inoltre stiamo dicendo che lo vorremmo referenziare attraverso 
 * 		una variabile "c" che ne conterrà il riferimento. Con la parola chiave "new" invece creiamo l'oggetto 
 * 		vero e proprio.
 * 
 *  	Non per tutte le classi sarà necessario creare un costruttore. Se non c'è un costruttore definito dall'utente
 *  	il compilatore, al momento di richiedere un istanza di una classe con la parola chiave "new", utilizzerà 
 *  	quello di default.
 */

public class Constructor {

	// Variabile d'istanza.
	int i = 0; // Inizializzazione in linea.
	String s = "Variabile d'istanza";
	
	/*
	 * N.B: Un costruttore è un particolare tipo di metodo:
	 * 		- ha lo stesso nome della classe;
	 * 		- non ha un tipo di ritorno;
	 * 
	 * 		Lo scopo di un costruttore è quello di inizializzare i campi della classe, ma possiamo anche metterci
	 * 		dell'altro codice.
	 * 
	 *  	L'inizializzazione dei campi può avvenire sia all'interno di un costruttore, ma anche direttamente in
	 *  	linea quando viene dichiarata la variabile.
	 */
	
	/*
	 * N.B: Tutto che che stà tra le parentesi graffe (braces) di un metodo viene chiamato "Code Block".
	 */
	public Constructor(){
		
		s = "stringa"; // Inizializzazione nel costruttore.
		System.out.println("In constructor");
	}
	
	public void Constructor(){
		System.out.println("Not in constructor");
	}
	
	/*
	 * N.B: E' possibile che i Code Blocks siano anche fuori da un metodo, come in questo caso.
	 * 		Questi blocchi vengono chiamati "Instance Initializer".
	 */
	{
		System.out.println("Instance Initializer");
	}
	
	static {
		
		System.out.println("Static Class Initializer");
		
	}
	
	/*
	 * N.B: L'ordine di inizializzazione dei campi è il seguente:
	 * 		- Instance Initializer Block;
	 * 		- Il costruttore;
	 * 		- Il metodo main;
	 * 
	 * 		Eseguire il programma per avere un'idea dell'ordine di inizializzazione dei campi.
	 */
	public static void main(String[] args){

		Constructor constructor = new Constructor();
		System.out.println(constructor.s);
		
		// Metodo "toString()" ereditato dall'oggetto Object. Object è il padre di tutte le classi;
		System.out.println(constructor.toString());
	}
}
