package com.giacomini.andrea.CoreJavaAPI.UsingStringBuilderClass;

public class ImportantStringBuilderMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * N.B: Questi 4 metodi "charAt()", "indexOf()", "length()" e "substring()" sono esattamente uguali a quelli
		 * 		già visti per gli oggetti String. 
		 */
		StringBuilder sb = new StringBuilder("animals");

		// Si noti comunque che il metodo "substring()", anche se si tratta di un metodo dell'oggetto StringBuilder
		// ritorna però un'oggetto String.
		String sub = sb.substring(sb.indexOf("a"),sb.indexOf("al"));
		
		int len = sb.length();
		char ch = sb.charAt(6);
		
		System.out.println(sub + " " + len + " " + ch);							// anim 7 s
		
		/*
		 * N.B: Il metodo "append()" aggiunge in coda all'oggetto StringBuilder il parametro passato al metodo e ritorna
		 * 		un riferimento a quell'oggetto StringBuilder.
		 * 		E' possibile richiamare il metodo anche subito dopo la creazione dell'oggetto (new), inoltre è possibile
		 * 		chiamare il metodo "append()" anche senza convertire a String il parametro passato.
		 */
		StringBuilder sb1 = new StringBuilder().append(1).append('c');
		sb1.append("-").append(true);
		System.out.println(sb1);												// 1c-true
		
		/*
		 * N.B: Il metodo "insert()" aggiunge caratteri all'oggetto StringBuilder specificando l'indice dello slot
		 * 		dove aggiungere il carattere specificato dal parametro. Ritorna sempre un riferimento a quell'oggetto.
		 */
		StringBuilder sb2 = new StringBuilder("animals");
		sb2.insert(7, "-");						// sb2 = "animals-"
		sb2.insert(0, "-");						// sb2 = "-animals-"
		sb2.insert(4, "-");						// sb2 = "-ani-mals-"
		System.out.println(sb2);				// sb2 = "-ani-mals-"
		
		/*
		 * N.B: Il metodo "delete()" e "deleteCharAt()" sono gli opposti del metodo "insert()".
		 * 		Infatti "delete()" rimuove i caratteri dalla sequenza e ritorna sempre un riferimento a quell'oggetto
		 * 		StringBuilder. Il metodo "deleteCharAt()" invece è utili quando si vuole rimuovere un solo carattere
		 * 		dalla sequenza.
		 */
		StringBuilder sb3 = new StringBuilder("abcdef");
		sb3.delete(1,3);					// sb3 = "adef"
//		sb3.deleteCharAt(5);				// throw exception: StringIndexOutOfBoundsException
		System.out.println(sb3);
		
		/*
		 * N.B: Il metodo "reverse()" inverte semplicemente l'ordine dei caratteri presenti nella sequenza dell'oggetto
		 * 		StringBuilder. 
		 */
		StringBuilder sb4 = new StringBuilder("ABC");
		sb4.reverse();
		System.out.println(sb4);			// CBA
		
		
		/*
		 * N.B: Il meotdo "toString()" converte un'oggetto StringBuilder in un'oggetto String.
		 * 		Generalmente lo StringBuilder viene usato internamente per una questione di performance ma alla
		 * 		fine il risultato finale necessità di essere un'oggetto String, per esempio quando è necessario
		 * 		passarlo come input ad un'altro metodo.
		 */
		StringBuilder sb5 = new StringBuilder();
		sb5.append("AAaa");
		String s = sb5.toString();
		System.out.println(s);				// AAaa
	}

}
