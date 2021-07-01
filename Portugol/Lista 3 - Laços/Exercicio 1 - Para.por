programa
{
/*A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes,
coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:
a) média do salário da população;
b) média do número de filhos;
c) maior salário;
d) percentual de pessoas com salário até R$100,00.*/

inclua biblioteca Matematica -->mat
	funcao inicio()
	{

	     //DECLARAÇÃO DE VARIAVEIS
		real habitantes, salario, mediaSalario, salarioTotal=0, percentualSalario=0, maiorSalario=0, percentualSalarioMedia, filhos, filhosTotal=0, mediaFilhos
          inteiro x

          //INICIANDO O LAÇO PARA RECOLHER OS VALORES
		para(x=1; x<=20; x++){
			escreva(x + "º habitante, digite seu salário: ")
			leia(salario)

			escreva(x + "º habitante, digite quantos filhos você tem: ")
			leia(filhos)

               //FUNÇÃO PARA ACUMULAR OS VALORES DE SALARIOS
			salarioTotal += salario
			//FUNÇÃO PARA ACUMULAR OS VALORES DOS FILHOS
			filhosTotal += filhos

               //SALARIO
               //UM SE PARA VERIFICAR O MAIOR SALARIO
			se(salario > maiorSalario){ //SE O SALARIO ATUAL FOR MAIOR DO QUE O ACUMULADOR ELE VAI SER O VALOR DE MAIOR SALARIO
			maiorSalario = salario
			
			}senao{
				salario = 0
			}

               //UM SE PARA VERIFICAR OS SALARIOS MENORES OU IGUAIS QUE 100
			se(salario <= 100){
				percentualSalario+=1// SE FOR MENOR, ELE ACUMULA +1 		
			}
				
		}
		mediaSalario = salarioTotal/20 //CRIANDO A MEDIA DOS SALARIOS
		mediaFilhos = filhosTotal/20 //CRIANDO A MEDIA DE FILHOS
		percentualSalarioMedia = (percentualSalario*100)/20 //CRIANDO O PERCENTUAL MEDIO DE SALARIOS

		escreva("\nA) Média do salário da população: ", mat.arredondar(mediaSalario, 2))
		escreva("\nB) Média do número de filhos: ", mat.arredondar(mediaFilhos, 2))
		escreva("\nC) Maior salário: ", maiorSalario)
		escreva("\nD) Percentual de pessoas com salário até R$100,00: ", mat.arredondar(percentualSalarioMedia, 2), "%")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1571; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */