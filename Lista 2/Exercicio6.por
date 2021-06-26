programa
{
	
	funcao inicio()
	{
		inteiro n1

		escreva("Digite sua idade: ")
		leia(n1)

		se(n1 >= 5 e n1 <= 7){
			escreva("Infantil A")
		}senao se (n1 >= 8 e n1 <= 11){
			escreva("Infantil B")
		} senao se (n1 >= 12 e n1 <= 13){
			escreva("Juvenil A")
		} senao se (n1 >= 14 e n1 <= 17){
			escreva("Juvenil B")
		} senao {
			escreva("Adulto maior de 18")
		}
		}
	}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 367; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */