package com.giacomini.andrea.DesignPatternsAndPrinciples.IntroducingFunctionalProgramming;

/*
N.B: Nel nostro primo esempio si è creata una semplice interfaccia funzionale per testare la caratteristica di un "Animal":

     Guarda gli esempi: com.giacomini.andrea.OCP.DesignPatternsAndPrinciples.IntroducingFunctionalProgramming.Test.Animal;
                        com.giacomini.andrea.OCP.DesignPatternsAndPrinciples.IntroducingFunctionalProgramming.Test.CheckTrait;

     Si può immaginare che si dovranno creare molte interfacce come questa per usare le "lambda expression".
     Si vorrebbe testare animali, pinate, valori String e tutto il resto.
     Fortunatamente Java riconosce questa situazione come un problema comune e ci fornisce per questa ragione una interfaccia.
     Si trova nel package "java.util.function" e ha il seguente aspetto:

        public interface Predicate<T> {

            public boolean test(T t);
        }

    Assomiglia molto alla nostra interfaccia "CheckTrait". La sola differenza è che usa il tipo "T" invece di "Animal".
    Dall'esame OCA si ricorda che questa è la sintassi per una interfaccia che usa un tipo generico. Vedremo in maggior
    dettaglio l'argomento generics nel capitolo (3- Generics and Collections).
    Il risultato di usare l'interfaccia "Predicate" è che non avremo più bisogno della nostra personale interfaccia
    funzionale. Di seguito un'esempio che rappresenta una seconda versione del codice "FindMatchingAnimal.java" che usa
    l'interfaccia "Predicate".

    Guarda gli esempi: com.giacomini.andrea.OCP.DesignPatternsAndPrinciples.IntroducingFunctionalProgramming.Test.FindMatchingAnimal2;

    Questo esempio è molto simile alla nostra versione originale ("FindMatchingAnimal"), eccetto che è stata scritta con una
    interfaccia in meno. Come si vedrà nel capitolo (3- Generics and Collections) quando si lavorerà con le "Collections",
    Java 8 integra l'interfaccia "Predicate" in una varietà di metodi e API. Nel capitolo (4- Functional Programming) si
    conosceranno le "lambda expression" basate su interfacce che prenderanno altri parametri di input e ritorneranno altri
    tipi di ritorno oltre a quelli booleani.

 */

public class ApplyingThePredicateInterface {
}
