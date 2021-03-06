package com.giacomini.andrea.GenericsAndCollections.ReviewingOCACollections;

/*
N.B: Un "ArrayList" è un oggetto che contiene altri oggetti. Un "ArrayList" non può contenere primitive. Un "array" è una
     struttura dati che contiene altri oggetti o primitive. Il seguente codice spiega come usare un array e un "ArrayList":

        List<String> list = new ArrayList();            // lista vuota;
        list.add("Fluffy");                             // [Fluffy]
        list.add("Webby");                              // [Fluffy, Webby]

        String[] array = new String[list.size()];       // array vuoto
        array[0] = list.get(1);                         // [Webby]
        array[1] = list.get(0);                         // [Webby, Fluffy]
        for(int i = 0 ; i < array.length; i++){

            System.out.println(array[i] + " - ");
        }

     L'output è "Webby - Fluffy -". Questo codice ci ricorda che il conteggio delle posizioni (indici - sia negli array
     che negli "ArrayList") in Java inizia da 0. Inoltre ci ricorda che si accede agli elementi di un "ArrayList" con il
     metodo "get()" e che si controlla il numero di elementi di un "ArrayList" con il metodo "size()". Al contrario, si
     accede agli elementi di un array usando le parentesi quadre e si controlla il numero di elementi con la variabile
     "length".
     Rivediamo ora il link creato quando si converte un array in un "ArrayList":

        4: String[] array = { "gerbil", "mouse" };         // [gerbil, mouse]
        5: List<String> list = Arrays.asList(array);       // ritorna una lista di grandezza fissa
        6: list.set(1, "test");                            // [gerbil, test]
        7: array[0] = "new"                                // [new, test]
        8: String[] array2 = (String[]) list.toArray();    // [new, test]
        9: list.remove(1);                                 // throws "UnsupportedOperationException"

     La linea 5 converte un array in una "List". Si tratta di una implementazione di "List" che non è un "ArrayList".
     Ricorda che una "List" è come un array ri-dimensionabile. Ha senso convertire un array in una "List". Non ha senso
     invece convertire un array in un "Set". Tuttavia è ancora possibile farlo, anche se richiede un'ulteriore passo.
     Si potrebbe convertire un array in una "List" e poi convertire la "List" in un "Set". 
     Le linne 6 e 7 mostrano che si può cambiare gli elementi sia in un array che in una "List". 
     I cambiamento si riflettono su entrambi, dal momento che sono supportati dagli stessi dati.
     Le implementazioni di "List" sono permesse per aggiungere il loro personale comportamento. L'implementazione usata
     quando si chiama il metodo "asList()" ha la caratteristica aggiuntiva di non essere ri-dimensionabile ma di onorare
     tutti gli altri metodi dell'interfaccia. 
     La linea 8 converte all'indietro la "List" in un array. 
     Infine, la linea 9 mostra che la "List" non è ri-dimesnionabile perhché è sostenuta dal sottostante array.

 */
public class ArrayAndArrayList {
}
