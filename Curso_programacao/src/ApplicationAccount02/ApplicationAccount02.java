package ApplicationAccount02;

import java.util.Locale;
import java.util.Scanner;

import EntitiesAccount.Account;

public class ApplicationAccount02 {

	public static void main(String[] args) { 
		
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in); 
		Account account;

		System.out.println("Enter account number: "); // Digite o numero da conta
		int number = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter account holder: "); // Digite o nome do titular
		String holder = sc.nextLine();
		
		System.out.println("Is there an initial deposit (y/n)? "); //tem uma valor inicial sim ou nao
		char response = sc.next().charAt(0);
		if (response =='y') {
			System.out.println("Enter initial deposit value: "); // sim qual valor
			double initialdeposit = sc.nextDouble();
			account = new Account(number, holder, initialdeposit);
		}
		else {
			account = new Account(number, holder);	
		}
		
		System.out.println();
		System.out.println("Account data: "); // dados atualizado
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a deposit value: "); //deposite valor
		double depositvalue = sc.nextDouble();
		account.deposit(depositvalue);
		System.out.println("Update account data: "); // dados atualizado com novo valor
		System.out.println(account);
	
		System.out.println();
		System.out.print("Enter a withdraw value: "); // vai Sacar algum valor
		double withdrawvalue = sc.nextDouble();
		account.withdraw(withdrawvalue);
		System.out.println("Update account data: "); // dados atualizado com novo valor
		System.out.println(account);
		
		sc.close(); 
 
	}

}
