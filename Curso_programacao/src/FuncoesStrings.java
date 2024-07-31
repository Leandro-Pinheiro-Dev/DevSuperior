
public class FuncoesStrings {
	public static void main(String[]args) {
	
	String original = "abcde FGHIJ ABC abc DEFG ";
	String s01 = original.toLowerCase();                    //IMPRIME A STRING INTEIRA COM LETRAS MINUSCULAS
	String s02 = original.toUpperCase();                    //IMPRIME A STRING INTEIRA COM LETRAS MAIUSCULAS
	String s03 = original.trim();  		               		//IMPRIME A STRING ELIMINANDO OS ESPAÇOS EM BRANCOS DAS PONTAS
	String s04 = original.substring(2);						//IMPRIME A STRING APARTIR DO 2 CARACTER OU SEJA LETRA 'C' POIS INICIA DO ZERO
	String s05 = original.substring(2, 9);					//IMPRIME A STRING APARTIR DO 2 CARATCTER ATE O 9 OU SEJA LETRA 'C' ATE 'H'
	String s06 = original.replace('a', 'x');				//IMPRIME A STRING FAZENDO A TROCA EXEMPLO SE TIVER LETRA 'A' POR 'X'
	String s07 = original.replace("abc", "xy");				//IMPRIME A STRING FAZENDO A TROCA EXEMPLO SE TIVER LETRA 'ABC' POR 'XY'
	
	int i = original.indexOf("bc");        //IMPRIME O VALOR DA VARIAVEL DE ACORDO COM A PRIMEIRA POSIÇÃO ENCONTRADA DA SUBSTRING 'BC' B=1
	int j = original.lastIndexOf("bc");    //IMPRIME O VALOR DA VARIAVEL DE ACORDO COM A ULTIMA  POSIÇÃO ENCONTRADA DA SUBSTRING  'BC' C=17 (NESSE CASO APARTIR DO B SOMANDO OS ESPAÇOS TAMBEM)
	
	System.out.println("Original: -" + original + "-");
	System.out.println("toLowerCase: -" + s01 + "-");
	System.out.println("toUpperCase: -" + s02 + "-");
	System.out.println("trim: -" + s03 + "-");
	System.out.println("substring(2): -" + s04 + "-");
	System.out.println("substring(2, 9): -" + s05 + "-"); 
	System.out.println("replace('a', 'x'): -" + s06 + "-");
	System.out.println("replace('abc', 'xy'): -" + s07 + "-"); 
	System.out.println("Index of 'bc': " + i);
	System.out.println("Last index of 'bc': " + j);

}
}