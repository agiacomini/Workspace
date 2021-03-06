package com.giacomini.andrea.CoreJavaAPI.CreatingAndManipulatingStrings;

/*
 * N.B: Al fine di rispariamo memoria al programma (visto che le String occupano una parte consistende della momoria
 * 		dedicata al programma), JAVA colleziona tutte le String del programma in un "string pool" (= intern pool)
 * 		in modo che la JVM vada a pescarle da li.
 * 		L'"internal pool" contiene tutti i valori letterali che compaiono nel programma.
 */

public class TheStringPool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * N.B: "name" è un letterale e quindi viene messa nello string pool.
		 */
		String name = "Fluffy";
		
		/*
		 * N.B: In questo modo invece si dice alla JVM di non mettere "name2" nello stirng pool (risparmando spazio),
		 * 		ma si stà dicendo a JAVA di creare un nuovo oggetto anche se in modo meno efficiente.
		 */
		String name2 = new String("Fluffy");

	}

}
