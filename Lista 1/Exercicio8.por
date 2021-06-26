programa
{
	//O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
//percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
//Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
//escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao
//consumidor.
	funcao inicio()
	{
		real custoConsumidor, custoFabrica, percentagemDistribuidor, imposto

		escreva("Digite o valor de fabrica do carro: ")
		leia(custoFabrica)

		percentagemDistribuidor = 0.28 * custoFabrica
		imposto = 0.45 * custoFabrica

		custoConsumidor = custoFabrica +(percentagemDistribuidor + imposto)
		escreva("Valor do carro para consumidor é: " + custoConsumidor)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 589; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */