package ApplicationDatahora03;

	import java.time.Instant;
	import java.time.LocalDate;
	import java.time.LocalDateTime;
	import java.time.ZoneId;

	public class ConversãoGlobalParaLocal {
		
		public static void main(String[] args) {

			// for (String s : ZoneId.getAvailableZoneIds()) // RETORNA OS NOMES DO FUSO HORARIO CUSTOMIZADOS
			// System.out.println(s); 

			LocalDate d04 = LocalDate.parse("2024-05-18"); //DATA 
			LocalDateTime d05 = LocalDateTime.parse("2024-05-18T15:19:26");//DATA HORA
			Instant d06 = Instant.parse("2024-05-18T15:19:26Z");//DATA HORA LOCAL

			LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());//CONVERTE PARA LOCAL CONSIDERANDO HORARIO DO COMPUTADOR
			LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));// CONVERTE PARA PORTUGAL
			LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());//HORARIO BRASIL 
			LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));// HORARIO PORTUGAL

			System.out.println("r1 = " + r1); 
			System.out.println("r2 = " + r2); 
			System.out.println("r3 = " + r3); 
			System.out.println("r4 = " + r4); 

			System.out.println("d04 dia = " + d04.getDayOfMonth()); // IMPRIME DIA
			System.out.println("d04 mês = " + d04.getMonthValue());// IMPRIME MES
			System.out.println("d04 ano = " + d04.getYear());// IMPRIME ANO

			System.out.println("d05 hora = " + d05.getHour());// IMPRIME HORA
			System.out.println("d05 minutos = " + d05.getMinute());// IMPRIME MINUTOS

		}
	}