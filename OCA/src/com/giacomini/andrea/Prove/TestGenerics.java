package com.giacomini.andrea.Prove;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class TestGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> strings = Arrays.asList("Lambda " , "expression " , "are " , "cool");
		
		/*
		 * N.B: Quelli di seguito sono due esempi di cicli FOR (che fanno la medesima cosa) che rappresentano un caso
		 * 		di "INTERAZIONE ESTERNA", cioè si sta dicendo alla collezione di stringhe: "dammi una stringa, poi dammene
		 * 		un'altra e un'altra ancora." E' il codice "client" che chiede alla lista un elemento alla volta.  
		 */
		
		for (int i = 0 ; i < strings.size() ; i++){
			
			System.out.print(strings.get(i));
		}
		
		System.out.println("");
		
		/*
		 * Uso del GENERICS
		 */
		for (String string : strings) {
			System.out.print(string);
		}
		
		System.out.println("");
		
		/*
		 * N.B: Di seguito invece un'esempio di LAMBDA EXPRESSIONE (produce lo stesso risultato dei due cicli FOR) 
		 * 		che rappresenta una caso di "INTERAZIONE INTERNA", cioè si sta dicendo alla collezione di stringhe: 
		 * 		"dammi tutte le stringhe". Esiste un nuovo metodo "void foreach(Consumer<T> )" che prende in ingresso 
		 * 		un "Consumer" (una nuova Interfaccia per la quale c'è bisogno di implementare il suo metodo 
		 * 		"void accpet()").
		 * 		Non diciamo più alla lista come produrre il risultato (ciclo FOR), MA cosa voglio che venga fatto per ogni
		 * 		elemento della collezione, ci concentriamo meno sul modo per farlo ma più sul cosa voglio ottenere.
		 * 		
		 */
		
		/*
		 * Uso della LAMBDA EXPRESSION. Di seguito una "Inner Class".
		 */
		strings.forEach(new Consumer<String>() {
			
			public void accept(String s){
				System.out.print(s);
			}
		});
		
		System.out.println("");
		
		/*
		 * Uso della LAMBDA EXPRESSION. La sua forma compatta.
		 * Di questa funzione identifichiamo con "(String s)" la lista di parametri passati in input, il corpo della 
		 * fuznione "System.out.print(s)" separati dal dal simbolo freccia (->). Il nome della fuznione non c'è. 
		 */
		strings.forEach((String s) -> System.out.print(s));
		
		System.out.println("");
		
		/*
		 * Uso della LAMBDA EXPRESSION.
		 * Il compilatore sa che stiamo applicando l'espressione lambda ad una collezione di String attraverso la "type inference"
		 * quindi è possibile semplicficare la funzione omettendo il tipo per "s".
		 */
		strings.forEach(s -> System.out.print(s));
		
		System.out.println("");

		/*
		 * Uso della LAMBDA EXPRESSION.
		 * Dal momento che l'unica cosa che esegue è chiamare un metodo, un'ulteriore semplificazione del codice 
		 * è l'uso dei "Methos reference" al posto dell'espressione "s -> System.out.print(s)".  
		 */
		strings.forEach(System.out::print);
	}

}
