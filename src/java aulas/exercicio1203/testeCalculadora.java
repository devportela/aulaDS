package exercicio1203;

import java.util.Scanner;

public class testeCalculadora {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        operacoes x = new operacoes();

        System.out.println("MENU");
        System.out.println("1-ADICAO");
        System.out.println("2-SUBTRACAO");
        System.out.println("3-MULTIPLICACAO");
        System.out.println("4-DIVISAO");
        System.out.println("digite a opcao desejada:");
        int opcao = sc.nextInt();

        switch (opcao){
            case 1:
                x.adicao();
                break;


        }
    }
}

