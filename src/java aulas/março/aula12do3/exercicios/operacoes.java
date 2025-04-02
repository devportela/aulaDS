package março.aula12do3.exercicios;

import java.util.Scanner;

public class operacoes {

    Scanner sc = new Scanner(System.in);

      void soma() {

        System.out.println("digite o valor a:");
        int a = sc.nextInt();
        System.out.println("DIGITE O valor b ");
        int b = sc.nextInt();

        int soma = a + b;

        System.out.println("o valor da adicao é " + soma);

    }
    

   

    void multiplicacao() {

        System.out.println("digite o valor a:");
        int a = sc.nextInt();
        System.out.println("DIGITE O valor b ");
        int b = sc.nextInt();

        int multiplicacao = a * b;

        System.out.println("o valor da multiplicacao é " + multiplicacao);

    }

    void subtracao() {

        System.out.println("digite o valor a:");
        int a = sc.nextInt();
        System.out.println("DIGITE O valor b ");
        int b = sc.nextInt();

        int subtracao = a - b;

        System.out.println("o valor da subtracao é" + subtracao);

    }

    void dividir() {

        System.out.println("digite o valor a:");
        int a = sc.nextInt();
        System.out.println("DIGITE O valor b ");
        int b = sc.nextInt();

        double divisao = a + b;

        System.out.println("o valor da divisao é" + divisao);

        sc.close();

    }

}
