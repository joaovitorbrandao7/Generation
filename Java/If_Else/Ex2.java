package Lista2;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int idade;
		
		System.out.println("Digite a idade: ");
		idade = leia.nextInt();
		
		if(idade >=10 && idade <=14) {
			System.out.println("Idade: "+idade + " | Categoria: Infantil");
			} 
		else if(idade >=15 && idade <=17) {
			System.out.println("Idade: "+ idade + " | Categoria: Juvenil");

		} else if(idade >=18 && idade <=25) {
			System.out.println("Idade: "+ idade + " | Categoria: Adulto");
         }else {
 			System.out.println("Idade: "+ idade + " | Categoria: Idoso");

         }

	}
}

