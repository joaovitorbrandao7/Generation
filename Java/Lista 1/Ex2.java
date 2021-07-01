package Familia28;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {

		int ano,mes,dias,idade;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite sua idade em dias: ");
		dias = leia.nextInt();
		
		ano = (dias/365);
		mes = (dias%365)/30;
		dias = (dias%365)%30;
		
		idade = ano + dias + mes;
		
		System.out.println("Você tem: "+ ano + " anos " + mes + " meses " + dias + " dias ");
		

	
	}

}
