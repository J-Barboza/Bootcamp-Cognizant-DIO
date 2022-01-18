package dio.cognizant.bancodigital;

public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();

        //cliente.adicionaCliente("Barboza");

        cliente.setNome("Barboza");
        cliente.setDocumento("04663471897");
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
