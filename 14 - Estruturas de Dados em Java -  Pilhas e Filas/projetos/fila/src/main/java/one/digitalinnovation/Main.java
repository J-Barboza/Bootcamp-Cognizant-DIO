package one.digitalinnovation;

public class Main {

    public static void main(String[] args) {

        Fila<String> minhaFila = new Fila<>();

//        minhaFila.enqueue(new No("primerio"));
//        minhaFila.enqueue(new No("segundo"));
//        minhaFila.enqueue(new No("terceiro"));
//        minhaFila.enqueue(new No("quarto"));

        //Codigo refatorado com Object
        minhaFila.enqueue("primerio");
        minhaFila.enqueue("segundo");
        minhaFila.enqueue("terceiro");
        minhaFila.enqueue("quarto");
        System.out.println(minhaFila);

        System.out.println(minhaFila.dequeue());
        System.out.println(minhaFila);

        minhaFila.enqueue("ultimo");
        System.out.println(minhaFila);

        System.out.println(minhaFila.first());
        System.out.println(minhaFila);
    }

}
