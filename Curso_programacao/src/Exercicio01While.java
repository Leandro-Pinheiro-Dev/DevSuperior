//Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
//incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
//impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.

import java.util.Scanner;

	public class Exercicio01While {
		
		public static void main (String[] args){
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Digite a Senha: ");
			int Senha = sc.nextInt();
			
			while(Senha != 2002 ) {
				System.out.println("Senha Invalida");
				Senha = sc.nextInt();
			}
			
			System.out.println("Acesso Permitido");
			
			sc.close();
		}
	}


