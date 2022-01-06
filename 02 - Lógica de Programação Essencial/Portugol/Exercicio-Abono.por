programa
{
	
	funcao inicio()
	{
		inteiro janeiro, fevereiro, marco, abril, media, total
		
		escreva("Vendas: ")
		escreva("\nJaneiro: ")
		leia(janeiro)
		escreva("\nFevereiro: ")
		leia(fevereiro)
		escreva("\nMarço: ")
		leia(marco)
		escreva("\nAbril: ")
		leia(abril)

		total = janeiro+fevereiro+marco+abril
		media = total / 4
		escreva("--------------------")
		escreva("\n    Vendas")
		escreva("\n--------------------")
		escreva("\nTotal: " + total)
		escreva("\nMedia: " + media)
		se (media > 5000){
			escreva("\n\nAbono: 10%\nValor: " + total*0.1)
		} senao {
			escreva("\n\nAbono: 3%\nValor: " + total*0.03)
		}
		escreva("\n--------------------")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 649; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */