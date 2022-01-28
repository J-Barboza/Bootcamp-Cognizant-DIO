package br.com.dio.colletion.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Exercicio2 extends LinkedList {

    public static void main(String[] args) {

        List<Double> notas = new ArrayList<>(); // Diamond Operator(jdk 7)
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println("notas: "  + notas.toString());

        System.out.println("Crie uma lista chamada notas2 " +
                "e coloque todos os elementos da list Arraylist nessa nova lista: ");
        LinkedList notas2 = new LinkedList();
        notas2.addAll(notas);
        System.out.println("notas2: " + notas2);

        System.out.println("Mostre a primeira nota da nova lista sem removê-lo: " + notas2.getFirst());

        System.out.println("Mostre a primeira nota da nova lista removendo-o: " + notas2.removeFirst());
        System.out.println("Primeiro elemento removido: " + notas2);
    }

}
