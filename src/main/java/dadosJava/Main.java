package dadosJava;

public class Main {
    public static void main(String[] args) {

        Fila minhaFila = new Fila();

        minhaFila.enqueue(new No("primeiro"));
        minhaFila.enqueue(new No("segundo"));
        minhaFila.enqueue(new No("terceiro"));
        minhaFila.enqueue(new No("quarto"));

        System.out.println("Fila: " + minhaFila);

        System.out.println("dequeue(): " + minhaFila.dequeue());
        System.out.println("Após dequeue(): " + minhaFila);


        minhaFila.enqueue(new No("ultimo"));

        System.out.println("Após novo enqueue(): " + minhaFila);

        System.out.println("first(): " + minhaFila.first());

        System.out.println("Após o first(): " + minhaFila);

    }
}
