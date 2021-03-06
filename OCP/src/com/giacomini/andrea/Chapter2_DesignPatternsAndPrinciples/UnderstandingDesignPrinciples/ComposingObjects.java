package com.giacomini.andrea.DesignPatternsAndPrinciples.UnderstandingDesignPrinciples;

/*
N.B: Nella progettazione orientata agli oggetti, ci si riferisce ad "object composition" come la proprietà di costruire
     una classe usando riferimenti ad altre classi al fine di ri-usare le funzionalità delle altre classi.
     In particolare, le classi che contengono altre classi, nel senso "has-a", possono delegare metodi alle altre classi.
     La composizione di oggetti dovrebbe essere vista come una alternativa all'ereditarietà ed è spesso usata per simulare
     un comportamento poliformico che non potrebbe essere ottenuto attraverso la singola ereditarietà.
     Per esempio, si immagini di avere le seguenti due classi:

     Guarda gli esempi: com.giacomini.andrea.OCP.DesignPatternsAndPrinciples.UnderstandingDesignPrinciples.Test.Flippers;
                        com.giacomini.andrea.OCP.DesignPatternsAndPrinciples.UnderstandingDesignPrinciples.Test.WebbedFeet;

     Provando a relazionare questi oggetti usando la gerarchia non ha senso, come "WebbedFeet" non sono uguali a "Flippers".
     Invece, è possibile comporre una nuova classe che contenga entrambi gli oggetti e deleghi a loro i propri metodi, come
     nell'esempio seguente:

     Guarda gli esempi: com.giacomini.andrea.OCP.DesignPatternsAndPrinciples.UnderstandingDesignPrinciples.Test.Penguin;

     Come si può vedere, questa nuova classe "Penguin" è composta di un'istanza di "Flippers" ed una di "WebbedFeet".
     Inoltre, i metodi "flap()" e "kick()" sono delegati alle altre classi, con i metodi nella classe "Pinguin" lunghi solo
     una riga. Si noti che l'implementazione di questi metodi, nelle classi delegate, sono anch'essi su di una sola riga,
     ma potrebbero essere anche più complesse.
     Uno dei vantaggi della composizione di oggetti sulla gerarchia è che tende a promuovere maggiormente il riuso di codice.
     Usando la composizione di oggetti, si può ottenre accesso alle altre classi e metodi che sarebbe difficile da ottenre
     altrimenti attraverso un modello di singola ereditarietà.
     Nei precedenti esempi, la classe "Flippers" può essere riusata in classi completamente non relazionate a "Penguin" o a
     "Bird", come per esempio in classi "Dolphin" o "Turtles".
     Alternativamente, se la classe "Flippers" fosse stata ereditata dalla classe "Penguin", il fatto di usarla in altre
     classi non relazionate sarebbe difficile senza rompere il modello delle classi oppure senza avere l'altra classe
     contenuta in un'istanza di "Penguin". Per esempio, sarebbe stupido dire che un "Dolphin" è ereditato da un "Penguin"
     o che ha un'istanza della classe "Penguin", solo perché un "Dolphin" ha "Flippers", e "Flippers" eredita dalla
     classe "Penguin".
     La composizione di oggetti può sembrare molto più attrattiva che l'ereditarietà per via della sua natura riusabile,
     ma si ricordi che uno dei punti di forza di Java è il suo potente modello di ereditarietà. La composizione di oggetti
     richiede ancora di esporre esplicitamente i metodi sottostanti e i valori, mentre l'ereditarietà include
     automaticamente membri PROTECTED e PUBLIC. Inoltre, usando l'overriding dei metodi per determinare dinamicamente
     quale metodo selezionare a runtime è uno strumento estremamente potente per la costruzione di classi intelligenti.
     In altre parole, sia la composizione di oggetti che l'ereditarietà hanno il loro giusto posto nello sviluppo di
     buon codice, e in molti casi può essere difficile scegliere quale soluzione adottare.

 */

public class ComposingObjects {
}
