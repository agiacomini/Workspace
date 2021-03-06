package com.giacomini.andrea.ClassDesign.IntroducingClassInheritance;

/*
 * N.B: Ereditare da una classe ci garantisce di avere accesso a membri PUBLIC e PROTECTED della classe padre(ereditata), ma
 * 		ci pone anche in situazioni di collisione quando si ha metodi definiti sia nella classe padre che nella classe figlia.
 * 		Vedremo ora alcune regole per l'ereditarietà dei metodi e come JAVA gestisce tali situazioni.
 * 
 * 
 *  	Overriding Methods:
 *  	Cosa succede quando un metodo è definito sia nella classe padre che nella classe figlia?
 *  	Si potrebbe voler ri-definire una nuova versione di un metodo esistente in una classe figlia che fa uso della definizione
 *  	della classe padre. In questo caso, è possibile "override" (scavalcare/superare) un metodo, dichiarando un nuovo metodo 
 *  	esattamente con la stessa firma e valore di ritorno del metodo che si sta override nella classe padre. Ricordiamo che la 
 *  	firma di un metodo è definita come il nome del metodo e la sua lista di parametri. 
 *  	Quando si fa l'override di un metodo, ci si può riferire alla sua versione della classe padre con la parola chiave "super".
 *  	In questo modo, le parole chiave "this" e "super" ci permettono di scegliere tra la versione corrente o la versione ereditata
 *  	rispettivamente del metodo in questione.
 *  
 *  	Il compilatore esegue i seguenti controlli quando si esegue un override di un metodo:
 *  
 *  		1- Il metodo nella classe figlia deve avere la stessa firma del metodo nella classe padre;
 *  
 *  		2- Il metodo nella classe figlia deve essere accedibile almeno come o più del metodo nella classe padre;
 *  
 *  		3- Il metodo nella classe figlia può non lanciare nessuna eccezione gestita invece dal metodo padre, oppure il metodo 
 *  		  figlio può gestire un'eccezione che sia sotto-classe dell'eccezione gestita dal metodo padre;
 *  		   
 *  		4- Se il metodo ritorna un valore, deve essere lo stesso o una sotto-classe del valore ritornato dal metodo della classe
 *  		  padre, conosciuto come "tipo di ritorno covariante";
 *  
 *   	Si ricorda dal capitolo "MethodsAndEncapsulation" che se due metodi hanno lo stesso nome ma firme diverse, allora si parla
 *   	di metodi "overloading" e non di "overriding". In questa situazione di overloading i metodi non sono legati tra di loro 
 *   	e non condividono nessuna proprietà.
 *   
 *   	Quando si è sicuri che si sta parlando di "Overriding", controllare che il modificatore d'accesso, il tipo di ritorno e
 *   	qualsiasi eccezione definita nel metodo siano compatibili tra il metodo figlio e il metodo padre.
 *   
 *    	Guarda gli esempi: com.giacomini.andrea.OCA.ClassDesign.IntroducingClassInheritance.Examples.Reptile;
 *    					   com.giacomini.andrea.OCA.ClassDesign.IntroducingClassInheritance.Examples.Snake;
 *    					   com.giacomini.andrea.OCA.ClassDesign.IntroducingClassInheritance.Examples.Camel;
 *    					   com.giacomini.andrea.OCA.ClassDesign.IntroducingClassInheritance.Examples.BactrianCamel;
 *    
 *    
 *    	RedeclaringPRIVATEMethods:
 *    	Ri-dichiarare (overriding) un metodo PRIVATE della classe padre non è possibile. Questo perché nella classe figlia
 *    	non è possibile accedere ad un metodo PRIVATE della classe padre.
 *    	Anche se non è possibile per una classe figlia accedere ad un metodo PRIVATE della classe padre, questo non significa che
 *    	la classe figlia non possa definire la sua personale versione del metodo. Significa solo, in senso stretto, che il nuovo metodo
 *    	non è una versione overriding del metodo della classe padre.  
 *      JAVA permette di ri-dichiarare un nuovo metodo nella classe figlia con la stessa firma oppure con firma diversa del metodo
 *      della classe padre. Questo metodo nella classe figlia è un metodo separato e indipendente, senza nessuna relazione con il 
 *      metodo della classe padre.
 *      
 *      
 *      HidingStaticMethods:
 *      Il "Hidden methods" avviene quando una classe figlia definisce un metodo statico con lo stesso nome e stessa firma
 *      del metodo statico della classe padre.
 *      Il "Methods Hiding" è simile ma non esattamente lo stesso del "Methods Overiding".
 *      Per il "Methods Hiding" valgono le quattro regole del "Methods Overiding", in più c'è anche una nuova regola che dice che
 *      la parola chiave STATIC deve essere la stessa tra la classe parent e la classe figlia.
 *      
 *      	5- Il metodo definito nella classe figlia deve essere marcato come STATIC se è marcato come STATIC nella classe 
 *      	   padre(hiding);
 *      	   Il metodo definito nella classe figlia NON deve essere marcato come STATIC se NON è marcato come STATIC nella 
 *      	   classe padre(overiding); 
 *  	
 *  	Guarda gli esempi: com.giacomini.andrea.OCA.ClassDesign.IntroducingClassInheritance.Examples.Bear;
 *  					   com.giacomini.andrea.OCA.ClassDesign.IntroducingClassInheritance.Examples.Panda;
 *  
 *  	OverridingVsHidingMethods:
 *  	Diversamente dal "Methods Overiding", dove un metodo della classe figlia sostituisce un metodo della classe padre nelle 
 *  	chiamate definite sia nel padre che nel figlio, il "Hiding Methods" sostituisce solo il metodo padre nelle chiamate definite
 *  	nella classe figlia.
 *  	A runtime la versione figlia di un metodo overiding è sempre eseguita per un'istanza inidipendentemente se la chiamata
 *  	del metodo è definita nel metodo di classe padre o figlia. In questa maniera, il metodo parent non è mai usato senza una
 *  	esplicita chimata al metodo parent sia referenziata, usando la sintassi "super.method()".
 *  	Alternativamente, a runtime la versione parent di un metodo hiding è sempre eseguita se la chiamata del metodo è
 *  	definita nella classe parent.
 *  
 *  	Guarda gli esempi: com.giacomini.andrea.OCA.ClassDesign.IntroducingClassInheritance.Examples.Marsupial;
 *  					   com.giacomini.andrea.OCA.ClassDesign.IntroducingClassInheritance.Examples.Kanagaroo;
 *  
 *  	Si noti che il metodo "isBiped()" ritorna FALSE nella classe padre, mentre ritorna TRUE nella classe figlia.
 *  	Per la prima chiamata del metodo, viene usato il metodo parent "getMarsupialDescription()". La classe Marsupial
 *  	conosce solo il metodo "isBiped()" della propria classe, per questo motivo stampa FALSE.
 *  	Nella seconda chiamata del metodo, il figlio esegue il metodo "isBiped()" che nasconde la versione parent del metodo
 *  	e ritorna TRUE.
 *  	Vediamo cosa succede invece se il metodo "isBiped()" è "overiding" invece che "hiding" nella classe figlia.
 *  	La chiamata al metodo "isBiped()" viene sostituita a runtime nella classe padre con la chiamata al metodo nella 
 *  	classe figlia.
 *   	Questo ultimo esempio fa uso del POLIMORFISMO (guarda il capitolo com.giacomini.andrea.OCA.ClassDesign.UnderstandingPolymorphism).
 *   
 *   
 *   	Creating FINAL method:
 *   	I metodi FINAL non posso essere "overridden". Mettendo a FINAL un metodo si proibisce ad una classe figlia di 
 *   	overriding il metodo FINAL della classe padre. Questa regola vale sia per l'"overriding" che per l'"hiding".
 *   	In altre parole, non è possibile hiding un metodo STATIC della classe parent se è marcata come FINAL.
 *   	E' irrilevante se il metodo overriding della classe figlia non usi la parola chiave FINAL, ritornerà comunque
 *   	un'errore di compilazione.
 *   
 *   	Guarda gli esempi: com.giacomini.andrea.OCA.ClassDesign.IntroducingClassInheritance.Examples.Bird;
 *   					   com.giacomini.andrea.OCA.ClassDesign.IntroducingClassInheritance.Examples.Penguin;
 */

public class InheritingMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}

class Canine{
	public double getAverageWeight(){
		return 50;
	}
}

class Wolf extends Canine{
	
	// Override il metodo "getAverageWeight()" della classe padre "Canine";
	public double getAverageWeight(){
		return super.getAverageWeight() + 20;
	}
	
	public static void main(String[] args){
		System.out.println(new Canine().getAverageWeight());
		System.out.println(new Wolf().getAverageWeight());
		
		System.out.println(new Wolf().toString());
	}
}
