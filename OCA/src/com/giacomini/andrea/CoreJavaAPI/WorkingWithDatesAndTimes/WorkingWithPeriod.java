package com.giacomini.andrea.CoreJavaAPI.WorkingWithDatesAndTimes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

public class WorkingWithPeriod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
		LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
		
		performAnimalEnrichment(start,end);
		
		Period period = Period.ofMonths(1);								// crea un periodo
		
		performAnimalEnrichment(start,end,period);
		
		/*
		 * N.B: Vediamo quali altri tipi di periodi è possible creare:
		 */
		Period annualy = Period.ofYears(1);								// ogni anno
		Period quartely = Period.ofMonths(3);							// ogni 3 mesi - trimestre
		Period everyThreeWeeks = Period.ofWeeks(3);						// ogni 3 settimane
		Period everyOtherDay = Period.ofDays(2);						// ogni 2 giorni
		Period everyYearAndWeek = Period.of(1, 0, 7);					// ogni anno e 7 giorni
		
		/*
		 * N.B: Non è possibile legare tra loro i metodi "of()" quando si crea un periodo. Infatti, essendo metodi "static"
		 * 		non è possibile, come nel codice di seguito, creare un periodo come "everyYearAndWeek" usando più metodi "of"
		 * 		perché come in questo caso verrebbe considerato solo l'ultimo dei metodi della catena.  
		 */
		Period wrong = Period.ofYears(1).ofWeeks(1);					// ogni settimana
		
		/*
		 * N.B: Per unità di periodi inferiori al "1 day" esiste invece un'altra classe chiamata "Duration".
		 * 		Per "Duration" è possibile specificare il numero di giorni, ore, minuti, secondi e nanosecondi.
		 * 		Sarebbe possibile (ma è SCONSIGLIATO) passare 365 giorni a "Duration" per fare "1 Year".
		 * 		"Duration" non sarà presente nell'esame OCA.
		 */
		
		
		LocalDate date = LocalDate.of(2015, 1, 20);
		LocalTime time = LocalTime.of(6, 15);
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		
		/*
		 * Di seguito altri esempi di uso della classe "Period".
		 */
		Period period1 = Period.ofMonths(1);
		
		System.out.println(date.plus(period1));							// 2015-02-20
		System.out.println(dateTime.plus(period1));						// 2015-02-20T06:15
//		System.out.println(time.plus(period1));							// ECCEZIONE - UnsupportedTemporalTypeException
		

	}

	// Il problema è che questo metodo non può essere riutilizzato.
	private static void performAnimalEnrichment(LocalDate start, LocalDate end) {
		LocalDate upTo = start;
		
		while(upTo.isBefore(end)){
			System.out.println("1- give new toy " + upTo);
			upTo = upTo.plusMonths(1);
		}
	}
		
	// Questo metodo invece aggiunge un periodo di tempo arbitrario. Questo permette di riusare lo stesso metodo
	// per periodi di tempo differenti.
	private static void performAnimalEnrichment(LocalDate start, LocalDate end, Period period) {
		LocalDate upTo = start;
		
		while(upTo.isBefore(end)){
			System.out.println("2- give new toy " + upTo);
			upTo = upTo.plus(period);
		}		
	}

}
