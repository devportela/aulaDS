package exerciciosJava27deMarço;

import java.util.Scanner;

public class ex021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o n1: ");
        int n1 = sc.nextInt();
        System.out.println("digite o n2: ");
        int n2 = sc.nextInt();
        System.out.println("digite o n3: ");
        int n3 = sc.nextInt();
        System.out.println("digite o n4: ");
        int n4= sc.nextInt();

        int somaeQuadrado = (n1 * n1)+(n2 * n2)+(n3 * n3)+(n4 * n4);
        System.out.println("o quadrado e a soma dos numeros é de:" +somaeQuadrado);

    }
}
