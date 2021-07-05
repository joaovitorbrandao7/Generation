package Lista3;

import java.util.Scanner;

public class Ex2 {
	
/*Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)*/
	
	public static void main(String[] args) {

		int n1,x,par=0,impar=0;
		
		Scanner leia = new Scanner (System.in);
		
		for(x=1; x <=10; x++) {
			System.out.println("Digite um numero: ");
			n1 = leia.nextInt();
			
			if(n1 % 2 == 0) {
				par+=1;
			}else {
				impar+=1;
			}
		}
		
		System.out.println("Numeros de numeros pares: " + par);
		System.out.println("Numeros de numeros impares: " + impar);
	}

}
