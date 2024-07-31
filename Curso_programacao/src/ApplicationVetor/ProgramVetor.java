/*Fazer um programa para ler um número inteiro N e a altura de N
pessoas. Armazene as N alturas em um vetor. Em seguida, mostrar a
altura média dessas pessoas.*/

package ApplicationVetor;

import java.util.Locale;
import java.util.Scanner;

public class ProgramVetor {

	public static void main(String[] args) {
			 
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the quantity of heigt:"); // Digite a quatidade de alturas
			int n = sc.nextInt();
			double[] vect = new double[n];
			
			System.out.println("Enter the Heigt:"); // Digite a altura
			for (int i=0; i<n; i++) {
			vect[i] = sc.nextDouble(); 
			}
			
			double sum = 0.0;
				for (int i=0; i<n; i++) {
				sum += vect[i];
			}
			double avg = sum / n;
			System.out.printf("AVERAGE HEIGHT: %.2f%n", avg); // Media das alturas
		
			sc.close(); 
	} 

}
