package com.giacomini.andrea.MethodsAndEncapsulation.CreatingConstructor;

/*
 * N.B: Al capitolo "BuildingBlocks" si è parlato di "costruttori". E' un metodo speciale che ha il nome della classe che lo contiene
 * 		e non ha un "tipo di ritorno" (nemmeno void).
 * 		Il costruttore viene richiamato quando viene creata un'oggetto (istanza) della classe. Questo processo viene chimato 
 * 		"Instantiation" (instanziazione) perché crea un'istanza della classe. Il costruttore viene richiamato quando si scrive
 * 		la parola chiave "new" seguito dal nome della classe che si vuole istanziare.
 * 		Quando JAVA vede la parola chiave "new" alloca memoria per il nuovo oggetto, cerca il costruttore e lo chiama.
 * 		Un costruttore viene usato generalmente per inizializzare variabili d'istanza.
 * 		Con la parola chiave "this" si sta dicendo a JAVA che si vuole riferirsi ad una variabile d'istanza.
 * 		Quando si hanno due variabili con lo stesso nome questo potrebbe creare dei problemi. Per esempio, in un costruttore,
 * 		ci si potrebbe riferire o alla variabile d'istanza o alla variabile che rappresnta il parametro passato al metodo.
 * 		Se ci troviamo in questa situazione in un costruttore, JAVA potrebbe pensare (in modo autonomo) che ci si stia riferendo 
 * 		al nome della variabile che rappresneta il parametro passato al metodo. Se invece, sempre nel costruttore, si antepone
 * 		la parola chiave "this" al nome della variabile allora JAVA saprà con certezza che ci si sta riferendo al nome della 
 * 		variabile d'istanza.   
 */

public class CreatingConstructors {
	
	private String color;
	private int length;
	private int height;
	
	// Costruttore
	public CreatingConstructors(){
		
		System.out.println("Constructor");
	}
	
	// Costruttore
	public CreatingConstructors(String color){
		
		// Si sta assegnando alla variabile d'istanza "color" il valore del parametro "color".
		this.color = color;
	}
	
	// Costruttore
	public CreatingConstructors(int length, int theHeight){
		
		length = this.length;									// NON BUONO - backward
		
		// Non serve usare "this" in quanto non c'è duplicazione di nomi.
		height = theHeight;
		
		// In questo caso "this" è ridondando MA cmq non è un'errore.
		this.color = "white";
	}
	
//	public creatingConstructors(){ }							NON COMPILA - non ha lo stesso nome della classe (JAVA è "case sensitive")
	
	// Non è un costruttore perché ha un valore di ritorno "void".
	public void CreatingConstructors() {}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Viene richiamato il costruttore.
		CreatingConstructors c = new CreatingConstructors();					// Constructor
		
		// Viene richiamato un'altro costruttore.
		CreatingConstructors c1 = new CreatingConstructors(1, 2);
		
		System.out.println(c1.length + " " + c1.height + " " + c1.color);

	}

}
