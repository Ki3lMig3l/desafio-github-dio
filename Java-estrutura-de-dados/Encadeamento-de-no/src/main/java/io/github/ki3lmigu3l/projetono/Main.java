package io.github.ki3lmigu3l.projetono;

public class Main {

    public static void main(String[] args) {

        BaseNo no1 = new BaseNo("Conteúdo No: 1");
        BaseNo no2 = new BaseNo("Conteúdo No: 2");

        no1.setProximoNo(no2); // Apontando referencia.

        BaseNo no3 = new BaseNo("Conteúdo No: 3");

        no2.setProximoNo(no3);

        BaseNo no4 = new BaseNo("Conteúdo No: 4");

        no3.setProximoNo(no4);

        System.out.println("Lista Simples");

        System.out.println("\n" + no1);
        System.out.println("Referencia do proximo No: " + no1.getProximoNo());

        System.out.println("\n" + no2);
        System.out.println("Referencia do próximo No: " + no2.getProximoNo());

        System.out.println("\n" + no3);
        System.out.println("Referencia do próximo No: " + no3.getProximoNo());

        System.out.println("\n" + no4);
        System.out.println("Referencia do próximo No: " + no4.getProximoNo());

        /*    No1 -> No2 -> No3 -> No4 -> Null   */
        /*            Acessando as referencias de outra forma               */

        System.out.println(no1.getProximoNo());
        System.out.println("\n" + no1.getProximoNo().getProximoNo());
        System.out.println("\n" + no1.getProximoNo().getProximoNo().getProximoNo());
        System.out.println("\n" + no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());
    }
}
