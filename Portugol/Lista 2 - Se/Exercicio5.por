programa
{
	
	funcao inicio()
	{
		real nivelPoluicao

		escreva("Digite o nivel atual de poluicao: ")
		leia(nivelPoluicao)

		     se(nivelPoluicao >= 0.05 e nivelPoluicao <= 0.25){
				escreva("Nivel Aceitavel!")
				 
			}senao se(nivelPoluicao == 0.3){
				escreva("GRUPO 1 - SUSPENDA AS ATIVIDADES!")
				
			}senao se(nivelPoluicao == 0.4){
				escreva("GRUPO 1 E 2 - SUSPENDAM AS ATIVIDADES!")
				 
			}senao se(nivelPoluicao >= 0.5){
				escreva("TODOS OS GRUPOS DEVEM PARAR AS ATIVIDADES")
			}senao{
				escreva("Niveis suaves")
			}
			
		}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 175; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */