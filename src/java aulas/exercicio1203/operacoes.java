package exercicio1203;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class operacoes {
Scanner sc = new Scanner(System.in);

    void adicao(){
        System.out.println("digite o primeiro numero");
        int n1 = sc.nextInt();
        System.out.println("digite o segundo numero");
        int n2 = sc.nextInt();
        int soma = n1 + n2 ;
        JOptionPane.showMessageDialog(null,"a soma dos numeros é de "+soma);



    }

    void subtracao(){
        System.out.println("digite o primeiro numero");
        int n1 = sc.nextInt();
        System.out.println("digite o segundo numero");
        int n2 = sc.nextInt();
        int subtracao = n1 - n2 ;
        JOptionPane.showMessageDialog(null,"a subtracao dos numeros é de "+subtracao);



    }

    void multiplicacao(){
        System.out.println("digite o primeiro numero");
        int n1 = sc.nextInt();
        System.out.println("digite o segundo numero");
        int n2 = sc.nextInt();
        int multiplicacao = n1 * n2 ;
        JOptionPane.showMessageDialog(null,"a multiplicacao dos numeros é de "+multiplicacao);



    }

    void divisao(){
        System.out.println("digite o primeiro numero");
        int n1 = sc.nextInt();
        System.out.println("digite o segundo numero");
        int n2 = sc.nextInt();
        int divisao = n1 / n2 ;
        JOptionPane.showMessageDialog(null,"a divisao dos numeros é de "+divisao);



    }

    void areadoQuadrado(){
        System.out.println("digite o valor do lado do quadrado:");
        double lado = sc.nextDouble();
        double areaQuadrado = lado * lado;
        JOptionPane.showMessageDialog(null,"a area do quadrado é de "+areaQuadrado);



    }

    void areadoTriangulo(){
        System.out.println("digite a base do triangulo:");
        double base = sc.nextDouble();
        System.out.println("digite a altura do triangulo: ");
        double altura = sc.nextDouble();
       double  areaTriangulo = (base * altura) / 2;
        JOptionPane.showMessageDialog(null,"a area do triangulo é "+areaTriangulo);




        }





}
