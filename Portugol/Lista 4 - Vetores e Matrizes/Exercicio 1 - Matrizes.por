programa
{
	
	funcao inicio()
	{
		real num[3][3],somaDiagonal=0.0,somaN = 0.0
		inteiro l,c

		para(l=0;l<3;l++)
		{
			para(c=0;c<3;c++)
			{
				escreva("\nEntre com um valor: ") 
				leia(num[l][c])

				somaN = somaN + num[l][c]

				se(l == c)
				{
					somaDiagonal = somaDiagonal + num[l][c]
				
				}
			}
		}
		escreva("\nSoma da diagonal: ",somaDiagonal)
		escreva("\nSoma dos numeros: ",somaN)
	

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 93; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */