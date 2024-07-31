/*Uma operadora de telefonia cobra R$ 50.00 por um plano básico que
dá direito a 100 minutos de telefone. Cada minuto que exceder a
franquia de 100 minutos custa R$ 2.00. Fazer um programa para ler a
quantidade de minutos que uma pessoa consumiu, daí mostrar o valor
a ser pago.*/

import java.util.Locale;
import java.util.Scanner;

public class AtribuicaoAcumulativa {

	public static void main(String[] args) {
 
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite minutos falados:");
		int minutos = sc.nextInt();
		
		double conta = 50.0;
		if ( minutos > 100 ) {
			conta += (minutos - 100 ) * 2.0;
		}
   	//OU  CONTA = CONTA +(MINUTOS - 100 ) * 2.0;//

		System.out.printf("valor da conta = R$ %.2f%n",conta);
		
		sc.close();
	}

}

//OPERADORES DE ATRIBUIÇÃO ACUMULATIVA//
// A += B; é A = A+B;//
// A -= B; é A = A-B;//
// A *= B; é A = A*B;//
// A /= B; é A = A/B;//
// A %= B; é A = A%B;//