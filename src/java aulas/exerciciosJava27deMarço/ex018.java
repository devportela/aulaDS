package exerciciosJava27deMarço;

import java.util.Scanner;

public class ex018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite em segundos  pra passar para minutos: ");
        int s = sc.nextInt();
        int minutos = s / 60;
        System.out.println("o valor é de " + minutos + "minutos");
    }
}
