package com.giacomini.andrea.AdvancedClassDesign.AnnotatingOverriddenMethods;

/*
 * N.B: Si è già visto come fare l'overriding di un metodo. Java fornisce un modo per indicare esplicitamente nel codice
 * 		che un metodo è stato overridden. In Java, quando si vede codice che inzia con il sinbolo "@" si indica una annotazione.
 * 		Una annotazione è una extra-informazione riguardo il codice, ed è un tipo di metadato. Può essere usato dal compilatore
 * 		oppure anche a runtime.
 * 		L'annotazione "@Ovverride" viene usata per esprimere che il programmatore ha overriddato il metodo, che segue l'annotazione,
 * 		a partire da quello della super-classe da cui proviene, oppure che ha implementato il metodo ereditato dall'interfaccia.
 * 		Tradizionalmente non si pensa all'implementazione di un metodo ereditato da una interfaccia come un'operazione di
 * 		overrdding, ma in pratica è proprio come un'overridding.
 * 
 *  	Questo è molto utile perché ora il compilatore ha abbastanza informazioni per dire al programmatore quando sbaglia.
 *  	Per esempio quando si marca un metodo con l'annotazione "@Override" con l'intenzione di fare l'overriding di un metodo
 *  	della super-classe padre ma per sbaglio si fa l'overloading al posto dell'overriding. Questa situazione porta il compilatore
 *  	Java a segnalare un errore di compilazione. E' utile avere il compilatore che ci segnala quando non si sta facendo
 *  	un'overriding quando invece l'intezione era proprio quella (errore di tipo). Oppure, un'altra situazione nella quale l'impiego 
 *  	dell'annotazione "@Override" ci viene in aiuto (segnalando un'errore) è quando per caso il metodo della super-classe o 
 *  	dell'interfaccia di cui si sta facendo l'override, cambia senza che lo si sappia.
 *  
 *   	L'annotazione "@Override" è permesso solo quando ci si riferisce ad un metodo. Questa stessa annotazione non può essere
 *   	usata per i campi.
 *   	Quando si incontra nel codice (durante l'esame) questa annotazione ("@Override") è consigliabile eseguire i seguenti tre controlli:
 *   		- se implementa un metodo di un'interfaccia;
 *   		- se override un metodo della super-classe mostrata nell'esempio;
 *   		- se override un metodo dichiarato nella classe Object, come "hashCode", "equals" o "toString";
 *   
 *    	Il terzo controllo è un tipo particolare del secondo. E' meno ovvio.
 *    	Vediamo con più attenzione questi tre metodi (la loro firma) nella prossima sezione "CodingEqualsHashCodeToString".
 * 
 */

public class AnnotatingOveriddenMethods {

}

class Bobcat {
	public void findDen(){}
}

class BobcatMother extends Bobcat {
	
	// 1 MODO - 
//	@Override					Questa annotazione dice a Java che il codice del metodo successivo ha intenzione di ovverridare un'altro metodo;
//	public void findDen(){}
	
	// 2 MODO - Java ignora gli spazi bianchi;
	@Override public void findDen(){}
	
//	@Override
//	public void findDen(boolean b){}		ERRORE DI COMPILAZIONE - si è marcato con "@Override" un overloading di un metodo;
}
