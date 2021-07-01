package Familia28;


import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {

		 float n1,n2,n3,media;
			
			Scanner leia = new Scanner(System.in);
			
			System.out.println("Digite a nota 1: ");
			n1 = leia.nextFloat();
			
			System.out.println("Digite a nota 2: ");
			n2 = leia.nextFloat();
			
			System.out.println("Digite a nota 3: ");
			n3 = leia.nextFloat();
			
			media = ((n1*2)+(n2*3)+(n3*5))/10;
			
			System.out.println("A nota é: " + media);

	}

}
