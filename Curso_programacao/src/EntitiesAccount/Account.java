package EntitiesAccount;

public class Account {
	
	private int number;      //numero da conta
	private String holder;   //titular da conta
	private double balance;  //saldo incial
	
	public Account(int number, String holder) { 
		this.number = number;
		this.holder = holder;
	} 

	public Account(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}

	public int getNumber() {
		return number;
	
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) { //deposito
		balance += amount;
	}
	
	public void withdraw(double amount) { //saque
		balance-= amount + 5.0;
	}

	public String toString() {
		return "Account "
				+ number
				+ ", Holder: " 
				+ holder
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
	}
}
    
 