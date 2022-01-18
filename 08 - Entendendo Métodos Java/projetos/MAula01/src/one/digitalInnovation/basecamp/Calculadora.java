package one.digitalInnovation.basecamp;

public class Calculadora {

    public static void soma(double numero1, double numero2){

        double resultado = numero1 + numero2;

        System.out.println("A soma de " + numero1 + " mais " + numero2 + " = " + resultado);
    }

    public static void subtração(double numero1, double numero2){

        double resultado = numero1 - numero2;

        System.out.println("A subtracao de " + numero1  + " menos " + numero2 + " = " + resultado);
    }

    public static void multiplicação(double numero1, double numero2){

        double resultado = numero1 * numero2;

        System.out.println("A multiplicação de " + numero1 + " vezes " + numero2 + " = " + resultado);
    }

    public static void divisao(double numero1, double numero2){

        double resultado = numero1 / numero2;

        System.out.println("A multiplicação de " + numero1 + " dividido " + numero2 + " = " + resultado);
    }

}
