//Fazer um programa para ler um temperatura em celsius e mostrar o equivalente em fahrenheit.
//Perguntar se o usuario deseja repetir (S/N).Caso o usuario digite"S",Repetir o programa
// FORMULA F=9*C/5+32;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01DoWhile {
	
	public static void main(String[]args) {
	
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	char resp;
	
	do {
		System.out.println("digite a temperatura em celsius: ");
		double C = sc.nextDouble();
		double F = 9.0* C / 5.0 + 32.0;
		System.out.printf("Equivalente em fahrenheit: %.1f%n",F);
		System.out.print("Deseja repetir(S/n)?");
		resp = sc.next().charAt(0);
	} while (resp !='n');
	
	sc.close();
	}
} 