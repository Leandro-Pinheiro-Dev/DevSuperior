package ApplicationMatriz;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" digite a quantidade de linhas e colunas: ");
		int n=sc.nextInt();
		int[][] mat = new int [n][n]; //DOIS ABRE E FECHA CONCHETES[][]INDICA ARRANJO BIDIMENSIONAL[][][]SERIA TRIDIMENSIONAL
		
		System.out.println(" digite os numeros das linhas e colunas: ");
		for(int i=0;i<n;i++) { 
			for (int j=0; j<n;j++){
				mat[i][j]= sc.nextInt();
			}
		}
		System.out.println("Main Diagonal: ");
		for(int i=0; i<n; i++) {
			System.out.print(mat[i][i]+" ");
		}
		System.out.println();
		
		int count =0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(mat[i][j]<0) {
					count++;
				}			
			}
		}
		System.out.println("Negativo numbers: " + count);
		
		sc.close();
	}
}
