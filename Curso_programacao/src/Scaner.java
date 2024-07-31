import java.util.Scanner;

public class Scaner {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String x;
		int y;
		double z;
		char a;
		
		x = sc.next();                             // Quando for texto               sc.next
		y = sc.nextInt();                          // Quando for numeros inteiros    sc.nextint
		z = sc.nextDouble();                       // Quando for numeros flutuantes  sc.nextDouble
		a = sc.next().charAt(0);                   // Quando for um carater          sc.next().charAt(0);
		
		System.out.println("Dados digitados:");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(a);
	
// ATENCAO >no caso Doble Para considerar o separador de decimais como ponto,ANTES da declaracao do Scannner faca:
// Locale.setdefault(locale.US); 		
		
		sc.close();
	}	
}
