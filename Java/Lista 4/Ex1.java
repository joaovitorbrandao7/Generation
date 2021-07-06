package Lista4;

import java.util.Scanner;

public class Ex1 {
/* 1- Faça um programa que possua um vetor denominado A que armazene 6 números
inteiros. O programa deve executar os seguintes passos:
(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7.
(b) Armazene em uma variável inteira (simples) a soma entre os valores das posições
A[0], A[1] e A[5] do vetor e mostre na tela esta soma.
(c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100.
(d) Mostre na tela cada valor do vetor A, um em cada linha.*/
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int Vetor [] = new int [6], x, soma=0;
		
		for(x=0; x <= 5; x++) {
			
		System.out.println("Digite o " + x + "º valor do vetor: ");
		Vetor[x] = leia.nextInt();
		
		}
	
	    soma = Vetor[0] + Vetor[1] + Vetor[5];	
		Vetor[3] = 100;
		
		for(x=0; x <= 5; x++) {
			System.out.println("\nVetor A [" + x + "] " + " = " + Vetor[x]);
		}
		
		System.out.println("\nA soma entre os valores das posições\r\n"
				+ "[0], [1] e [5] é: " + soma);
		
	}
		
	}


