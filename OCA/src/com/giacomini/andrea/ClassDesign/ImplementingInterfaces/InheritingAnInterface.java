package com.giacomini.andrea.ClassDesign.ImplementingInterfaces;

/*
 * N.B: Esistono due regole dell'ereditarietà che si dovrebbe tenere a mente quando si implementa/estende un'interfaccia:
 * 
 *   		1- Un'interfaccia che estende un'altra interfaccia, così come una classe abstract che implementa un'interfaccia,
 *   		   eredita tutti i metodi abstract come i suoi metodi abstract;
 *   
 *    		2- La prima classe concreta che implementa un'interfaccia, o estende una classe abstract la quale implementa un'interfaccia
 *    		   deve fornire un'implementazione per tutti i metodi abstract ereditati;
 *    
 *     	Come una classe abstract, un'interfaccia può essere estesa usando la parola chiave "extends". In questa maniera, la nuova
 *     	interfaccia figlia eredita tutti i metodi abstract dell'interfaccia parent. Sfortunatamente, a differenza di una classe 
 *     	abstract, un'interfaccia può estendere più interfaccie contemporaneamente.
 *     
 *      Guarda gli esempi: com.giacomini.andrea.OCA.ClassDesign.ImplementingInterfaces.Examples.HasTail;
 *      				   com.giacomini.andrea.OCA.ClassDesign.ImplementingInterfaces.Examples.HasWhiskers;
 *      				   com.giacomini.andrea.OCA.ClassDesign.ImplementingInterfaces.Examples.Seal;
 *      
 *      Cosa succede alla classe abstract che implementa un'interfaccia? In questo scenario, la classe abstract viene trattata
 *      allo stesso modo di un'interfaccia che estende un'altra interfaccia. In altre parole, la classe abstract eredita i metodi
 *      abstract dell'interfaccia ma non gli è richiesto di implementarli. Detto questo, la prima classe concreta che estende
 *      questa classe abstract dovrà implementare tutti i metodi abstract ereditati dall'interfaccia.
 *      
 *      Guarda gli esempi: com.giacomini.andrea.OCA.ClassDesign.ImplementingInterfaces.Examples.HasTail;
 *      				   com.giacomini.andrea.OCA.ClassDesign.ImplementingInterfaces.Examples.HasWhiskers;
 *      				   com.giacomini.andrea.OCA.ClassDesign.ImplementingInterfaces.Examples.HarborSeal;
 *      				   com.giacomini.andrea.OCA.ClassDesign.ImplementingInterfaces.Examples.LeopardSeal;
 *      
 *      In questi esempi vediamo "HarborSeal" che è una classe abstract e compila senza problemi. Quasiasi classe che estenderà
 *      "HarborSeal" dovrà implementare i metodi abstract delle interfacce "HasTail" e "HasWhiskers".
 *      Invece la classe "LeopardSeal" non è una classe abstract, così dovrebbe implementare tutti i metodi delle interfacce 
 *      implementate, ma visto che non vengono implementati i metodi ereditati dalle interfacce il compilatore ritornerà un 
 *      errore di compilazione.
 *      
 *      
 *      
 *      Classes, Interfaces, and keywords:
 *      ATTENZIONE:
 *      Una classe può implementare un'interfaccia, NON può estendere un'interfaccia (vale sia per le classi concrete che per le
 *      classi abstract).
 *      Inoltre, un'interfaccia può estendere un'altra interfaccia, NON può implmentare un'altra interfaccia.
 *      
 *      Guarda gli esempi: com.giacomini.andrea.OCA.ClassDesign.ImplementingInterfaces.Examples.CanRun;
 *      				   com.giacomini.andrea.OCA.ClassDesign.ImplementingInterfaces.Examples.Cheetah;
 *      				   com.giacomini.andrea.OCA.ClassDesign.ImplementingInterfaces.Examples.Hyena;
 *      				   com.giacomini.andrea.OCA.ClassDesign.ImplementingInterfaces.Examples.HasFur;
 *      
 *     	In generale "CLASS IMPLEMENTS INTERFACE".
 *     
 *     
 *     
 *      Abstract Methods and Multiple Inheritance:
 *      Visto che JAVA permette l'ereditarietà multipla attraverso le interfacce, cosa succede se si definisce una classe che
 *      implementa due interfacce diverse che però contengono un metodo abstract con lo stesso nome?
 *      Supponiamo che le due interfacce "Herbivore" e "Omnivore" abbiano un metodo "eatPlants()" comune con la stessa firma,
 *      la classe che implemnterà le due interfacce fornirà un unica implmentazione del metodo abstract ereditato.  
 *      
 *      Guarda gli esempi: com.giacomini.andrea.OCA.ClassDesign.ImplementingInterfaces.Examples.Herbivore;
 *      				   com.giacomini.andrea.OCA.ClassDesign.ImplementingInterfaces.Examples.Omnivore;
 *      				   com.giacomini.andrea.OCA.ClassDesign.ImplementingInterfaces.Examples.Bear;
 *      
 *      Ma come può funzionare questo?
 *      Ricordiamo che i metodi d'interfaccia in questo esempio sono abstract e definiscono il comportamento che la classe
 *      che le implementa deve avere. Se due metodi d'interfaccia abstract hanno un comportamento identico - o in questo caso
 *      la stessa firma del metodo - creare una classe che implementa uno dei due metodi automaticamente implementa anche il 
 *      secondo metodo. In questo modo, i metodi d'interfaccia sono considerati duplicati visto che hanno la stessa firma.
 *      
 *      Cosa succede se due metodi hanno due firme diverse?
 *      Se il nome del metodo è lo stesso ma i parametri di input sono differenti, non c'è conflitto perché questo è considerato
 *      come "overloading method".
 *      
 *      Guarda gli esempi: com.giacomini.andrea.OCA.ClassDesign.ImplementingInterfaces.Examples.Herbivore2;
 *      				   com.giacomini.andrea.OCA.ClassDesign.ImplementingInterfaces.Examples.Omnivore2;
 *      				   com.giacomini.andrea.OCA.ClassDesign.ImplementingInterfaces.Examples.Bear2;
 *      
 *      In questo esempio si vede come la classe "Bear2", che implementa entrambe le interfacce "Herbivore2" e "Omnivore2",
 *      deve fornire un'implmentazione per entrambe le versioni del metodo "eatPlants()" dal momento che sono considerati
 *      metodi separati e diversi tra loro. Si noti che non importa se il valore di ritorno dei due metodi è diverso o lo stesso
 *      perché il compilatore tratta questi due metodi come indipendenti.
 *      Sofrtunatamente, se il nome del metodo e i parametri di input sono gli stessi ma il tipo di ritorno è diverso tra i due
 *      metodi, la classe o interfaccia che tenta di ereditare entrambe le interfacce non compilerà. La ragione per cui il codice
 *      non viene compilato ha meno a che fare con le interfacce e più a che fare con il design di classe, come discusso nel
 *      capitolo "Methods And Encapsulation". Non è possibile in JAVA definire due metodi in una classe con lo stesso nome e
 *      stessi parametri di input ma differente tipo di ritorno.
 *      
 *      Guarda gli esempi: com.giacomini.andrea.OCA.ClassDesign.ImplementingInterfaces.Examples.Herbivore3;
 *      				   com.giacomini.andrea.OCA.ClassDesign.ImplementingInterfaces.Examples.Omnivore2;
 *      				   com.giacomini.andrea.OCA.ClassDesign.ImplementingInterfaces.Examples.Bear3;
 *      
 *      Se si dovessero rimuovere entrambe le definizioni del metodo "eatPlants()", il compilatore si fermerebbe perché nella 
 *      definizone della classe "Bear3" mancherebbe uno dei metodi richiesti. In altre parole, non c'è nessuna implementazione
 *      della classe "Bear3" che erediti sia da "Herbivore3" che da "Omnivore2" che il compilatore possa accettare.
 *      
 *      Il compilatore inoltre lancerebbe un'eccezione se si definisce un'interfaccia o una classe abstract che erediti da due
 *      interfacce in conflitto.
 *      
 *      Guarda gli esempi: com.giacomini.andrea.OCA.ClassDesign.ImplementingInterfaces.Examples.Herbivore3;
 *      				   com.giacomini.andrea.OCA.ClassDesign.ImplementingInterfaces.Examples.Omnivore2;
 *      				   com.giacomini.andrea.OCA.ClassDesign.ImplementingInterfaces.Examples.Supervore;
 *      				   com.giacomini.andrea.OCA.ClassDesign.ImplementingInterfaces.Examples.AbstractBear;
 *      
 *      Anche senza implementare i metodi ereditati, il compilatore rileva il problema con la definizione abstract e previene 
 *      la compilazione.
 */

public class InheritingAnInterface {

}
