import java.util.Locale;
import java.util.Scanner;

public class exercicio4 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o numero do funcionario:");
		int NUMBER = sc.nextInt();   //NUMERO DO FUNCIONARIO       
		System.out.println("Digite as horas trabalhadas:");
		int HT = sc.nextInt();       //HORAS TRABALHADAS
		System.out.println("Digite o valor hora:");
		double VH = sc.nextDouble();       //VALOR POR HORA
	                            
	  double SALARY = HT*VH;
	  double SALARYBR = SALARY*5.60;
		
	  System.out.println("NUMBER:" + NUMBER);
	  System.out.printf("SALARY= U$%.2f%n",SALARY);
	  System.out.printf("SALARIO EM REAIS = R$%.2f%n",SALARYBR);
	
		sc.close();
	}	

}
