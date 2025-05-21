package maio.exercicioEnquanto2105;

import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, positivos = 0;
        do {
            System.out.println("digite um numero (-1 pra sair): ");
            num = sc.nextInt();
            if (num > 0) positivos++;
        } while (num != -1);
        System.out.println("total de numeros positivos" + positivos);
    }
}
