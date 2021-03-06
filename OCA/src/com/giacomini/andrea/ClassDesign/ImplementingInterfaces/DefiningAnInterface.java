package com.giacomini.andrea.ClassDesign.ImplementingInterfaces;

/*
 * N.B: E' utile pensare ad un'interfaccia come ad un tipo specializzato di classe abstract, dal momento che condivide molte
 * 		delle proprietà e regole di una classe abstract.
 * 		Le seguenti sono le regole per la creazione di un'interfaccia:
 * 
 *  		1- Un'interfaccia non può essere istanziata direttamente;
 *  
 *  		2- In un'interfaccia non è richeisto che ci siano dei metodi;
 *  
 *  		3- Un'interfaccia NON può essere marcata come FINAL;
 *  
 *  		4- SI ASSUME che per tutte le interfacce top-level vale il modificatore d'accesso PULBIC o quello di default.
 *  		   L'uso del modificatore ABSTRACT è sconsigliato ma è possibile vederlo nella definizione di una interfaccia. 
 *  		   Questo per dire che se nel caso si dovesse rendere un'interfaccia PRIVATE, PROTECTED o FINAL il compilatore 
 *  		   allora ritornerebbe un'errore;
 *  
 *  		5- In una interfaccia, per tutti i suoi metodi non di default, SI ASSUME che abbiano nella loro definizione i modificatori
 *  		   ABSTRACT e PUBLIC. Per questo motivo, rendere un metodo come PRIVATE, PROTECTED o FINAL genererebbe degli errori
 *  		   di compilazione;
 *  
 *     	La 4 regola non è applicabile per le interfacce annidate. Intefacce e classi annidate però non saranno in scope all'esame OCA.
 *     
 *     	Le prime tre regole sono identiche alle prime tre regole per la creazione di una classe abstract.
 *     
 *     	Per la 4 e 5 regole con l'espressione "SI ASSUME" si intende quando il compilatore ragiona in modo automatico per aiutarci 
 *     	nell'esprimere al meglio le nostre intenzioni, esattemente come quando il compialtore inserisce in modo automatico in una classe
 *     	il costruttore di default senza argomenti anche quando non l'abbiamo dichiarato in modo esplicito, oppure come quando
 *     	il costruttore inserisce sempre in modo automatico la chiamata al costruttore padre "super()" come primo statement di ogni
 *     	costruttore nella classe figlia. 
 *      L'utente potrebbe inserire questi modificatori anche da solo, ma il compilatore li inserirà in modo automatico se 
 *      l'utente non lo farà direttamente. Le seguenti tre definizioni di interfacce sono equivalenti:
 *     
 *     	1- 
 *       	public interface CanFly(){				// N.B: il modificatore abstract nella definizone dell'interfaccia è scoraggiato;
 *       
 *       		void fly(int speed);
 *       		abstract void takeOff();
 *       		public abstract double dive();
 *       	}
 *     
 *      2-  
 *       	public abstract interface CanFly{
 *       
 *       		public abstract void fly(int speed);
 *       		public abstract void takeOff();
 *       		public abstract double dive();
 *       	}
 *      
 *      3-
 *          interface CanFly{
 *          
 *          	public abstract void fly(int speed);
 *          	public void fly2();
 *          	abstract void fly3();
 *          	
 *          } 
 *       
 *      La parola chiave abstract è la prima aggiunta in modo automatico nella definizione dell'interfaccia. Ogni metodo viene marcato
 *      sempre in modo automatico con le parole chiave PUBLIC e ABSTRACT. Se la definizone dei metodi usa già queste parole chiave
 *      il compilatore non dovrà applicare in modo automatico i giusti cambiamenti.
 *      
 *      Vediamo di seguito invece alcuni tipici errori nella definizione di una interfaccia e dei suoi metodi:
 *      
 *      	1- 
 *      		private final interface CanCrawl{				NON COMPILA - l'interfaccia NON può essere FINAL e nemmeno PRIVATE;
 *      		
 *      			private void dig(int depth);				NON COMPILA - il metodo d'interfaccia NON può essere PRIVATE;
 *      			protected abstract double depth();			NON COMPILA - il metodo d'interfaccia NON può essere PROTECTED;
 *      			public final void surface();				NON COMPILA - il metodo d'interfaccia NON può essere FINAL;
 *      
 *      		}
 *      
 *      Ogni singola riga di questo esempio non compila. 
 *      La prima riga non compila per due ragioni. Primo e' marcata come FINAL, il quale non può essere applicato alla definizione
 *      di una interfaccia dal momento che è in conflitto con la parola chiave abstract che si assume essere presente nella 
 *      definizone dell'interfaccia anche quando non viene specificata direttamente dall'utente. Secondo, è marcata come PRIVATE
 *      che è in conflitto con i modificatori di accesso consentiti per le interfacce che sono PUBLIC o il default.
 *      La seconda e terza riga non compilano perché tutti i metodi di interfaccia sono assunti come PUBLIC, quindi renderli PROTECTED
 *      o PRIVATE come in questo caso genera un errore di compilazione. In fine, l'ultima riga non compila perché il metodo
 *      è marcato come FINAL e visto che tutti i metodi di interfaccia sono assunti come ABSTRACT questo genera un errore di compilazione
 *      dal momento che le parole chiave abstract e final non vanno mai insieme.   
 */
public class DefiningAnInterface {

}

interface test2 {
	
	public abstract void fly(int speed);
	abstract void fly2();
	public void fly();
}
