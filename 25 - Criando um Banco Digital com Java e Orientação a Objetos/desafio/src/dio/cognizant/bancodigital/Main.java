package dio.cognizant.bancodigital;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        CadastroCliente.lerClienteGravarArquivo();

    }
}
/*
        Cliente cliente = new Cliente();

        //cliente.adicionaCliente("Barboza");

        cliente.setNome("Barboza");
        cliente.setDocumento("");
        Pessoa.TipoPessoa pessoa = cliente.getTipoPessoa();

        Conta cc = new ContaCorrente(cliente);
        Conta poupanca = new ContaPoupanca(cliente);

        System.out.println("Após depósito conta corrente");
        cc.depositar(100);
        cc.imprimirExtrato();

        System.out.println("Após tranferência para conta poupança");
        cc.transferir(100, poupanca);
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
*/