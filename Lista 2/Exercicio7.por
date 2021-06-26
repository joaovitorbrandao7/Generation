programa
{
	
	funcao inicio()
	{

	     inteiro Base, Altura, Area
	     
		escreva("Digite a base: ")
		leia(Base)

		escreva("Digite a altura: ")
		leia(Altura)

		se(Base >= 1 e Altura >= 1){
			Area = (Base*Altura)/2
			escreva("Valor da Área: " + Area)
		}senao{
			escreva("\nDigite valores válidos e positivos!")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 288; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */