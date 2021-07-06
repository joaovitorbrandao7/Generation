package Lista2;

import java.util.Scanner;
import java.lang.Math;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		double n1,resul;
		
		System.out.println("Digite n1: ");
		n1 = leia.nextDouble();
		
		if(n1%2==0) {
		resul = Math.sqrt(n1);
		System.out.println("Numero par: " + n1 + " Ele em raiz quadrada é: "+ resul);
		
		}else {
			resul = Math.pow(n1,3);
			System.out.println("Numero impar: " + n1 + " Ele em raiz quadrada é: "+ resul);
		}
		
	}

}
