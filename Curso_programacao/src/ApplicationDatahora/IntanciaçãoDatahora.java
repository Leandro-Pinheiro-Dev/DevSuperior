package ApplicationDatahora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class IntanciaçãoDatahora {

	public static void main(String[] args) {  

		// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		//LINK DE FORMATAÇÃO DateTimeFormatter 
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");// TEXTO CUSTOMIZADO
		DateTimeFormatter fmt2 =  DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");// TEXTO CUSTOMIZADO
		
		LocalDate d01 = LocalDate.now();//IMPRIME A DATA LOCAL
		LocalDateTime d02 = LocalDateTime.now();//IMPRIME A DATA E HORA 
		Instant d03 = Instant.now();////IMPRIME A DATA E HORA LOCAL DE LONDRES
		
		LocalDate d04 = LocalDate.parse("2024-05-18");// VOCE DIGITA O TEXTO CONFORME A ISO 8601 DATA
		LocalDateTime d05 = LocalDateTime.parse("2022-05-18T01:30:26");//VOCE DIGITA O TEXTO CONFORME A ISO 8601 DATA E HORA
		Instant d06 = Instant.parse("2022-05-18T01:30:26Z");//VOCE DIGITA O TEXTO CONFORME A ISO 8601 DATA HORA E LOCAL LONDRES
		Instant d07 = Instant.parse("2022-05-18T01:30:26-03:00"); //VOCE DIGITA O TEXTO CONFORME A ISO 8601 DATA HORA E LOCAL SAO PAULO
		

		LocalDate d08 = LocalDate.parse("18/05/2025", fmt1);// INSTANCIA APARTIR DO TEXTO CUSTOMIZADO
		LocalDateTime d09 = LocalDateTime.parse("18/05/2024 01:30", fmt2);// INSTANCIA APARTIR DO TEXTO CUSTOMIZADO

		LocalDate d10 = LocalDate.of(2024, 05, 18);
		LocalDateTime d11 = LocalDateTime.of(2024, 05, 18, 1, 30);
		
		System.out.println("d01 = " + d01.toString());
		System.out.println("d02 = " + d02.toString());
		System.out.println("d03 = " + d03.toString());
		System.out.println("d04 = " + d04.toString());
		System.out.println("d05 = " + d05.toString());
		System.out.println("d06 = " + d06.toString());
		System.out.println("d07 = " + d07.toString());
		System.out.println("d08 = " + d08.toString());
		System.out.println("d09 = " + d09.toString());
		System.out.println("d10 = " + d10.toString());
		System.out.println("d11 = " + d11.toString());
	}
}