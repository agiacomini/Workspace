package com.giacomini.andrea.DesignPatternsAndPrinciples.WorkingWithDesignPatterns;

/*
N.B: Il prossimo "creational patter" (pattern creazionale) che verrà discusso è l'"Immutable Objects Pattern".

     Problema: come è possibile creare oggetti read-only che possano essere condivisi ed usati da più classi?

     Motivazione: a volte si vuole creare oggetti semplici che possano essere condivisi tra più classi, ma per questioni
     di sicurezza non si vuole però che il loro valore venga modificato. E' possibile copiare l'oggetto prima di spedirlo
     ad un'altro metodo, ma questo creerebbe un overhead di lavoro ogni volta che l'oggetto viene duplicato per essere
     passato ad un metodo. Inoltre, se si hanno più thread che accedono allo stesso oggetto, si potrebbe incappare in
     questioni riguardanti la "concurrency" che si vedrà in maggior dettaglio nel capitolo "7- Concurrency".

     Soluzione: Il "Immutable Objects Pattern" è un pattern creazionale basato sull'idea di creare oggetti il cui
     intero stato non cambia dopo che è stato creato e può essere facilmente condiviso tra più classi. Gli oggetti
     immutabili vanno mano nella mano con l'incapsulamento, eccetto che rispetto all'incapsulamento non esitono metodi setter
     che modificano l'oggetto. Dal momento che lo stato di un'oggetto immutabile non cambia mai, vengono ereditati thread-safe.

     N.B: Si è già discusso degli oggetti immutabili nel corso dell'esame OCA. Per esempio si ricorda che la classe
          "String" viene chiamata immutabile perché non cambia mai il proprio stato una volta che è stata creata.
          Vedremo ora come definire delle nostre classi immutabili.



     APPLYING IMMUTABLE STRATEGY:
     Anche se esistono una varietà di tecniche per scrive una classe immutabile, si dovrebbe essere familiari con una
     strategia comune per rendere una classe immutabile per l'esame:

        - usare un costruttore (PUBLIC) per settare tutte le proprietà dell'oggetto;
        - marcare tutte le variabili d'istanza come PRIVATE FINAL;
        - non definire nessun metodo setter;
        - non permettere a riferimenti di oggetti mutabili di essere modifcati o acceduti direttamente;
        - prevenire l'ovveride dei metodi;

     La prima regola definisce come creare l'oggetto immutabile, passando le informazioni al cotruttore, così che tutti i
     dati siano settati al momento della creazione. La seconda e terza regola sono semplici perché derivano da un'adeguato
     incapsulamento. Le variabili d'istanza sono PRIVATE e FINAL, e non ci sono metodi setter, allora non ci sarà un modo
     diretto di cambiare le proprietà dell'oggetto. Tutti i riferimenti e i valori di primitive contenuti nell'oggetto
     sono settati al momento della creazione e non possono essere cambiati. La quarta regola richiede una spiegazione
     più accurata. Diciamo che si ha un oggetto immutabile "Animal", il quale contiene un riferimento ad una "List" di
     cibi favoriti dall'animale, come mostrato di seguito:

        import java.util.*;

        public final class Animal{

            private final List<String> favoriteFoods;

            // Costruttore;
            public Animal(List<String> favoriteFoods){

                if(favoriteFoods == null){

                    throw new RuntimeExcpetion("favoriteFoods is required");
                }

                this.favoriteFoods = favoriteFoods;
            }

            public List<String> getFavoriteFoods(){             // Rende la classe IMMUTABILE;

                return favoriteFoods;
            }
        }

      Al fine di assicurare che la lista "favoriteFoods" non sia nulla, questa viene validata all'interno del costruttore
      e lanciata una eccezione (RuntimeExcpetion) nel caso in cui non venga fornita. Il problema in questo esempio è che l'utente ha accesso
      diretto alla lista definita nella nostra istanza di "Animal". Anche se non è possibile cambiare il riferimento alla lista di oggetti
      a cui punta, si può comunque modificare gli elementi della lista per esempio, cancellandoli tutti chiamando
      "getFavoriteFoods().clear()", oppure possono essere sostituiti i suoi elementi o ancora rimossi oppure anche ordinati.
      La soluzione, allora, è di non ritornare mai all'utente il riferimento alla lista. Più generalmente detto,
      non si dovrebbe condividere riferimenti ad oggetti mutabili contenuti all'interno di un'oggetto immutabile.
      Se l'utente ha bisogno dell'accesso al dato nella lista, può creare metodi wrapper per iterare sui dati oppure può
      creare una copia unica dei dati che vengono ritornati all'utente e mai archiaviti come parte dell'oggetto.
      Infatti, le API "Collections" includono il metodo "Collections.unmodifiableList()" il quale esegue proprio questa
      attività. La chiave qui è che nessuno dei metodi che si crea dovrebbe modificare l'oggetto mutabile.

      Ritornando alle nostre cinque regole, l'ultima regola è importante perché previene che qualcuno crei una sotto-classe
      della nostra classe immutabile, prevenendo così che un valore precedentemente immutabile diventi ora mutabile.
      Per esempio, si potrebbe override un metodo che modifica una variabile differente nella sotto-classe, essenzialmente
      hidding la variabilie PRIVATE definita nella classe parent. La soluzione più semplice è marcare la classe o il metodo
      con il modificatore FINAL, anche se questo limita l'uso della classe. Un'altra opzione è rendere il costruttore PRIVATE
      ed applicare il "Factory Pattern" che verrà discusso dopo in questo capitolo.
      Di seguito un'esempio di classe immutabile Animal:

      Guarda gli esempi: com.giacomini.andrea.OCP.DesignPatternsAndPrinciples.WorkingWithDesignPatterns.Test.AnimalImmutable;

      L'esempio segue tutte e cinque le regole? Tutti i campi sono marcati come PRIVATE e FINAL, e il costruttore le setta
      tutte una volta che viene creato l'oggetto. Non ci sono metodi setter e la classe stessa è marcata come FINAL, cosi
      che i metodi non possano essere overridati da una sotto-classe. La classe contiene un'oggetto mutabile "List" ma
      nessu riferimento a quest'oggetto è reso disponibile pubblicamente. Si forniscono due metodi per recuperare il
      numero totale dei "food favorite" (cibi preferiti) e un metodo per recuperare un "food" in base ad un valore indice.
      Si noti che "String" è immutabile, così che non ci si deve preoccupare che nessun oggetto "String" venga modificato.
      Perciò, tutte e cinque le regole sono rispettate e quindi le istanze di questa classe sono immutabili.

      N.B: Gestione degli oggetti mutabili nel costruttore di oggetti immutabili
      Sempre nell'esempio "AnimalImmutable" si può notare la creazione di un nuovo ArrayList nel costruttore. Questo è
      assolutamente importante per evitare che la classe che crea inizialmente l'oggetto mantenga un riferimento alla
      lista mutabile usata da "AnimalImmutable". Si consideri per un momento se si fosse semplicemente eseguita la
      seguente istruzione:

        this.favoriteFoods = favoriteFoods;

      Con questa istruzione, il chiamante che crea l'oggetto sta usando lo stesso riferimento dell'oggetto immutabile,
      che signifa che ha l'abilità di cambiare la "List". E' importante quando si creano oggetti immutabili che nessun
      argomento imput mutabile sia copiato nell'istanza invece di essere usato direttamente.



      "MODIFYING" AN IMMUTABLE OBJECT:
      Come è possibile modificare oggetto immutabili se sono intrinsecamente non modificabili?
      La risposta è che non è possibile! In alternativa, è possibile creare un nuovo oggetto immutabile che contenga le
      stesse informazioni dell'originale più tutto ciò che si vuole cambiare. Questo succede ogni volta che si combinano
      due stringhe:

        String firstName = "Grace;
        String fullName = firstName + " Hopper";

      In questo esempio, la variabile String "firstName" è immutabile e non viene modificata quando viene aggiunta a "fullName",
      il quale è a sua volta un'oggetto immutabile. E' possibile fare la stessa cosa anche con la classe "AnimalImmutable".
      Si immagini si voglia incrementare l'età di un'animale di una unità. Le seguenti istruzioni creano due istanze di
      "AnimalImmutable", la seconda in particolare usando una copia del primo oggetto:

        // Crea una nuova istanza di "AnimalImmutable";
        AnimalImmutable lion = new AnimalImmutable("lion", 5, Arrays.asList("meat", "more meat"));

        // Crea una nuova istanza di "AnimalImmutable" usando il dato proveniente dalla prima istanza;
        List<String> favoriteFoods = new ArrayList<String>();
        for(int i = 0 ; i < lion.getFavoriteFoodsCount() ; i++){

            favoriteFoods.add(lion.getFavoriteFood(i));
        }
        AnimalImmutable updatedLion = new AnimalImmutable(lion.getSpecies(), lion.getAge() + 1, favoriteFoods);

      Dal momento che non si ha un accesso diretto alla "List" mutabile "favoriteFoods", si è stati costretti a copiarla
      usando i metodi disponibili nella classe immutabile stessa ("getFavoriteFoodsCount()" e "getFavoriteFood()").
      E' possibile anche semplificare questa situazione definendo un metodo della classe "AnimalImmutable" che ritorni
      lui stesso una copia della "List" mutabile "favoriteFoods", a condizione che il chiamante comprenda che il modificare
      questa copia della "List" originale non cambierà di conseguenza in nessun modo l'oggetto "AnimalImmutable"
      originale.

 */

public class CreatingImmutableObjects {

}
