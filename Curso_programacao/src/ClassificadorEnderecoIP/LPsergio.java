/*O esquema de endereçamento de rede mais comum é chamado IPv4.
Os endereços IPv4 consistem de endereços de 32 bits divididos em 4 octetos. 
Crie um programa em C que leia os 4 octetos de um endereço IP e o classifique */

package ClassificadorEnderecoIP;

import java.util.Scanner;

public class LPsergio {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Digite os 4 octetos do endereço IP conforme solicitado a seguir.\n ");
	        System.out.print("\nDigite o primeiro octeto do endereço IP (1 a 255): ");
	        int octeto1 = scanner.nextInt();

	        if (octeto1 < 1 || octeto1 > 255) {
	            System.out.println("\nO primeiro octeto está fora do intervalo válido.");
	            return;
	        }

	        System.out.print("Digite o segundo octeto do endereço IP (0 a 254): ");
	        int octeto2 = scanner.nextInt();

	        if (octeto2 < 0 || octeto2 > 254) {
	            System.out.println("\nO segundo octeto está fora do intervalo válido.");
	            return;
	        }

	        System.out.print("Digite o terceiro octeto do endereço IP (0 a 254): ");
	        int octeto3 = scanner.nextInt();

	        if (octeto3 < 0 || octeto3 > 254) {
	            System.out.println("\nO terceiro octeto está fora do intervalo válido.");
	            return;
	        }

	        System.out.print("Digite o quarto octeto do endereço IP (0 a 254): ");
	        int octeto4 = scanner.nextInt();

	        if (octeto4 < 0 || octeto4 > 254) {
	            System.out.println("\nO quarto octeto está fora do intervalo válido.");
	            return;
	        }

	        if (octeto1 >= 0 && octeto1 <= 126) {
	            System.out.println("\nClasse A 16.777.216");
	        } else if (octeto1 >= 128 && octeto1 <= 191) {
	            System.out.println("\nClasse B 65.536");
	        } else if (octeto1 >= 192 && octeto1 <= 223) {
	            System.out.println("\nClasse C 255");
	        } else if (octeto1 >= 224 && octeto1 <= 239) {
	            System.out.println("\nMultiplex");
	        } else if (octeto1 >= 240 && octeto1 <= 255) {
	            System.out.println("\nEndereços futuros");
	        } else {
	            System.out.println("\nEndereço IP inválido");
	            return;
	        }

	        System.out.println("\nEndereço IP digitado: " + octeto1 + "." + octeto2 + "." + octeto3 + "." + octeto4);
	    }
	}