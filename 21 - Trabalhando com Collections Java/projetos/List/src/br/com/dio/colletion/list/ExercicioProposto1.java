package br.com.dio.colletion.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioProposto1 {

    public static void main(String[] args) {

        // Media de temperatura de 6 meses
        // Calcular media da temperatura do semestre
        // e mostrar os meses mais alto que a media

        List<String> meses = new ArrayList<>();
            meses.add("Janeiro");
            meses.add("Fevereiro");
            meses.add("Março");
            meses.add("Abril");
            meses.add("Maio");
            meses.add("Junho");

        List<Double> temperaturas = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.println(meses);
        Double soma=0.0;
        for (int i=0; i<6;i++){
            System.out.print("Temperatura do mês " + meses.get(i) + ": ");
            Double temp = scan.nextDouble();
            temperaturas.add(temp);
            soma += temp;
        }

        Double media = soma/temperaturas.size();
        System.out.println("-".repeat(20));
        System.out.println(temperaturas);
        System.out.println("Média semestral: " + media.toString());

        for (Double temp: temperaturas) {
            if (temp > media) System.out.println("Meses acima da média é: " + meses.get(temperaturas.indexOf(temp)));

        }

    }
}
