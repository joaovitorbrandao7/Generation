package Lista4;

import java.util.Scanner;

public class Ex4 {
/*4- Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um
menu de opções:
(1) somar as duas matrizes
(2) subtrair a primeira matriz da segunda
(3) adicionar uma constante as duas matrizes
(4) imprimir as matrizes
Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. Na terceira opção o valor
da constante deve ser lido e o resultado da adição da constante deve ser armazenado na
própria matriz.*/
	
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int Matriz [][] = new int [2][2],x,y,op,cons;
		int Matriz2 [][] = new int [2][2];
		int Matriz3 [][] = new int [2][2];
		
		for(x=0; x <= 1; x++) {
			for(y=0; y<=1; y++) {
				System.out.println("Digite os valores da 1º matriz: ");
				Matriz[x][y] = leia.nextInt();	
				
			}		
			}	
		for(x=0; x <= 1; x++) {
			for(y=0; y<=1; y++) {
				System.out.println("Digite os valores da 2º matriz: ");
				Matriz2[x][y] = leia.nextInt();	
				
			}		
			}	
		
		
		System.out.println("(1) Somar as duas matrizes\r\n"
				+ "(2) Subtrair a primeira matriz da segunda\r\n"
				+ "(3) Adicionar uma constante as duas matrizes\r\n"
				+ "(4) Imprimir as matrizes ");
		op = leia.nextInt();
		
		switch(op) {
		case 1:
			
			for(x=0; x<2; x++) {
				for(y=0; y<2; y++) {
					
				Matriz3[x][y] = Matriz[x][y] + Matriz2[x][y];
	              System.out.println("Soma das matrizes: " + Matriz3[x][y]);	

				}
			}
              break;
              
		case 2:
			for(x=0; x<2; x++) {
				for(y=0; y<2; y++) {
					
					Matriz3[x][y] = Matriz[x][y] - Matriz2[x][y];
		              System.out.println("Subtração das matrizes: " + Matriz3[x][y]);	

				}
			}
              break;
		
		case 3:
			System.out.println("Digite o valor para a constante: ");
			cons = leia.nextInt();
			for(x=0; x<2; x++) {
				for(y=0; y<2; y++) {
					
				Matriz[x][y] =  Matriz[x][y] + cons;
				Matriz2[x][y] =  Matriz2[x][y] + cons;

				System.out.println("1º Matriz: " + Matriz[x][y]); 
				System.out.println("2º Matriz: " + Matriz2[x][y]);
						
				}
			}
			break;
		case 4:
			for(x=0; x<2; x++) {
				for(y=0; y<2; y++) {
					
				System.out.println("1º Matriz: " + Matriz[x][y]); 
						
				}
			}
			for(x=0; x<2; x++) {
				for(y=0; y<2; y++) {
					
				System.out.println("2º Matriz: " + Matriz2[x][y]); 
						
				}
			}
			break;
			
		default:
			System.out.println("Digite valores validos!");

		}
	}
		}
		
