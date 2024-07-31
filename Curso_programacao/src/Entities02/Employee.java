package Entities02;

public class Employee { // Employee = funcionário
	public String name;
	public double GrossSalary; // Salario bruto
	public double Tax;
	
	public double netSalary() { //Salario liquido
		return GrossSalary - Tax;
	}
	public void increaseSalary(double percentage) { // aumento de Salario
		GrossSalary += GrossSalary * percentage / 100.0;
		
	}
	public String toString() {
		return name + ", $ " + String.format("%.2f", netSalary());
	}
}