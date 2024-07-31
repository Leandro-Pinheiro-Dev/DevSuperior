import java.util.Scanner;

public class exercicio3 {
	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite valores inteiro");
			
		int A = sc.nextInt();                            
		int B = sc.nextInt(); 
		int C = sc.nextInt();  
		int D = sc.nextInt();  
	                            
	 int resultado = A*B- C*D;
		
		System.out.println("DIFERENCA:" + resultado);
	
		sc.close();
	}	

}

//Fazer um programa para ler quatro valores inteiros A, B, C e D. 
//A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D)