package Lista3;

import java.util.Scanner;

public class Ex6 {
/* Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)*/
	
	public static void main(String[] args) {

        float n1=0, x, mult=0, media=0,total=0;
		Scanner leia = new Scanner (System.in);
		
		do {
			System.out.println("Digite um numero: ");
			n1 = leia.nextFloat();
			if(n1%3==0.0) {
				total+=1;
				mult += n1;
				media = mult / total;
			}
		}while(n1!=0);
		
		System.out.println("A média dos numeros multiplos de 3: " + media);
	}

}
