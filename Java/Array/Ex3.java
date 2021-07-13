package Lista3;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {

		int idade=0,menor21=0,maior50=0;
		Scanner leia = new Scanner(System.in);
		
		while(idade != -99) {
			System.out.println("Digite sua idade");
			idade = leia.nextInt();
			
			if(idade<21) {
				menor21+=1;
				
			}else if(idade > 50) {
				maior50+=1;
			}
		}
		
		System.out.println("Pessoas com a idade menor que 21: " + menor21);
		System.out.println("Pessoas com a idade maior que 50: " + maior50);

	}

}
