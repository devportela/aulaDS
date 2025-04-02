package março.aula12do3.exerciciosJava27deMarço;

import java.util.Scanner;

public class ex010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o valor de litros pra calcular pra mililitros: ");
        double valorLitros = sc.nextDouble();
        double mililitros = valorLitros * 1000;
        System.out.println("o valor em mililitros é de " + mililitros);

    }
}
