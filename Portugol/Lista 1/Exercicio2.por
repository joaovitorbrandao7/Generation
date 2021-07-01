programa
{
	
	funcao inicio()
	{
	//criando as variaveis
		inteiro idade,dias,meses,anos
//lendo os valores atribuido as variaveis
		escreva("Digite sua idade em dias: ")
		leia(dias)

//criando a função que vai transformar dias em anos
		anos = (dias/365)
		meses = (dias%365)/30
		dias = (dias%365)%30
//exibindo os valores
	     escreva(anos + " anos "  + meses + " meses " + dias + " dias ")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 330; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */