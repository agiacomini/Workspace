package com.giacomini.andrea.ClassDesign.IntroducingClassInheritance;

/*
 * N.B: Ogni classe figlia JAVA può usare qualsiasi membro PUBLIC o PROTECTED della classe padre, inclusi metodi, primitive o 
 * 		riferimenti ad oggetti. Se la classe padre e la classe figlia fanno parte anche dello stesso package allora, la classe
 * 		figlia potrà usare anche i membri default della classe padre.
 * 		Infine, una classe figlia non avrà mai accesso ad un membro PRIVATE della classe padre, nemmeno attraverso qualsiasi riferimento
 * 		diretto.
 * 		Come abbiamo già visto un membro PRIVATE può essere acceduto indirettamente da un membro PUBLIC o PROTECTED.
 * 		
 * 		Per riferirsi ad un membro in una classe padre, è possibiile chiamarla direttamente come la funzione di output 
 * 		"displaySharkDetails()" dell'esempio di seguito riportato.
 * 
 * 		Guarda gli esempi: com.giacomini.andrea.ClassDesign.IntroducingClassInheritance.Examples.Fish;
 * 						   com.giacomini.andrea.ClassDesign.IntroducingClassInheritance.Examples.Shark;
 * 
 *  	Come si è già visto nel capitolo "MethodsAndEncapsulation", si può usare la parola chiave "this" per accedere a membri della
 *  	classe stessa. E' possibile usare la parola chiave "this" anche per accedere ai membri della classe padre che sono
 *  	accedibili dalla classe figlia, dal momento che una classe figlia eredita tutti i membri della classe padre.
 *  	Si consideri la definizione alternativa del metodo "displaySharkDetails()" nell'esempio riportato di seguito.
 *  
 *  	Guarda gli esempi: com.giacomini.andrea.ClassDesign.IntroducingClassInheritance.Examples.Shark.displaySharkDetails2();
 *  
 *  	In JAVA è possibile riferisi esplicitamente ad un membro della classe padre usando la parola chiave "super".
 *  	Si consideri la definizione alternativa del metodo "displaySharkDetails()" nell'esempio riportato di seguito.
 *  
 *  	Guarda gli esempi: com.giacomini.andrea.ClassDesign.IntroducingClassInheritance.Examples.Shark.displaySharkDetails3();
 *  
 *   	Dati gli esempi di seguito riportati è possibile affermare che "this" e "super" possono essere usate entrambe per metodi 
 *   	e variabili definiti nella classe padre, ma solo la parola chiave "this" può essere usata per riferisi a metodi e variabili 
 *   	della classe corrente.
 *   
 *   	Vedremo più avanti che se la classe figlia "override" (scavalca) un membro della classe padre, allora le parole chiave
 *   	"this" e "super" possono avere differenti effetti quando applicati a membri della classe.
 */

public class CallingInheritedClassMembers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Fish {
	
	protected int size;
	private int age;
	
	// Costruttore
	public Fish(int age){
		this.age = age;
	}
	
	public int getAge(){
		return age;
	}
}

class Shark extends Fish{
	
	private int numberOfFins = 8;
	
	// Costruttore
	public Shark(int age){
		super(age);
		this.size = 4;
	}
	
	public void displaySharkDetails() {
		// Ci si riferisce direttamente ("getAge()" e "size") ad un memebro della classe padre;
		System.out.println("Shark with age: " + getAge());
		System.out.println("Shark with age: " + this.getAge());
		System.out.println("Shark with age: " + super.getAge());
		System.out.println(" and " + size + " meters long ");
		System.out.println(" and " + this.size + " meters long ");
		System.out.println(" and " + super.size + " meters long ");
		
		System.out.println(" with " + numberOfFins + " fins");
		System.out.println(" with " + this.numberOfFins + " fins");
//		System.out.println(" with " + super.numberOfFins + " fins");				NON COMPILA - "numberOfFins" non è un membro
//																								  della classe padre;
	}
}
