programa
{
	
	funcao inicio()
	{
		real media, nota1, nota2, nota3, nota4
		inteiro bimestre = 1

		//Inicializando as notas
		nota1 = 0
		nota2 = 0
		nota3 = 0
		nota4 = 0

		//Pega todas as notas usando um loop Enquanto
		enquanto (bimestre <= 4)	{
			
			escreva("infome a nota do " + bimestre + "º bimestre: ")
			se (bimestre == 1) {
				leia(nota1)
			}
			senao se (bimestre == 2)	{
				leia(nota2)
			}
			senao se (bimestre == 3)	{
				leia(nota3)
			}
			senao se (bimestre == 4)	{
				leia(nota4)
			}
			//Pode ser utilizado a incremento ++ (bimestre++), tem o mesmo resultado
			bimestre = bimestre + 1
		}
		
		media = (nota1+nota2+nota3+nota4)/4
		escreva("Sua média é: " + media + "\n")

		// Verifica se a nota é maior ou igual a 7
		se (media >= 7){
			escreva("Parabens, você foi aprovado.")
		}
		senao{
			escreva("Foi mal, você vai para a recuperaçao.")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 588; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */