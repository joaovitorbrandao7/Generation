package Lista4;

import java.util.Scanner;

public class Ex2 {
/*
 * 2- Faça um programa que receba 6 números inteiros e mostre:
• Os números pares digitados;
• A soma dos números pares digitados;
• Os números ímpares digitados;
• A quantidade de números ímpares digitados.*/
	
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int Vetor[] = new int [6], x, pares=0, impares=0, soma=0;

		
		for(x=0; x <= 5; x++) {
			System.out.println("Digite o " + x + "º valor: ");
			Vetor[x] = leia.nextInt();
			
		}
		for(x=0; x <=5; x++) {
			if(Vetor[x] % 2 == 0) {
				pares+=Vetor[x];
				System.out.println("Vetor par: " + Vetor[x]);
				
			} else {
				impares+=1;
				System.out.println("Vetor impar: " + Vetor[x]);

			}
			
		}
		
		System.out.println("A soma dos pares: " + pares);
		System.out.println("Quantidade de impares digitados: " + impares);

		}
	}


