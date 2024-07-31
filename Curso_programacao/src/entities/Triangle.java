package entities;

public class Triangle {
	//ATRIBUTOS
	public double a;
	public double b;
	public double c; 
	//METODO
	public double area() {
		//FUNÇÃO
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));

	}
} 