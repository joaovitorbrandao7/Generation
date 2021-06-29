programa
{
	
	funcao inicio()
	{
		inteiro pesoTomate, Excesso, Multa, pesoPadrao = 50.0

		escreva("Digite o peso do saco do tomate: ")
		leia(pesoTomate)

          Excesso = (pesoTomate%pesoPadrao)
		Multa = Excesso*4
		
		se(Excesso >= 1){
	
		escreva("\n Você excedeu " + Excesso + "kg da quantidade permitida, você devera pagar R$:" + Multa + " de multa!")
		
		} senao {
		Excesso = 0
		Multa = 0
		escreva("\n Você excedeu " + Excesso + "kg da quantidade permitida, você devera pagar R$:" + Multa + " de multa!")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 399; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */