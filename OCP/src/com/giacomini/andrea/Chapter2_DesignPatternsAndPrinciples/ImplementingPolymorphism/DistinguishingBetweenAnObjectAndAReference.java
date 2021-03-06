package com.giacomini.andrea.DesignPatternsAndPrinciples.ImplementingPolymorphism;

/*
N.B: In Java tutti gli oggetti sono acceduti per riferimento, per questo motivo lo sviluppatore non avrà mai
     accesso diretto alla locazione di memoria dove stà realmente l'oggetto. Concettualmente, si dovrebbe considerare
     l'oggetto come un'entità che esiste in memoria, allocata dalla Java runtime environment (JRE). Indipendentemente
     dal tipo di riferimento che si ha per accedere all'oggetto in memoria, l'oggetto non cambia. Per esempio, dal momento
     che tutti gli oggetti ereditano da "java.lang.Object", possono essere tutti riassegnati a "java.lang.Object" come
     mostrato di seguito:

        Lemur lemur = new Lemur();
        Object lemurAsObject = lemur;

     Anche se l'oggetto "Lemur" è stato assegnato ad un riferimento con un diverso tipo, l'oggetto stesso non è cambiato
     ed esiste ancora in memoria come oggetto "Lemur". Quello che è cambiato invece è la nostra abilità di accedere ai metodi
     all'interno della classe "Lemur" con il nuovo riferimento "lemurAsObject". Senza un cast esplicito all'indietro (down-cast) a "Lemur",
     come si vedrà nel porssimo capitolo, non avremo più accesso alle proprietà "Lemur" dell'oggetto.
     E' possibile riassumere questi concetti con le seguenti due regole:

        1- il tipo dell'oggetto determina quali proprietà esistono all'interno dell'oggetto in memoria;
        2- il tipo di riferimento all'oggetto determina quali metodi e variabili sono accedibili dal programma Java;

     Ne consegue quindi che cambiare con successo un riferimento di un'oggetto ad un nuovo tipo di riferimento potrebbe
     dare accesso a nuove proprietà dell'oggetto ma tali proprietà esistevano prima del cambiamento di riferimento.
     Spieghiamo questa proprietà usando nuovamente l'esempio precedente "Lemur", "HasTail" e "Primate". [si veda pag 64
     del libro per un'illustrazione grafica]. Lo stesso oggetto esiste in memoria a prescindere dal tipo di riferimento
     che si usa per referenziarlo. A seconda del tipo di riferimento, è possibile avere accesso a certi metodi.
     Per esempio, il riferimento "hasTail" ha accesso al metodo "isTailStriped()", ma non ha accesso alla variabile "age"
     definita nella classe "Lemur". Come si imparerà nella prossima sezione, è possibile recuperare l'accesso alla
     variabile "age" castando esplicitamente il riferimento "hasTail" ad un riferimento di tipo "Lemur" (down-cast).
 */

public class DistinguishingBetweenAnObjectAndAReference {
}
