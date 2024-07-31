package Applicationarraylist01;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entitiesArraylist01.Employee;



public class Program {

	public static void main(String[] args) {  

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();
		
		// PART 1 - READING DATA:
		
		System.out.print("How many employees will be registered? ");//QUANTOS FUNCIONARIOS SERÃO CADASTRADOS?
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println();
			System.out.println("Employee #" + i + ": "); //FUNCIONARIO

			System.out.print("Id: "); 
			int id = sc.nextInt();
			while (hasId(list, id)) {
				System.out.print("Id already taken. Try again: ");//JA REGSITRADO TENTE NOVAMENTE
				id = sc.nextInt();
			}
			
			System.out.print("Name: "); //NOME 
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");//SALARIO
			double salary = sc.nextDouble();
			list.add(new Employee(id, name, salary));
		}

		// PART 2 - UPDATING SALARY OF GIVEN EMPLOYEE:
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");//INSIRA o ID do FUNCIONARIO QUE TERA AUMENTO:
		int id = sc.nextInt();
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist!");//ESTE ID NÃO EXISTE!
		}
		else {
			System.out.print("Enter the percentage: ");//INSIRA PORCENTAGEM
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}
		
		// PART 3 - LISTING EMPLOYEES:
		
		System.out.println();
		System.out.println("List of employees:");//LISTA DE FUNCIONARIOS
		for (Employee obj : list) {
			System.out.println(obj);
		}
				
		sc.close(); 
	} 
	
	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	} 
}