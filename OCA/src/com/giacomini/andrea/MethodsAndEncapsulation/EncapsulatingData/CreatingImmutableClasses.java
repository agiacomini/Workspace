package com.giacomini.andrea.MethodsAndEncapsulation.EncapsulatingData;

/*
 * N.B: L'incapsulamento è utili per prevenire che chiamate esterne alla classe possano modificare in modo errato le variabili 
 * 		d'istanza e per prevenire cambiamenti non controllati dello stato dell'oggetto.
 * 
 * 		Un'altra tecnica utile a questo scopo è quella di rendere la classe IMMUTABILE.
 * 
 * 		Data una classe IMMUTABILE, sappiamo che questa non potrà mai cambiare il suo stato (il valore delle proprie variabili d'istanza)
 * 		una volta che è stata istanziata.
 * 
 * 		Ricordiamo che la classe "String" è un'esempio di classe IMMUTABILE.
 * 
 * 		Per rendere una classe IMMUTABILE sarà necessario omettere i metodi (setter) che cambiano lo stato delle variabili d'istanza.
 * 		Si permette sempre al chiamante di specificare il valore dello stato dell'istanza della classe che sta richiedendo
 * 		MA si garantisce anche che questo valore non verrà più modificato durante il resto dell'esecuzione del programma.
 * 		Per fare questo il metodo setter sparisce e l'inizializzazione delle variabili d'istanza avviene solo ed esclusivamente
 * 		all'interno del costruttore della classe (il quale viene richiamto solo una volta al momento della creazione di un'istanza
 * 		della classe).
 * 
 *    	Quando si crea una classe IMMUTABILE bisogna prestare attenzione al tipo di ritorno.
 *    	La classe di seguito potrebbe sembrare immutabile MA in realtà non lo è.
 *    	
 *    	public class NotImmutable{
 *    
 *    		private StringBuilder builder;
 *    		
 *    		// Costruttore;
 *    		public NotImmutable(StringBuilder b){
 *    
 *    			builder = b;
 *    		}
 *    
 *    		public StringBuilder getBuilder(){
 *    	
 *    			return builder;
 *    		}
 *    	}
 *    
 *    	In un'altra classe richiamo un'istanza della precedente:
 *    
 *    	StringBuilder sb = new StringBuilder("initial");
 *    	NotImmuable problem = new NotImmutable(sb);
 *    	sb.append(" added");
 *    	StringBuilder gotBuilder = problem.getBuilder();
 *    	gotBuilder.append(" more");
 *    	System.out.println(problem.getBuilder());						// Output: "initial added more"
 *    
 *    	Non è quello che si voleva ottenere, perché in questo caso specifico si stà passando lo stesso StringBuilder per tutto il codice.
 *    	Il chiamante ha solo un riferimento che poi ha passato al costruttore. Chiunque chiama il metodo getter, data l'istanza della
 *    	classe "NotImmutable", avrà un ha un riferimento a quello'oggetto StringBuilder.
 *    	Una soluzione potrebbe essere quella di fare una copia dell'oggetto mutabile. Questa tecnica è chiamata "COPIA DIFENSIVA".
 *    
 *    
 *    		private StringBuilder builder;	
 *    
 *    		public Mutable(StringBuilder b){
 *    	
 *    			builder = new StringBuilder(b);
 *    		}
 *    
 *    		public StringBuilder getBuilder() {
 *    
 *    			return new StringBuilder(builder);
 *    		}
 *    
 *    	Ora il chiamante può fare cambiamenti all'oggetto iniziale "sb".
 *    	"Mutable" non si preoccupa più dell'oggetto dopo che il costruttore è stato eseguito.
 *    	Lo stesso vale anche per il getter: il chiamante potrà cambiare il proprio StringBuilder senza avere effetti su "Mutable".
 *    
 *    	Un'altro approccio potrebbe essere quello di ritornare un oggetto immutabile:
 *    
 *    		public String getValue(){
 *    
 *    			return builder.toString();
 *    		}
 *    
 *    	Non ci sono regole che ci costringono a ritornare lo stesso tipo che abbiamo memorizzato.
 */
public class CreatingImmutableClasses {
	
	private int numberEggs;
	
	public CreatingImmutableClasses(int numberEggs){
		
		this.numberEggs = numberEggs;
	}
	
	public int getNumberEggs(){
		return numberEggs;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
