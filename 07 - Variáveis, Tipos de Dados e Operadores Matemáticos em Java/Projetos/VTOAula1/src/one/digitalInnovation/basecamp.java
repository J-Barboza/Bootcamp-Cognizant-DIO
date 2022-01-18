package one.digitalInnovation;

public class basecamp {

    public static void main(String[] args) {

        int i;
        //int i; // Não é permitido definir variáveis com o mesmo nome
        int I;
        //int 1a; // Não é permitido iniciar com número
        int _1a; // Não é boa prática iniciar com _ (underline)
        int $aq; // Não é boa prática iniciar com $ (sifrão)

        i = 5;
        I = 20;
        _1a = 20;
        $aq = 7;

        final int j = 10; // Não é erro, mas como boa prática manter os caracteres MAIUSCÚLAS com palavras separada por underline.
        //j = 15; //Não é permitido alterar o valor de uma variável do tipo "final", pois são constantes
        int asrn24678md; // não é usual, mas é permitido
        //int asrn246 78md; //não é permitido espaços;
        int asrn2$4678_md = 10;  //válido
        //int asrn2$46%78_md = 10; // carater % ()  é inválido

        asrn24678md = 100;
        asrn2$4678_md = 10;

        int quantidadeProduto = 50; //boa prática
        //int QuantidadeProduto; //não é boa prática
        final int NUMERO_TENTATIVAS = 5; // excessão do uso de underline
        //final int numeroTentativas = 5; // não é boa prática
        int QUANTIDADE_OPCOES = 25; // não é errado, mas não é boa prática
        //int qtdProd; // a especividade não está bem aplicada

        System.out.println(i);
        System.out.println(I);
        System.out.println(_1a);
        System.out.println($aq);

        System.out.println(j);
        System.out.println(asrn24678md);
        System.out.println(asrn2$4678_md);

        System.out.println(quantidadeProduto);
        System.out.println(NUMERO_TENTATIVAS);
        System.out.println(QUANTIDADE_OPCOES);



    }
}
