package poo;

import poo.model.Cliente;
import poo.model.Endereco;

import java.util.ArrayList;

public class EntragaCartaoApp {

    public static void main(String[] args) {

        Endereco endereco = new Endereco();
        endereco.cep = "09185710";
        // dados endereço

        Cliente cliente = new Cliente();
        // Dados cliente

        try {
            cliente.adicionaEndereco(endereco);
            System.out.println("Endereco adicionado com sucesso!");
        } catch (Exception e) {
            System.out.println("Houve um erro ao adicional endereco: " + e.getMessage());
        }
    }
}
