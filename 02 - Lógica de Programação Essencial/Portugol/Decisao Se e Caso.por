programa
{
	
	funcao inicio()
	{
		inteiro menu = 0
		
		escreva("1 - Netflix\n2 - Amazon Prime\n3 - HBO GO\n4 - Sair\n\nDigite um opção: ")
		leia(menu)

		/*
		se (menu==1){
			escreva("OK!! Abrir NetFlix!")
		}

		se (menu==2){
			escreva("OK!! Abrir Amazon Prime")
		}

		se (menu==3){
			escreva("OK!! Abrir HBO GO")
		}

		se (menu==4){
			escreva("Saindo do menu")
		}
		*/
		//refatorando com o Caso
		escolha (menu) 
		{
			caso 1:  // testa valor = 1 
				escreva("Ok! Abrir Netflix!!")
				pare
			caso 2:
				escreva("OK!! Abrir Amazon Prime")
				pare
			caso 3:
				escreva("OK!! Abrir HBO GO")
				pare
			caso 4:
				escreva("Saindo do menu")
				pare
			caso contrario:
				escreva("Opções válidas 1, 2, 3 e 4")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 413; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */