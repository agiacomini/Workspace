package com.giacomini.andrea.DesignPatternsAndPrinciples.IntroducingFunctionalProgramming;

/*
N.B: In "DefiningAFunctionalInterface" si è visto come definire una interfaccia funzionale, ora vedremo come implementarla
     usando una lambda expression. Come si è detto in precedenza, una "lambda expression" è un blocco di codice che viene
     passato in giro, come un metodo anonimo. Iniziamo con una semplice interfaccia funzionale "CheckTrait" la quale
     ha un singolo metodo "test()" il quale prende in input un'istanza della classe "Animal".

     Guarda gli esempi: com.giacomini.andrea.OCP.DesignPatternsAndPrinciples.IntroducingFunctionalProgramming.Test.Animal;
                        com.giacomini.andrea.OCP.DesignPatternsAndPrinciples.IntroducingFunctionalProgramming.Test.CheckTrait;

     Ora si è definito una struttura, proviamo adesso ad usarla. Il seguente codice "FindMatchingAnimals" usa una lambda
     expression per determinare se alcuni animale campione corrispondono ai criteri:

     Guarda gli esempi: com.giacomini.andrea.OCP.DesignPatternsAndPrinciples.IntroducingFunctionalProgramming.Test.FindMatchingAnimals;

     A titolo illustrativo, la "lambda expression" scelta per questo programma è molto semplice: "a -> a.canHop()"
     Questa espressione significa che Java dovrà chiamare un metodo con un parametro "Animal" che ritorna un valore "boolean"
     che è il risultato di a.canHop(). Noi lo sappiamo benissimo perché abbiamo scritto il codie, ma come fa a saperlo anche Java?
     Java si affida al contesto per capire cosa significano le "lambda expression". Si stà passando questa "lambda expression" come
     secondo parametro del metodo "print()" della classe "FindMatchingAnimal". Quel metodo si aspetta un "CheckTrait" come
     secondo parametro. Dal momento che si stà passando una "lambda expression", Java tratta "CheckTrait" come un'interfaccia funzionale
     e cerca di mapparlo al singolo metodo abstract:

        boolean test(Animal a);

     Dal momento che questo metodo d'interfaccia prende un "Animal", significa che il parametro della "lambda expression" dovrà
     essere per forza un "Animal". Inoltre, dal momento che il metodo d'interfaccia ritorna un boolean, si sa che la "lambda expression"
     ritorna boolean.



     UNDERSTANDING LAMBDA SYNTAX:
     La sintassi di una "lambda expression" è difficile da capire perché ha molte parti opzionali. Queste due linne di seguito
     sono equivalenti e fanno la medesima cosa:

        - a -> a.canHop()

        - (Animal a) -> { return a.canHop(); }

     Il lato sinistro dell'operatore freccia (->) indica i parametri di input per la "lambda expression". Può essere consumata
     da un'interfaccia funzionale il cui metodo abstract ha lo stesso numero di parametri e gli stessi data type dei parametri
     di input della "lambda expression". Il lato destro si riferisce al corpo della "lambda expression". Può essere consumato
     da un'interfaccia funzionale il cui metodo abstract ritorna un tipo compatibile.
     Dal momento che la sintassi di queste due espressioni è leggermente diversa, diamogli un'occhiata in maggior dettaglio.
     Il primo esempio ha tre parti:

        - viene specificato un singolo parametro di nome "a";
        - l'operatore freccia (->) separa il parametro dal corpo;
        - il corpo chiama un singolo metodo e ritorna il risultato di quel metodo;

     Anche il secondo esempio ha tre parti ma è più lungo:

        - specifica un singolo parametro senmpre di nome "a" e lo dichiara di tipo "Animal", avvolgendo i parametri di
          ingresso tra parentesi ();
        - l'operatore freccia (->) separa i paramtrei dal corpo;
        - il corpo ha una o più linee di codice, incluse all'interno delle parentesi {}, un punto e virgola (;) e per
          finire uno statement "return";

     Analizziamo alcune delle differenze tra queste due sintassi. La prima differenza sono le paretesi tonde () a racchidere
     la lista di parametri di input nella seconda versione, mentre la prima versione non le ha. Le parentesi tonde possono essere
     omesse in una "lambda expression" se c'è esattamente un solo parametro di input e il tipo non è esplicitamente dichiarato
     nell'espressione. Questo significa che le espressioni che hanno zero o più di un parametro richiederanno le parentesi.
     Per esempio, le seguenti sono "lambda expression" valide, assumendo che ci siano valide interfacce funzionali che possono
     consumarle:

        - () -> new Duck()
        - d -> { return d.quack(); }
        - (Duck d) -> d.quack
        - (Animal a, Duck d) -> d.quack

     La prima "lambda expression" può essere usata da un'interfaccia funzionale contenente un metodo abstract che non prende argomenti
     e ritorna un'oggetto "Duck". La seconda e terza "lambda expression" possono essere usate entrambe da un'interfaccia
     funzionale che prende in un input un paramatro di tipo "Duck" e ritorna qualunque sia il tipo di ritorno del metodo
     "quack()". L'ultima "lambda expression" invece può essere usata da un'interfaccia funzionale che prende in input un'oggetto
     "Animal" ed un'oggetto "Duck" e ritorna qualunque sia il tipo di ritorno del metodo "quack()".



     SPOTTING INVALID LAMBDAS:
     Qual'è il motivo per il quale le seguenti "lambda expressioni" sono invalide quando usate come argomenti di un metodo?

        - Duck d -> d.quack()               // NON COMPILA
        - a,d -> d.quack()                  // NON COMPILA
        - Animal a, Duck d -> d.quack()     // NON COMPILA

     Richiedono tutte le parentesi tonde (). Come si è detto in precedenza, le parentesi tonde () possono essere omesse solo se
     c'è esattamente un parametro e il tipo di dato non è specificato.
     Si è già visto come nell'espressione "(Animal a) -> { return a.canHop(); }" ci siano le parentesi graffe {} intorno
     al corpo della "lambda expression". Questo ci permette di scrivere linee multiple di codice nel corpo della "lambda expression",
     esattamente come si fa quando si lavoro con uno statement "if" oppure un ciclo "while". La parte difficile qui è che quando
     si aggiungono le parentesi graffe {} si è costretti ad terminare esplicitamente ogni singolo statement nel corpo della
     "lambda expression" con un punto e virgola (;).
     Nell'espressione "a -> a.canHop()" si era in grado invece di omettere le parentesi graffe {}, il punto e virgola (;)
     e lo statement "return", perché si tratta di una scorciatoia che Java permette di fare quando si ha un solo statement
     nel body. Questa speciale scorciatoia/abbreviazione non funziona quando si hanno due o più statement nel body.
     Questa situazione è coerente con l'uso delle parentesi graffe {}, per creare blocchi di codice, nei costrutti "if", "if-esle", ecc.
     Quando si usano le parentesi graffe {} per racchiudere il corpo della "lambda expression", si è costretti ad usare
     lo statement "return" se il metodo dell'interfaccia funzionale che la "lambda expressione" implementa/consuma ritorna un valore.
     Alternativamente, un statement "return" è opzionale quando il tipo di ritorno del metodo è "void".
     Di seguito alcuni esempi:

        - () -> true                                    // 0 PARAMETRI
        - a -> { return a.startsWith("test"); }         // 1 PARAMETRO
        - (String a) -> a.startsWith("test")            // 1 PARAMETRO
        - (int x) -> {}                                 // 1 PARAMETRO
        - (int y) -> { return; }                        // 1 PARAMETRO

     Il primo esempio non prende argomenti e ritorna sempre TRUE. Il secondo e terzo esempio prendono entrambi un singolo
     valore "String", usano però una sintassi diversa per fare la stessa cosa. Si noti come nei primi due esempi si è
     mischiata la sintassi dei due esempi presentati all'inizio [ 1- a -> a.canHop()  2- (Animal a) -> { return a.canHop(); }]
     facendo in modo che il primo esempio usi le parentesi tonde () e non le parentesi graffe {}, mentre il secondo non usi
     le parentesi tonde () ma usi invece le parentesi graffe {}. Gli ultimi due esempi sono equivalenti perché prendono
     entrambi un valore "int" in input e non ritornano niente.

     Vediamo ora in maggior dettaglio le "lambda expression" che prendeono in input più di un parametro:

        - (a,b) -> a.startsWith("test")                 // 2 PARAMETRI
        - (String a, String b) -> a.startsWith("test")  // 2 PARAMETRI

     Entrambi questi due esempi prendono due parametri di input e ne ignorano uno dei due, dal momento che non ci sono
     regole che dicono che le "lambda expression" devono per forza usare tutti i parametri di input.
     Prendiamo in esame altre "lambda expression" per vedere come la sintassi si evolve. Cosa c'è di sbagliato nelle
     seguenti espressioni?

        - a,b -> a.startsWith("test")                   // NON COMPILA: mancano le ();
        - c -> return 10;                               // NON COMPILA: mancano le {};
        - a -> { return a.startsWith("test") }          // NON COMPILA: manca il ";" finale;

     La prima "lambda expression" ha bisogno delle parentesi tonde () intorno alla lista di parametri di input. Si ricorda
     che le parentesi tonde () sono opzionali solo quando si ha un solo parametro di input e non ha un tipo dichiarato.
     La seconda "lambda expressioni" usa la parola chiave "return" senza usare le parentesi graffe {}. Nell'ultima "lambda
     expression" manca il punto e virgola ";" dopo lo statement "return". Di seguito le "lambda expression" corrette:

        - (a,b) -> a.startsWith("test")
        - c -> { return 10; }
        - a -> { return a.startsWith("test"); }

     Come precedentemente detto, il tipo di dato per i parametri di input di una "lambda expression" sono opzionali.
     Quando un parametro di input ha un tipo di dato specificato, tutti i parametri devono fornirne uno. Le seguenti "lambda
     expression" rappresentano situazioni invalide proprio per questa ragione:

        - (int x, y) -> { int x=1; return y+10; }       // NON COMPILA
        - (String s, z) -> { return s.length()+z; }     // NON COMPILA
        - (a, Animal b, c) -> a.getName();              // NON COMPILA

     Se dovessimo aggiunge il tipo di dato per tutti i parametri, oppure rimuoverlo per tutti, allora queste "lambda expression"
     compilerebbero. Per esempio, le seguenti "lambda expression" (rivisitazione delle precedenti) sono corrette:

        - (x,y) -> { int x=1; return y+10; }
        - (String s, int z) -> { return s.lenght()+z; }
        - (a,b,c) -> a.getName()

     C'è un'ulteriore questione riguardo le "lambda expression". Si è definita una lista di argomenti per le "lambda expression".
     Dal momento che Java non permette la possibilità di ri-dichiarare una variabile locale, la seguente "lambda expression"
     non è valida:

        - (a,b) -> { int a = 0; return 5; }             // NON COMPILA

     Si stà provando a ri-dichiarare la variabile "a", che è una situazione non permessa. Al contrario, la seguente "lambda
     expression" è invece valida:

        - (a,b) -> { int c = 0; return 5; }

 */

public class ImplementingFunctionalInterfaceWithLambdas {
}
