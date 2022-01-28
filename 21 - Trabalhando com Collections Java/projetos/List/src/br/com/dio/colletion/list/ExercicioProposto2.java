package br.com.dio.colletion.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioProposto2 {

    public static void main(String[] args) {

        List<String> perguntas = new ArrayList<>();
        perguntas.add("Telefonou para a vítima? ");
        perguntas.add("Esteve no local do crime? ");
        perguntas.add("Mora perto da vítima? ");
        perguntas.add("Devia para a vítima? ");
        perguntas.add("Já trabalhou com a vítima? ");

        Scanner scan = new Scanner(System.in);

        int count = 0;
        int sim = 0;
        while (count < 5){
            System.out.print(perguntas.get(count));
            String sOUn = scan.next();
            if (sOUn.toLowerCase().contains("s")||sOUn.toLowerCase().contains("n")){
                count++;
                if (sOUn.toLowerCase().contains("s")) sim++;
            } else {
                System.out.println("Deve responder S ou N");
            }
        }
        switch (sim){
            case 2 :
                System.out.println("Suspeita");
                break;
            case 3 :
            case 4 :
                System.out.println("Cúmplice");
                break;
            case 5 :
                System.out.println("Assassina");
                break;
            default:
                System.out.println("Inocente");
        }
    }
}
