package Familia28;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Loja {

	public static void main(String[] args) {

		int n, op;
		List<String> pecas = new ArrayList<String>();
		
		Scanner leia = new Scanner(System.in);
		
		do {
		System.out.println("\nLOJA\n 1 - Cadastrar \n 2 - Remover \n 3 - Atualizar \n 4 - Listar todos dados \n 0 - Encerrar o programa");
		op = leia.nextInt();
		switch(op) {
		
		case 1:
			
			leia.nextLine();
			System.out.println("\nDigite o produto para adicionar ao estoque: ");
			System.out.println();

			String nome = leia.nextLine();
			nome = leia.nextLine();
			
			pecas.add(nome);
			
		break;
		
		case 2:
			leia.nextLine();		
			System.out.println("\nDigite o nome do produto que deseja remover: ");
			String novo = leia.nextLine();
			
			System.out.println();
			
			if(pecas.contains(novo));
			pecas.remove(novo);
			
				System.out.println("\nProduto removido com sucesso! ");
			
			break;
			
		case 3: 
			leia.nextLine();			
			System.out.println("\nDigite o nome do produto que deseja alterar: ");
			String troca = leia.nextLine();
			System.out.println();

			if(pecas.contains(troca)) {
				pecas.remove(troca);
				
				System.out.println("\nDigite o nome do novo produto: ");
				String novo1 = leia.nextLine();
				System.out.println();

				pecas.add(novo1);
				System.out.println("\nProduto alterado!");
			}else {
				System.out.println("Esse produto não existe! ");
			}
			break;
			
		case 4:
			System.out.println(pecas);
			
			default:
				System.out.println("\nDigite um valor válido! ");
		}
		
		
	}while(op!=0);
System.out.println("Fim do programa! ");
}
}
