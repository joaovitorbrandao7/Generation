package Familia28;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {

		float custoFabrica, porcDistribuidor, impostos, valorCliente;
		
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o custo de fábrica: ");
		custoFabrica = leia.nextFloat();
		
		porcDistribuidor = (custoFabrica * 28)/100;
		impostos = (custoFabrica * 45)/100;
		
		valorCliente = custoFabrica + porcDistribuidor + impostos;
		
		System.out.println("Custo do carro para o cliente R$:" + valorCliente);
		
	}

}
