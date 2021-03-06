package com.giacomini.andrea.MethodsAndEncapsulation.CreatingConstructor;

/*
 * N.B: E' possibile avevre più costruttori nella stessa classe, con firme diverse.
 * 		Si parla quindi di "overloading" dei costruttori, infatti i nomi dei costruttori sono gli stessi visto che devono
 * 		essere tutti dello stesso nome della classe. L'unica cosa che li distingue è l'ordine della lista dei parametri.
 * 
 * 		E' possibile anche unire (in una catena) le chiamate ai diversi costruttori (constructor chaining).
 * 
 *  	public class Mouse{
 *  
 *  		private int numTeeth;
 *  		private int numWhiskers;
 *  		private int weight;
 *  
 *  		public Mouse(int weight){
 *  			
 *  			this(weight, 16);					// chiama il construttore con due parametri
 *  		}
 *  
 *  		public Mouse(int weight, int numTeeth){
 *  
 *  			this(weight, numTeeth, 6);			// chiama il costruttore con tre parametri
 *  		}
 *  
 *  		public Mouse(int weight, int numTeeth, int numWhiskers){
 *  
 *  			this.weight = weight;
 *  			this.numTeeth = numTeeth;
 *  			this.numWhiskers = numWhiskers;
 *  		}
 *  
 *  		public void print(){
 *  
 *  			System.out.println(weight + " " + numTeeth + " " + numWhiskers);			// 15 16 6
 *  		}
 *  
 *  		public static void main(String[] args){
 *  
 *  			Mouse mouse = new Mouse(15);
 *  			mouse.print();
 *  		}
 *  
 *  	}
 * 		
 */

public class OverloadingConstructor {

	private String color;
	private int weight;
	
	// Costruttore 1
	public OverloadingConstructor(int weight){
		
		this(weight, "brown");
		
		this.weight = weight;
		color = "brown";
		
		// Si vorrebbe chiamare il secondo costruttore.
//		OverloadingConstructor(weight, color);							NON COMPILA - chiamare un secondo costruttore all'interno
//																					  di un'altro costruttore può avvenire solo
//																					  se si antepone la parola chiave "new" prima
//																					  del nome del secondo costruttore;
		
		// Compila ma non è esattamente quello che si vorrebbe fare.
		// Quando viene richiamato il costruttore con un solo parametro, viene costruito un'oggetto con un default "weight" e "color".
		// Richiamando il secondo costruttore (con "new") viene creato un secondo oggetto con "weight" e "color" desiderati e ignorato
		// l'oggetto precedentemente creato dalla prima chiamata al costruttore.
		new OverloadingConstructor(weight, color);
		
		// Quello che si vuole fare è settare "weight" e "color" sull'oggetto creato in prima istanza.
		// JAVA permette di fare questo sempre con l'impiego della parola chiave "this", usata prima per riferisi alla variabili d'istanza.
		// In questo modo è possibile chiamare il costruttore sulla stessa istanza della classe.
		// IMPORTANTE. Questa operazione deve essere la prima del costruttore.

	}
	
	// Costruttore 2
	public OverloadingConstructor(int weight, String color){
		
		this.weight = weight;
		this.color = "brown";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
