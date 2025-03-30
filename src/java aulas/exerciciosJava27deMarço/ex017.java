package exerciciosJava27deMarço;

import java.util.Scanner;

public class ex017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o minutos  pra passar pros segundos: ");
        int m = sc.nextInt();
        int segundos = m * 60;
        System.out.println("o valor é de "+segundos);
    }
}
