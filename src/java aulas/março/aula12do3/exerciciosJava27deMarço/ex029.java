package março.aula12do3.exerciciosJava27deMarço;

import java.util.Scanner;

public class ex029 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("SISTEMA DE RESPIRACOES");
        System.out.println("DIGITE ABAIXO a quantidade de RESPIRAÇOES POR MINUTO: ");
        int respMinuto = sc.nextInt();
        if (respMinuto < 12) {
            System.out.println("BRADIPNEIA");
        } else if (respMinuto > 60 && respMinuto < 100) {
            System.out.println("EUPENEIA");
        } else if (respMinuto > 100) {
            System.out.println("TAQUIPNEIA");
        }
    }
}
