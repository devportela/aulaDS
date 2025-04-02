package março.aula12do3.exerciciosJava27deMarço;

import java.util.Scanner;

public class ex028 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("SISTEMA DE BATIMENTOS");
        System.out.println("DIGITE ABAIXO SEUS BATIMENTOS POR MINUTO: ");
        int batimentosPminuto = sc.nextInt();
        if (batimentosPminuto < 60) {
            System.out.println("BRADIQUICARDIA");
        } else if (batimentosPminuto > 60 && batimentosPminuto < 100) {
            System.out.println("NORMOCARDIA");
        } else if (batimentosPminuto > 100) {
            System.out.println("TAQUICARDIA");
        }
    }
}
