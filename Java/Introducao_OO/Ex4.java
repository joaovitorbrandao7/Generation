package Familia28;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {

        float a,b,c;
        double r,d,s;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite A: ");
		a = leia.nextFloat();
		
		System.out.println("Digite B: ");
		b = leia.nextFloat();
		
		System.out.println("Digite C: ");
		c = leia.nextFloat();
		
		r = Math.pow(a+b,2);
		s = Math.pow(b+c, 2);
		d = (r + s)/2;
		
		System.out.println("Valor de A: " + a);
		System.out.println("Valor de B: " + b);
		System.out.println("Valor de C: " + c);
		System.out.println("Valor de R: " + r);
		System.out.println("Valor de S: " + s);
		System.out.println("Valor de D: " + d);
		

	}

}
