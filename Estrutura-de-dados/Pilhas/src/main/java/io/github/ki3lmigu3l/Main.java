package io.github.ki3lmigu3l;

public class Main {
    public static void main(String[] args) {

        Pilha pilhas = new Pilha();

        pilhas.push(new No(1));
        pilhas.push(new No(2));
        pilhas.push(new No(3));
        pilhas.push(new No(4));
        pilhas.push(new No(5));
        pilhas.push(new No(6));

        System.out.println(pilhas);
        System.out.println("Dado excliodo: " + pilhas.pop() + "\n");
        System.out.println("No Atual da Pilha: " + pilhas.top());

    }
}
