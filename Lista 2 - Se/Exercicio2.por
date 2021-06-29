programa
{
	
	funcao inicio()
	{
		inteiro horasTrabalhadas, Codigo, salarioHora = 10, salarioFinal, excessoHora, excessoValor

		 escreva("Digite seu codigo de operario: ")
		 leia(Codigo)

           escreva("Digite a quantidade de horas trabalhadas: ")
		 leia(horasTrabalhadas)

		 se(horasTrabalhadas > 50){
		 	excessoHora = horasTrabalhadas-50
		 	excessoValor = excessoHora*20
		 	salarioFinal = (horasTrabalhadas*salarioHora)+excessoValor
		 	escreva("Operario: " + Codigo + ", voce trabalhou " + horasTrabalhadas + " e você excedeu " + excessoHora + " hora(s), e ganhou R$" + excessoValor + " reais de adional, seu salario final é R$:" + salarioFinal)
		 	
		 } senao {
		 	excessoHora = 0
		 	excessoValor = 0
		 	salarioFinal = (horasTrabalhadas*salarioHora)+excessoValor
		 	escreva("Operario: " + Codigo + ", voce trabalhou " + horasTrabalhadas + " hora(s) e você excedeu " + excessoHora + " hora(s), e ganhou R$" + excessoValor + " reais de adional, seu salario final é R$:" + salarioFinal)
		 }

		 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 353; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */