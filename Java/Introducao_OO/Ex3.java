package Familia28;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {

		int horas,minutos,segundos;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a hora em segundos: ");
		segundos = leia.nextInt();
		
		horas = segundos/3600;
		minutos = (segundos%3600)/60;
		segundos = (segundos%3600)%60;
		
	    System.out.println("O horario é: "+ horas + " horas " + minutos + " minutos " + segundos + " segundos ");	
	}

}
