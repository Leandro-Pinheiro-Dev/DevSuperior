//Ler um número inteiro N e calcular todos os seus divisores.

import java.util.Scanner;

	public class Exercicio03For {

		public static void main(String[] args) {


			Scanner sc = new Scanner(System.in);

			System.out.println("digite o numero:");
			int n = sc.nextInt();
			System.out.println("seus divisores são:");
			
			for (int i=1; i<=n; i++) {
				if (n % i == 0) {
					System.out.println(i);
				}
			}
			
			sc.close();
		}
	}

 