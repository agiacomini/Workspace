package com.giacomini.andrea.ClassDesign.UnderstandingPolymorphism;

/*
 * N.B: Ritorniamo solo per un momento alle ultime tre regole dell'Overriding dei metodi (ClassDesign - IntroducingClassInheritance -
 * 		InheritanceMethods) per dimostrare come il POLIMORFISMO richiede loro di essere incluse come parte delle JAVA specification.
 * 		Vedremo come senza tali regole, è facile costruire un esempio con il polimorfismo in JAVA.
 * 		La prima regola delle tre in questione è che un metodo overridden deve essere almeno accedibile come il metodo di 
 * 		cui fa l'overiding. Assumiamo che questa regola non sia necessaria.
 * 		
 * 		Guarda gli esempi: com.giacomini.andrea.ClassDesign.UnderstandingPolymorphism.Examples.Animal;
 * 						   com.giacomini.andrea.ClassDesign.UnderstandingPolymorphism.Examples.Gorilla;
 * 						   com.giacomini.andrea.ClassDesign.UnderstandingPolymorphism.Examples.ZooKeeper;
 * 
 * 		Per questa discussione, ignoreremo il fatto che l'implementazione del metodo "getName()" nella classe "Gorilla" non compila
 * 		in quanto il metodo nella classe figlia è meno accedibile del metodo di cui fa l'overriding nella classe padre.
 * 		Come si vede, questo esempio crea un problema di ambiguità nella classe "ZooKeeper". Il riferimento "animal.getName()"
 * 		è permesso perché il metodo è PUBLIC nella classe "Animal", ma per via del polimorfismo, l'oggetto "Gorilla" stesso è stato
 * 		overridden con una versione meno accedibile, non disponibile nella classe "ZooKeeper". Questo crea una contraddizione in 
 * 		quanto il compilatore non dovrebbe permettere l'accesso a questo metodo, ma siccome è stato referenziato come un'istanza
 * 		di "Animal" allora è permesso. Quindi JAVA è eliminato questa contraddizione, non consentendo in tal modo al metodo di
 * 		essere overridden da una versione meno accedibile del metodo.
 * 		Allo stesso modo, una sotto-classe non può dichiarare un metodo overridden con una nuova o più ampia eccezione di quella
 * 		nella super-classe, in quanto il metodo può essere acceduto usando un riferimento alla superclasse. Per esempio, se un'istanza
 * 		della sotto-classe è passata ad un metodo usando un riferimento della super-classe,      
 */

public class PolymorphismAndMethodOverriding {

}
