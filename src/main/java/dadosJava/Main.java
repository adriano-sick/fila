package dadosJava;

public class Main {
    public static void main(String[] args) {

        Fila<String> minhaFila = new Fila<>();

        minhaFila.enqueue("primeiro");
        minhaFila.enqueue("segundo");
        minhaFila.enqueue("terceiro");
        minhaFila.enqueue("quarto");

        System.out.println("Fila: " + minhaFila);

        System.out.println("dequeue(): " + minhaFila.dequeue());
        System.out.println("Após dequeue(): " + minhaFila);

        minhaFila.enqueue("ultimo");

        System.out.println("Após novo enqueue(): " + minhaFila);

        System.out.println("first(): " + minhaFila.first());

        System.out.println("Após o first(): " + minhaFila);

    }
}
