programa
{
	
	funcao inicio()
	{
	//Declarando variaveis
		inteiro segundos,horas,minutos

     //Pedindo o dado ao usuario
		escreva("Digite os segundos: ")
	//Lendo o valor que foi atribuido
		leia(segundos)
    //Escrevendo as funções
		horas = (segundos/3600)
		minutos = (segundos%3600)/60
		segundos = (segundos%3600)%60
      //exibindo os valores
		escreva(horas, " horas ", minutos, " minutos ", segundos, " segundos ")

		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 359; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */