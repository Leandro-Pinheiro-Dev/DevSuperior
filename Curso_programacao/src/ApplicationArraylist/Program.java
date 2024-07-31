package ApplicationArraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program { 

	public static void main(String[] args) {
		
		List<String> list = new ArrayList <>();

		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2,"marco");// PARA ADICONAR NA POSICAO list.add(int index,string elemento) NO LUGAR DO BOB
		
		System.out.println(list.size());// VE O TAMANHO DA LISTA
		
		for (String x:list) { // for Each 
			System.out.println(x);//IMPRIME
		}
		System.out.println("--------------");
		
		list.remove("Anna");//VAI REMOVER ANNA, MAS A LISTA CONTINUA TENDO 5
		list.remove(1);// É PRA REMOVER O ALEX
		list.removeIf(x -> x.charAt(0)== 'M');//REMOVER POR UM PREDICADO OU SEJA TODAS QUE COMEÇA COM A LETRA M MAIUSCULA
		
		for (String x:list) { // for Each 
			System.out.println(x);//IMRIME 
		}
		System.out.println("--------------");
		System.out.println("Index of bob: " + list.indexOf("Bob"));//ENCONTRA A POSIÇÃO DE UM ELEMENTO EXEMPLO BOB
		System.out.println("Index of Maria: " + list.indexOf("maria"));//QUANDO NÃO ENCONTRA O ELEMENTO RETORNA -1
		
		System.out.println("--------------");
		List<String> result = list.stream().filter(x -> x.charAt(0)== 'B').collect(Collectors.toList());//FILTRA A LISTA E IMPRIME TODOS QUE COMEÇA COM A LETRA B
		
		for (String x:result) { // for Each 
			System.out.println(x);//IMRIME
		}
		System.out.println("--------------");
		String name =list.stream().filter(x -> x.charAt(0)== 'm').findFirst().orElse(null);//ENCONTRA O PRIMEIRO ELEMENTO CONFORME O SOLICITADO EXEMPLO m,CASO NÃO ENCONTRE RETORNA NULL
		System.out.println(name);
	}

}
