package br.com.dio.colletion.list;

import java.util.*;

public class ExemploList {
        public static void main(String[] args) {
// Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:

//      List notas = new ArrayList(); //antes do java 5
//      ArrayList<Double> notas = new ArrayList<>(); // Generics(jd5) - Diamond Operator (jdk 7)

//      Compila da mesmo forma inserindo o tipo no new ArrayList, mas não é necessário <> Diamond Operator
//      ArrayList<Double> notas = new ArrayList<Double>(); // Generics(jd5) - Diamond Operator (jdk 7)
//      ArrayList<Double> notas = new ArrayList<>(); //Diamond Operator (jdk 7)  - como boa prática não fazer dessa forma

//      List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));

            /* - Não se pode adicionar ou remover componente da Lista
        List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        notas.add(10d);
        System.out.println(notas);
*/

/* //Torna a lista imutável, não pode add ou remove
        List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        notas.add(1d);
        notas.remove(5d);
        System.out.println(notas);
*/

            System.out.println("Crie uma lista e adicione as sete notas: ");

            //List<Double> notas = new ArrayList<Double>(); //Generics(jdk 5)
            List<Double> notas = new ArrayList<>(); // Diamond Operator(jdk 7)
            notas.add(7.0);
            notas.add(8.5);
            notas.add(9.3);
            notas.add(5.0);
            notas.add(7.0);
            notas.add(0.0);
            notas.add(3.6);
            System.out.println(notas.toString());

            //indexOf - busca valor do elemento, retornando sua posicao
            System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d));

            //pode-se passar a posição e o elemento, no caso posicao 4 e elemento 8 decimal
            System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
            notas.add(4, 8.7d);
            System.out.println(notas);

            // set - substitui o valor, usando indexOf pega-se a posicao do elemento e então "SET" faz a subistituição do valor
            // set (position, value)
            System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
            notas.set(notas.indexOf(8.7d), 7.71);
            System.out.println(notas);

            // contains - retorna um boolean, caso exixte o elemento na lista
            // contains recebe o valor a ser pesquisado
            System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(7.71d));

            // for each clássico
            System.out.println("Exiba todas as notas na ordem em que foram informados: ");
            for (Double nota : notas) System.out.println(nota);

            //get - pega o valor do arrayList baseado na posição do elemento na lista
            System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
            System.out.println(notas.toString());

            System.out.println("Exiba a menor nota: " + Collections.min(notas));

            System.out.println("Exiba a maior nota: " + Collections.max(notas));

            Iterator<Double> iterator = notas.iterator();
            Double soma = 0d;
            while(iterator.hasNext()){
                Double next = iterator.next();
                soma += next;
            }
            System.out.println("Exiba a soma dos valores: " + soma);

            double sumTotal = 0d;
            for (Double nota: notas) sumTotal += nota;
            System.out.println("Exiba a soma dos valores com ForEach: " + sumTotal);

            System.out.println("Exiba a média das notas: " + (soma/notas.size()));
            System.out.println("Exiba a média das notas do ForeEach: " + (sumTotal/notas.size()));

            // remove - pode remover por valor
            System.out.println("Remova a nota 0: ");
            notas.remove(0d);
            System.out.println(notas);

            // remove pode remover pelo indice - veja assinatura do metodo
            System.out.println("Remova a nota da posição 0");
            notas.remove(0);
            System.out.println(notas);

            System.out.println("Remova as notas menores que 7 e exiba a lista: ");
            Iterator<Double> iterator1 = notas.iterator();
            while(iterator1.hasNext()) {
                Double next = iterator1.next();
                if(next < 7) iterator1.remove();
            }
            System.out.println(notas);

            // como exercício adicional utilizando "for each"
            // mais verboso e mais custoso, mas possível
            System.out.println("-".repeat(30));
            System.out.println("Mesmo exercício anterior usando 'For Each' ");
            notas.add(2,5.0);
            notas.add(5,3.6);
            System.out.println("Voltando os elementos: " + notas.toString());
            List<Double> verifyList = new ArrayList<>();
            System.out.println("Remova as notas menores que 7 e exiba a lista: ");
            for (Double nota: notas) {
                if (nota < 7) verifyList.add(nota);
            }
            for (Double valor: verifyList){
                System.out.println(valor);
                notas.remove(valor);

            }
            System.out.println("Usando for each: " + notas.toString());

            System.out.println("Apague toda a lista");
            notas.clear();
            System.out.println(notas);

            System.out.println("Confira se a lista está vazia: " + notas.isEmpty());


//Para você: Resolva esses exercícios utilizando os métodos da implementação LinkedList:

            //Usando o metodo ADD apenas para que xtodo o exercício continue funcionando
            //então foi criada notas0 e inserido seus valores na "newList"
            List<Double> notas0 = new ArrayList<>(); // Diamond Operator(jdk 7)
            notas0.add(7.0);
            notas0.add(8.5);
            notas0.add(9.3);
            notas0.add(5.0);
            notas0.add(7.0);
            notas0.add(0.0);
            notas0.add(3.6);
            System.out.println("notas0: " + notas0.toString());

            System.out.println("Crie uma lista chamada notas2 " +
                "e coloque todos os elementos da list Arraylist nessa nova lista: ");

            List<Double> notas2 = new ArrayList<>();
            for (Double newList: notas0) notas2.add(newList);
            System.out.println("nota2: " + notas2.toString());


            System.out.println("Mostre a primeira nota da nova lista sem removê-lo: ");
            System.out.println("Primeiro elemento: " + notas2.get(0));

            System.out.println("Mostre a primeira nota da nova lista removendo-o: ");
            System.out.println("Elemento 1 (indice 0) removido: " + notas2.remove(0));
            System.out.println("Removido o primeiro elemento: " + notas2.toString());

        }
}
