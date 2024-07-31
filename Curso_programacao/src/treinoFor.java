import java.util.Scanner;

	public class treinoFor {

		public static void main(String[] args){
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("digite quantos numeros irão somar:");
			int N = sc.nextInt(); 
			System.out.println("digite os numeros que  irão somar:");
		
			int soma = 0;
			for (int i =0; i<N; i ++) {
	            int x = sc.nextInt();
	            
	            soma = soma + x;
			}
			System.out.println("resultado:"+soma);
			
			sc.close();
		}
	}