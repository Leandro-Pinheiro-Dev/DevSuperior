//Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. 
//Escreva um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 4.Fim).
//Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até que seja válido). 
//O programa será encerrado quando o código informado for o número 4. 
//Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustíve

import java.util.Scanner;

public class Exercicio03While {
    
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        int tipo;
        
        while (true) {
            System.out.println("Digite o tipo de combustivel:");
            tipo = sc.nextInt();
            
            if (tipo == 4) {
                break; // Encerra o loop se o tipo for 4
            }
            
            if (tipo < 1 || tipo > 3) {
                System.out.println("Valor inválido!");
                continue; // Volta ao início do loop para obter uma entrada válida
            }
            
            switch (tipo) {
                case 1:
                    alcool++;
                    break;
                case 2:
                    gasolina++;
                    break;
                case 3:
                    diesel++;
                    break;
            }
        }
        
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
        
        sc.close();
    }
}