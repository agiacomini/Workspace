package com.giacomini.andrea.FunctionalProgramming.ExamEssential;

/**
 * Created by Andrea on 06/03/2019.
 */

/*
* N.B:  Le lambda expressione possono riferirsi a variabili statiche, variabili d'istanza,
*       parametri efficacemente final ed a variabili locali efficacemente final. Un'interfaccia
*       funzionale ha un singolo metodo abstract. Si devono conoscere le interfacce funzionali:
*
*           - Supplier<T>:          Method get() return T
*           - Consumer<T>:          Method accept(T t) return void
*           - BiConsumer<T,U>:      Method accept(T t, U u) return void
*           - Predicate<T>:         Method test(T t) return boolean
*           - BiPredicate<T,U>:     Method test(T t, U u) return boolean
*           - Function<T,R>:        Method apply(T t) return R
*           - BiFunction<T,U,R>:    Method apply(T t, U u) return R
*           - UnaryOperator<T>:     Method apply(T t) return T
*           - BinaryOperator<T>:    Method apply(T t1, T t2) return T
*
*       L'oggetto "Optional" può essere vuoto oppure memorizzare/archiviare un valore. E' possibile
*       controllare se contiene un valore con il metodo "isPresent()" e con il metodo "get()"
*       farsi restituire il valore stesso. Ci sono anche tre metodi che prendono interfacce
*       funzionali come parametri:
 *
 *          - "isPresent(Consumer c)",
 *          - "orElseGet(Supplier s)"
*           - "orElseThrow(Supplier s)"
*
 *      Esistono tre tipi opzionali per le primitive:
*
*           - OptionalDouble
*           - OptionalInt
*           - OptionalLong
*
*       Questi hanno i metodi (rispettivamente):
*
*           - getAsDouble()
*           - getAsInt
*           - getAsLong
*
*       Uno "Stream Pipeline" è composto di tre parti. La sorgente è richiesta e crea i dati
*       nello stream. Possono esserci una o più operazioni intermedie (Intermediate Operation)
*       che non vengono eseguite fino all'esecuzione dell'operazione terminale (Terminal Operation).
*       Esempi di operazioni intermedie sono "filter()", "flatMap()", e "sorted()". Esempi di
*       operazioni terminali includono "allMatch()", "count()" e "forEach()".
*       Esistono tre tipi di Stream di primitive:
*
*           - DoubleStream
*           - IntStream
*           - LongStream
*
*       In aggiunta ai metodi classici degli "Stream", gli stream di primitive "IntStream" e "LongStream"
*       hanno metodi come "range()" e "rangeClosed()". La chiamata del metodo "range(1,10)" su uno
*       Stream di tipo "IntStream" e "LongStream" crea uno "Stream" di primitive da 1 a 9. Al contrario,
*       il metodo "rangeClosed(1,10)" crea uno "Stream" di primitive da 1 a 10.
*       Gli "Stream" di primitive hanno operazioni matematiche inclusi i metodi "average()", "max()" e
*       "sum()". Inoltre hanno il metodo "summaryStatistics()" per ottenere molte statistiche in una
*       chiamata sola. Ci sono anche interfacce funzionali specifiche per gli "Stream". Ad eccezione
*       di "BooleanSupplier", sono tutte per le primitive "double", "int" e "long".
*       E' possibile usare un "Collector" per trasformare uno "Stream" in una tradizionale "Collections".
*       E' possibile anche raggruppare campi per creare una mappa complessa in una riga sola.
*       Il partizionamento funziona allo stesso modo del ragruppamento, ad eccezione del fatto che
*       le chiavi sono sempre TRUE o FALSE. Una mappa partizionata ha sempre due chiavi anche se
*       il valore è vuoto.
*       Si dovrebbe ri-controllare le tabelle di questo capitolo. Si dovrebbe assolutamente memorizzare
*       la tabella 4.1 (Common Functional Interface). Si dovrebbe memorizzare la tabelle 4.6 (Mapping
*       methods between types of "Stream") e la tabella 4.7 (Function parameters when mapping between
*       types of "Stream"), ma si dovrebbe essere in grado di individuare quantomeno le imcompatibilità,
*       come le differenze di tipo, se non si riesce a memorizzare queste due tabelle.
*       Infine, si ricordi che gli "Stream" sono lazy evaluated. Prendono le lambda expressione o i
*       "method references" come parametri, che si verificano successivamente quando il metodo
*       viene eseguito.
*
*       Exam Essential:
*       Identificare la corretta interfaccia funzionale dato il numero di parametri, il tipo di ritorno
*       e il nome del metodo - e viceversa. Le più comuni interfacce funzionali sono "Supplier",
*       "Consumer", "Function" e "Predicate". Esistono anche le versioni binarie (con due parametri
*       piuttosto che uno) e le versioni di primitive di molti di questi metodi.
*
*       Scrivere codice che usa "Optional". Per creare un "Optional" si usa "Optional.empty()" oppure
*       "Optional.of()". Viene recuperato frequentemente usando i metodi "isPresent()" e "get()".
*       Alternativamente, ci sono i metodi funzionali "isPresent()" e "ElseGet()".
*
*       Riconoscere quali operazioni causano l'esecuzione di uno "Stream" pipeline. Le "Intermediate
*       Operation" non vengono eseguite fino a quando non vengono incontrare le "Terminal Operation".
*       Se non ci sono "Terminal Operation" nella pipeline, uno "Stream" viene ritornato ma non eseguito.
*       Esempi di "Terminal Operation" includono "collect()", "forEach()", "min()" e "reduce()".
*
*       Determinare quali "Terminal Operation" sono riduzioni. Le riduzioni usano tutti gli elementi
*       dello "Stream" nel determinare il risultato. Le riduzioni che si devono ricordare assolutamente
*       sono "collect()", "count()", "max()", "min()" e "reduce()". Una riduzione mutabile viene
*       raccolta nello stesso oggetto da cui parte. Il metodo "collect()" è una riduzione mutabile.
*
*       Scrivere codice per le più comuni "Intermediate Operations". Il metodo "filter()" ritorna
*       uno "Stream" filtrato su un "Predicate". Il metodo "map()" ritorna uno "Stream" trasformando
*       ogni singolo elemento in un'altro attraverso una "Function". Il metodo "flatMap()" appiattisce
*       gli "Stream" annidati in un unico livello e rimuove gli "Stream" vuoti.
*
*       Confrontare gli "Stream di primitve" con gli "Stream". Di seguito tre classi di Stream di
*       primitive: "DoubleStream", "IntStream" e "LongStream". Ci sono anche tre classi "Optional" di
*       primitive: "OptionalDouble", "OptionalInt" e "OptionalLong". Ci sono un buon numero di
*       interfacce funzionali per primitive. A parte "BooleanSupplier", tutti coinvolgono primitive
*       "double", "int" e "long".
*
*       Convertire un tipo di "Stream" di primitive in un'altrp tipo di "Stream" di primitive.
*       Normalmente quanto si mappa, si chiama semplicemente il metodo "map()". Quando si cambia la
*       classe usata per lo "Stream" è necessario un metodo differente. Per convertire verso uno
*       "Stream" si usa "mapToObj()". Per convertire verso un "DoubleStream" si usa un metodo
*       "mapToDouble()". Per convertire verso un "IntStream()" si usa il metodo "mapToInt()".
*       Per convertire verso un "LongStream" si usa il metodo "mapToLong()".
*
*       Tradurre la codifica fatta con i "Method References" in lambda expression e viceversa.
*       Tutto il codice scritto con i "Method References" può essere riscritto con le lambda
*       expression. Per esempio, "stream.forEach(System.out::println)" fa la stessa cosa di
*       "stream.forEach( x -> System.out.println(x) )". Non tutto il codice scritto usando le
*       lambda può essere riscritto con i "Method References".
*
*       Usare il metodo "peek()" per ispezionare/controllare lo "Stream". Il metodo "peek()" è
*       un "Intermediate Operation". Esegue una lamnda expressione o un "Method References" sull'input
*       e passa quello stesso input attraverso la pipeline fino al prossimo operatore. E' utile
*       per stampare quello che passa ad un certo punto dello "Stream".
*
*       Cercare uno "Stream". I metodi "findFirst()" e "findAny()" ritornano un singolo elemento
*       da uno "Stream" in un'oggetto "Optional". I metodo "anyMatch()", "allMatch()" e "noneMatch()"
*       ritornano un "boolean" (primitiva). Prestare attenzione a questi metodi perché questi tre
*       possono appendersi (???) si chiamati su uno "Stream" infinito con alcuni dati. Tutti questi
*       metodo sono "Terminal Operation".
*
*       Ordinare uno "Stream". Il metodo "sort()" è una "Intermediate Operation" che ordina uno
*       "Stream". Queste sono due versioni: la firma con zero parametri che ordina usando l'ordine
*       naturale, e la firma con un parametro che ordina usando il "Comparator" come ordine di
*       ordinamento.
*
*
*
*
*
* */

public class Notes {
}
