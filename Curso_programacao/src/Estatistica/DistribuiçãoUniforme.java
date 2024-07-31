package Estatistica;
import java.util.Locale;
import java.util.Scanner;

public class DistribuiçãoUniforme {
    public static double calcularProbabilidade(double a, double b, double c, double d) {
        return ((d - c) / (b - a)) * 100.0;
    }

    public static double calcularMedia(double a, double b) {
        return (a + b) / 2.0;
    }

    public static double calcularDesvioPadrao(double a, double b) {
        return Math.sqrt(Math.pow(b - a, 2) / 12.0);
    }

    public static double calcularVariancia(double a, double b) {
        return Math.pow(b - a, 2) / 12.0;
    }

    public static double calcularCoeficienteVariacao(double desvioPadrao, double media) {
        return (desvioPadrao / media) * 100.0;
    }

    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Selecione a opção que deseja calcular:");
        System.out.println("1. Probabilidade");
        System.out.println("2. Média");
        System.out.println("3. Desvio Padrão");
        System.out.println("4. Variância");
        System.out.println("5. Coeficiente de Variação");
        System.out.print("Opção: ");
        int opcao = scanner.nextInt();

        double a, b, c, d, resultado;
        
        switch (opcao) {
            case 1:
                System.out.print("Digite o limite do intervalo [a]: ");
                a = scanner.nextDouble();
                System.out.print("Digite o limite do intervalo [b]: ");
                b = scanner.nextDouble();
                System.out.print("Digite o limite do intervalo [c]: ");
                c = scanner.nextDouble();
                System.out.print("Digite o limite do intervalo [d]: ");
                d = scanner.nextDouble();
                resultado = calcularProbabilidade(a, b, c, d);
                System.out.printf("Probabilidade: %.2f%%\n", resultado);
                break;

            case 2:
                System.out.print("Digite o limite do intervalo [a]: ");
                a = scanner.nextDouble();
                System.out.print("Digite o limite do intervalo [b]: ");
                b = scanner.nextDouble();
                resultado = calcularMedia(a, b);
                System.out.printf("Média: %.2f\n", resultado);
                break;

            case 3:
                System.out.print("Digite o limite do intervalo [a]: ");
                a = scanner.nextDouble();
                System.out.print("Digite o limite do intervalo [b]: ");
                b = scanner.nextDouble();
                resultado = calcularDesvioPadrao(a, b);
                System.out.printf("Desvio Padrão: %.2f\n", resultado);
                break;

            case 4:
                System.out.print("Digite o limite do intervalo [a]: ");
                a = scanner.nextDouble();
                System.out.print("Digite o limite do intervalo [b]: ");
                b = scanner.nextDouble();
                resultado = calcularVariancia(a, b);
                System.out.printf("Variância: %.2f\n", resultado);
                break;

            case 5:
                System.out.print("Digite o limite do intervalo [a]: ");
                a = scanner.nextDouble();
                System.out.print("Digite o limite do intervalo [b]: ");
                b = scanner.nextDouble();
                double desvioPadrao = calcularDesvioPadrao(a, b);
                double media = calcularMedia(a, b);
                resultado = calcularCoeficienteVariacao(desvioPadrao, media);
                System.out.printf("Coeficiente de Variação: %.2f%%\n", resultado);
                break;

            default:
                System.out.println("Opção inválida!");
                break;
        }

        scanner.close();
    }
}