package one.digitalInnovation.basecamp;

public class Main {

    public static void main(String[] args) {

        //Calculadora
        System.out.println("Exercício Calculadora");
        Calculadora.soma(3, 6);
        Calculadora.subtração(9, 1.8);
        Calculadora.multiplicação(9, 8);
        Calculadora.divisao(5, 2.5);

        //Obter Mensagem
        System.out.println("Exercício Obter Mensagem");
        Mensagem.obterMensagem(9) ;
        Mensagem.obterMensagem(15) ;
        Mensagem.obterMensagem(21) ;

        // Empréstimo
        System.out.println("Exercício empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);

    }
}
