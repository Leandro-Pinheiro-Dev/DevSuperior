package ExercicioOOP01;

import java.util.Locale;
import java.util.Scanner;

import Entities01.Rectangle;

	public class Program3 {
		public static void main(String[] args) {
			
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
		Rectangle rect = new Rectangle();
		
		System.out.println("Enter rectangle width and height:");
		rect.Width = sc.nextDouble();
		rect.Height= sc.nextDouble();
		
		System.out.printf("AREA = %.2f%n", rect.AREA());
		System.out.printf("PERIMETER = %.2f%n", rect.PERIMETER());
		System.out.printf("DIAGONAL = %.2f%n", rect.DIAGONAL());
		 
		sc.close();
		
		}
}



