package Lista4;

import java.util.Scanner;

public class Ex3 {
/* Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui. */
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int Matriz [][] = new int [3][3], x,y,M10=0;
		
		for(x=0; x <= 2; x++) {
			for(y=0; y<=2; y++) {
				System.out.println("Digite um numero: ");
				Matriz[x][y] = leia.nextInt();
				
				if(Matriz[x][y] > 10) {
					M10+=1;
					
				}
				
			}

		}
		
		System.out.println("A matriz possui: " + M10 + " valores maiores que 10");

	}

}
