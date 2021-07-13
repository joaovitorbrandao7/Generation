package Lista3;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {

int n1=0,x,soma=0;
		
		Scanner leia = new Scanner (System.in);
		
		do {
			System.out.println("Digite um numero: ");
			n1 = leia.nextInt();
			
			soma+=n1;
			
		}while(n1!=0);
		System.out.println("A soma dos numeros digitados é: " + soma);
	}

}
