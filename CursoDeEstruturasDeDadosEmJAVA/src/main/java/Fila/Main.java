package Fila;

public class Main {
    public static void main(String[] args) {
        Fila minhaFila = new Fila();

        minhaFila.enqueue(new No("No 1"));
        minhaFila.enqueue(new No("No 2"));
        minhaFila.enqueue(new No("No 3"));
        minhaFila.enqueue(new No("No 4"));
        minhaFila.enqueue(new No("No 5"));
        minhaFila.enqueue(new No("No 6"));
        minhaFila.enqueue(new No("No 7"));

        System.out.println(minhaFila.toString());
//
//        System.out.println(minhaFila.dequeue());

        System.out.println(minhaFila.toString());
    }
}
