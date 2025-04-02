package março.aula12do3.exerciciosJava27deMarço;

import java.util.Scanner;

public class ex020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valorDolar = 5.37;
        System.out.println("digite a quantia desejada pra converter pra dolar: ");
        double quantiaConversao = sc.nextDouble();
        double conversaoMoeda = quantiaConversao * valorDolar;
        System.out.println("o valor em dolares é de " + conversaoMoeda);

    }
}
