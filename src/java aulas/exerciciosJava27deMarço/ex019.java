package exerciciosJava27deMarço;

import java.util.Scanner;

public class ex019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldoBancario = 20000.00;
        System.out.println("digite seu nome: ");
        String nomeUser = sc.next();
        System.out.println("olá," + nomeUser + "!");
        System.out.println("seu saldo bancario é de " + saldoBancario);
        System.out.println("insira a quantia desejada pra saque :");
        double quantiaSaque = sc.nextDouble();
        System.out.println("valor sacado:" + quantiaSaque);
        double valorposSaque = saldoBancario - quantiaSaque;
        System.out.println("valor da conta após saque :"+valorposSaque);

        sc.close();
    }
}
