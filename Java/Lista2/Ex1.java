package Lista2;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {

		
		Scanner leia = new Scanner(System.in);
		int n1, n2,n3;
		
		System.out.println("Digite n1: ");
		n1 = leia.nextInt();
		
		System.out.println("Digite n2: ");
		n2 = leia.nextInt();
		
		System.out.println("Digite n3: ");
		n3 = leia.nextInt();
		
		
		if(n1 > n2 && n1 > n3) {
			System.out.println("O maior é: " + n1);
			
		}else if(n2 > n1 && n2 > n3) {
			System.out.println("O maior é: " + n2);

		}else {
			System.out.println("O maior é: " + n3);

		}

	}
}
