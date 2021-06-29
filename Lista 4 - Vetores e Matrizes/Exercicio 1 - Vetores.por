programa
{
/*Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.
- Criar um vetor
- 5 valores
- Exibir eles
- O maior deles e mostrar


*/
	
	funcao inicio()
	{
	    real pontua[5], maior=0
	    inteiro x
	   
	    para (x=0; x<5; x++){
	    escreva("Digite um numero: ")
	    	
	    leia(pontua[x])
	    
	    se(pontua[x]>maior)
	    maior = pontua[x]
	    }

         para(x=0; x < 5;x++){
	    escreva("\n Valor: ",pontua[x])
	    
	    }
	    escreva("\nO maior valor é: ", maior)
	    
	    
}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 475; 
 * @PONTOS-DE-PARADA = 16, 19, 21, 24, 28, 15, 31;
 * @SIMBOLOS-INSPECIONADOS = {pontua, 15, 10, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */