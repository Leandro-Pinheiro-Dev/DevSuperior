import java.util.Locale;

public class TreinoResolvido {
		
		public static void main(String[] args) {
		String product1 = "computer";
		String product2 = "Office desk";
		
		int age = 30; //idade
		int code = 5290; //codigo
		char gender = 'F'; //genero
		
		double price1 = 2100.0; //preço1
		double price2 = 650.50; //preço2
		double measure = 53.234567;//medida
		
		System.out.println("products:");
		System.out.printf("%s, which price is $ %.2f%n", product1, price1);
		System.out.printf("%s, which price is $ %.2f%n", product2, price2);
		System.out.println();
		System.out.printf("Record: %d years old, code %d and gender: %c%n", age, code,gender );
		System.out.println();
		System.out.printf("Measure with eigth decimal places: %.8f%n",measure  ); //Medir com 8 casas decimais
		System.out.printf("Rounded (three decimal places):%.3f%n", measure); //Arredondado (3 casas decimais
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f%n", measure);//Ponto decimal dos EUA
		
		}
}
