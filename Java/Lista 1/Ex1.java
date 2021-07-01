package Familia28;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {

		int ano,mes,dias,idade;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite sua idade em Anos: ");
		ano = leia.nextInt();
		
		System.out.println("Digite sua idade em Meses: ");
		mes = leia.nextInt();
		
		System.out.println("Digite sua idade em Dias: ");
		dias = leia.nextInt();
		
		idade = (ano*365)+(mes*30)+dias;
		
		System.out.println("Sua idade em dia é: "+idade);
		

		
		
		
		
	}

}
