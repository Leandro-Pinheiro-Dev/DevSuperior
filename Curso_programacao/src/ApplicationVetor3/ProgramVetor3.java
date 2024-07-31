package ApplicationVetor3;

import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

import EntitiesVetor3.RentVetor3;


public class ProgramVetor3 {
	
	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		RentVetor3[] vect = new RentVetor3[10];
		
		System.out.print("How many rooms will be rented? "); //Quantos quartos serão alugados
		int n = sc.nextInt();
		 
		for (int i = 1; i <=n; i++) {
			System.out.println(); 
			System.out.println("Rent #" + i + ":"); 
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine(); 
			System.out.print("Email: "); 
			String email = sc.nextLine();
			System.out.print("Room: "); 
			int room = sc.nextInt();
			vect[room] = new RentVetor3(name, email);
		}
		
		System.out.println();
		System.out.println("Busy rooms:"); // quartos ocupados
		for (int i = 0; i < 10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]); 
			}
		}
		sc.close();
	}

}
