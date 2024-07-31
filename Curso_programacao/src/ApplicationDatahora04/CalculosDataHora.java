package ApplicationDatahora04;

	import java.time.Duration;
	import java.time.Instant;
	import java.time.LocalDate;
	import java.time.LocalDateTime;
	import java.time.temporal.ChronoUnit;

	public class CalculosDataHora {

		public static void main(String[] args) { 

			LocalDate d04 = LocalDate.parse("2024-05-18");
			LocalDateTime d05 = LocalDateTime.parse("2024-05-18T01:30:26"); 
			Instant d06 = Instant.parse("2022-05-18T01:30:26Z");
			
			LocalDate pastWeekDate = d04.minusDays(7); //minusDays SUBTRAI OS DIAS ADICIONADO NO FORMATO d04
			LocalDate nextWeekDate = d04.plusDays(7);//plusDays SOMA OS DIAS ADICIONADO  NO FORMATO d04
			
			LocalDateTime pastWeekLocalDate = d05.minusDays(7);//minusDays SUBTRAI OS DIAS ADICIONADO NO FORMATO d05
			LocalDateTime nextWeekLocalDate = d05.plusDays(7);//plusDays SOMA OS DIAS ADICIONADO  NO FORMATO d05
			
			Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);//minus SUBTRAI OS DIAS ADICIONADO NO FORMATO d06
			Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);//plus SOMA OS DIAS ADICIONADO  NO FORMATO d06
			
			System.out.println("pastWeekDate = " + pastWeekDate);
			System.out.println("nextWeekDate = " + nextWeekDate); 
			
			System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
			System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);
			
			System.out.println("pastWeekInstant = " + pastWeekInstant);
			System.out.println("nextWeekInstant = " + nextWeekInstant);
			
			;//CALCULA A DURAÇÃO ENTRE DUAS SOLICITAÇÕES
			Duration t1 = Duration.between(pastWeekDate.atStartOfDay(), d04.atStartOfDay());
			Duration t2 = Duration.between(pastWeekLocalDate, d05);
			Duration t3 = Duration.between(pastWeekInstant, d06);
			Duration t4 = Duration.between(d06, pastWeekInstant);

			System.out.println("t1 dias = " + t1.toDays());
			System.out.println("t2 dias = " + t2.toDays());
			System.out.println("t3 dias = " + t3.toDays());
			System.out.println("t4 dias = " + t4.toDays());
		}
	}