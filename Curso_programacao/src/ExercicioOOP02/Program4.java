package ExercicioOOP02;

import java.util.Locale;
import java.util.Scanner;

import Entities02.Employee;

public class Program4 {
	 
	public static void main(String[]args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee Emp = new Employee();
		
		System.out.print("Name: ");
		Emp.name = sc.nextLine();
		System.out.print("Gross salary: ");
		Emp.GrossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		Emp.Tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + Emp);
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		Emp.increaseSalary(percentage);
		System.out.println();
		System.out.println("Updated data: " + Emp);
		sc.close();
	}

}
