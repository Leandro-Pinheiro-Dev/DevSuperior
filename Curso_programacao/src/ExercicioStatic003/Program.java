
package ExercicioStatic003;

import java.util.Locale;
import java.util.Scanner;

import Entities003.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? "); //Qual é o preço do dólar?
		double dollarPrice = sc.nextDouble();
		System.out.print("How many dollars will be bought? "); //Quantos dólares serão comprados?
		double amount = sc.nextDouble();
		double result = CurrencyConverter.dollarToReal(amount, dollarPrice);
		System.out.printf("Amount to be paid in reais = %.2f%n", result); //Valor a ser pago em reais
		
		sc.close(); 
	} 
}  
