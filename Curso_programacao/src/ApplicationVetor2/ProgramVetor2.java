/*Fazer um programa para ler um número inteiro N e os dados (nome e
preço) de N Produtos. Armazene os N produtos em um vetor. Em
seguida, mostrar o preço médio dos produtos.*/

package ApplicationVetor2;

import java.util.Locale;
import java.util.Scanner;
import EntitiesVetor2.ProductVetor2;

	public class ProgramVetor2 { 

		public static void main(String[] args) {
				
				Locale.setDefault(Locale.US);
				Scanner sc = new Scanner(System.in); 
				
				System.out.println("Enter the quantity of product:"); // Digite a quantidade de product 
				int n = sc.nextInt();
				ProductVetor2[] vect = new ProductVetor2[n];
				
				System.out.println("Enter the name and price:"); // Digite o nome e Preço
				for(int i=0; i<vect.length; i++) {
					sc.nextLine();
					String name = sc.nextLine();
					double price = sc.nextDouble();
					vect[i] = new ProductVetor2(name,price);
				}
				double sum = 0.0;
				for(int i=0; i<n; i++) {
					sum += vect[i].getPrice();
				}
				double avg = sum / vect.length;
				System.out.printf("AVERAGE PRICE = %.2f%n", avg); //Media dos Preços
				
				sc.close();  

		}
}