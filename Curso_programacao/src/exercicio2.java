import java.util.Scanner;

public class exercicio2 {
		
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			double raio = sc.nextDouble();   
			double PI = 3.14159;
			int y = 2;
			
	        double raio1 = Math.pow(raio,y);       
	        double A = raio1 * PI;
			
			System.out.printf("A= %.4f%n",A);
			
		
			sc.close();
		}	
	}

//Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro casas decimais 
//Fórmula da área: area = π . raio2
//Considere o valor de π = 3.14159