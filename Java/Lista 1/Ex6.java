package Familia28;

import java.lang.Math;
import java.util.Scanner;


public class Ex6 {

	public static void main(String[] args) {

	double x1,x2,y1,y2,d;
		
	Scanner leia = new Scanner(System.in);
	
	System.out.println("Digite a nota X2: ");
	x2 = leia.nextDouble();
	
	System.out.println("Digite a nota X1: ");
	x1 = leia.nextDouble();
	
	System.out.println("Digite a nota Y2: ");
	y2 = leia.nextDouble();
	
	System.out.println("Digite a nota Y1: ");
	y1 = leia.nextDouble();
	

	d = Math.sqrt(((Math.pow(x2-x1, 2))+(Math.pow(y2-y1, 2))));
	}

}
