package Lista3;

import java.util.Scanner;

public class Ex4 {
/* Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
 o número de pessoas calmas;
 o número de mulheres nervosas;
 o número de homens agressivos;
 o número de outros calmos;
 o número de pessoas nervosas com mais de 40 anos;
 o número de pessoas calmas com menos de 18 anos.*/
	
	public static void main(String[] args) {

		int idade=0, x=0, op=0, op1=0, op2=0, op3=0, pCalmas=0, mNervosas=0, hNervosos=0,mAgressiva=0, hAgressivos=0, oCalmos=0, oNervosos=0, oAgressivos=0, pNervosas40=0, pCalmas18=0, N40=0, M18=0;
		
		Scanner leia = new Scanner (System.in);
				
		while(idade != -1) {
			System.out.println("Digite sua idade: ");
			idade = leia.nextInt();
			
			System.out.println("Digite seu sexo: \n 1- Feminino \n 2- Masculino \n 3- Outros ");
            op = leia.nextInt();
			switch(op) {
			
	case 1: 
				
				System.out.println("MULHERES \n Você se considera uma pessoa \n 1 - Calma \n 2 - Nervosa \n 3 - Agressiva");
	            op1 = leia.nextInt();

				switch(op1) {
				case 1:
					pCalmas+=1;
					if(idade <= 18) {
						M18+=1;
					}
					break;
					
				case 2: 
					mNervosas+=1;
					if(idade >= 40) {
						N40+=1;
					}
					break;
					
				case 3:
					mAgressiva+=1;
					break;
					
													
				}
			
				break;
				/*  ----------------------------------------------------------------------------------------------------- */
				
	case 2:
				System.out.println("HOMENS \n Você se considera uma pessoa \n 1 - Calma \n 2 - Nervosa \n 3 - Agressiva");
	            op2 = leia.nextInt();

				switch(op2) {
				case 1:
					pCalmas+=1;
					if(idade <= 18) {
						M18+=1;
					}
					break;
					
				case 2: 
					hNervosos+=1;
					if(idade >= 40) {
						N40+=1;
					}
					break;
					
				case 3:
					hAgressivos+=1;
					break;
									
				}
				break;

				
				/*  ----------------------------------------------------------------------------------------------------- */

				
	case 3:
				System.out.println("OUTROS \n Você se considera uma pessoa \n 1 - Calma \n 2 - Nervosa \n 3 - Agressiva");
	            op3 = leia.nextInt();

				switch(op3) {
				case 1:
					pCalmas+=1;
					oCalmos+=1;
					if(idade <= 18) {
						M18+=1;
					}
					break;
					
				case 2: 
					oNervosos+=1;
					if(idade >= 40) {
						N40+=1;
					}
					break;
					
				case 3:
					oAgressivos+=1;
					break;
					
			}
				break;

				
				/*  ----------------------------------------------------------------------------------------------------- */

				
	default: 
				System.out.println("Digite uma opção valida");
		} 
			
		
	}
		System.out.println("O número de pessoas calmas: " + pCalmas);
		System.out.println("O número de mulheres nervosas: " + mNervosas);
		System.out.println("O número de pessoas calmas: " + pCalmas);
		System.out.println("O número de homens agressivos: " + hAgressivos);
		System.out.println("O número de outros calmos: " + oCalmos);
		System.out.println("O número de pessoas nervosas com mais de 40 anos: " + N40);
		System.out.println("O número de pessoas calmas com menos de 18 anos: " + M18);


}
}
