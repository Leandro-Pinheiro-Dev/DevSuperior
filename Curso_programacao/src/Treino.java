import java.util.Locale;

public class Treino {
	
	public static void main(String[] args) {
	String product1 = "computer";
	String product2 = "Office desk";
	
	int age = 30;
	int code = 5290;
	char gender = 'f';
	
	double price1 = 2100.0;
	double price2 = 650.50;
	double measure = 53.234567;
	
	System.out.printf("Produtos:%n%s,which price is $%f%n", product1, price1);
	System.out.printf("%s,which price is $%f%n", product2, price2);
	System.out.printf("%n %d years old, code %d and gender: %s%n", age, code,gender );
	System.out.printf("%n Measure with eigth decimal places: %f%n",measure  );
	System.out.printf("Rouded (three decimal places):%.3f", measure);
	
	Locale.setDefault(Locale.US);
	System.out.printf("%nUS decimal point:%.3f", measure);
	
	}
}