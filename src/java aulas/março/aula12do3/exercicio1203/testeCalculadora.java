package março.aula12do3.exercicio1203;

import javax.swing.*;
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
        System.out.println("5-AREA DO TRIANGULO");
        System.out.println("6-AREA DO QUADRADO");
        System.out.println("digite a opcao desejada:");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                x.adicao();
                break;

            case 2:
                x.subtracao();
                break;

            case 3:
                x.divisao();
                break;

            case 4:
                x.divisao();
                break;

            case 5:
                x.areadoQuadrado();
                break;

            case 6:
                x.areadoTriangulo();
                break;


        }

        System.out.println("Insira sua idade para verificarmos:");
        int idade = sc.nextInt();
        if (idade >= 18) {
            JOptionPane.showMessageDialog(null, "MAIOR DE IDADE");

        } else if (idade < 18) {
            JOptionPane.showMessageDialog(null, "MENOR DE IDADE");
        }


    }
}

