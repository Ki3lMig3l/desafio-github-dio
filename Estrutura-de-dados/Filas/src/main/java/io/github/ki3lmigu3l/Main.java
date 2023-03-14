package io.github.ki3lmigu3l;

public class Main {
    public static void main(String[] args) {

        Fila filas = new Fila();

        filas.enqueue(new No("Primeiro"));
        filas.enqueue("Segundo");
        filas.enqueue("Terceiro");
        filas.enqueue("Quarto");


        System.out.println(filas);
        System.out.println(filas.dequeue());

        filas.enqueue(new No("Ultimo"));
        System.out.println(filas);

        System.out.println("\nFirst: " + filas.fisrt());

    }
}