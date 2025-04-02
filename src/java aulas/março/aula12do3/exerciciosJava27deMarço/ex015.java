package março.aula12do3.exerciciosJava27deMarço;

import java.util.Scanner;

public class ex015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o numero de horas: ");
        int hora = sc.nextInt();
        int minutos = hora * 60;
        System.out.println("o numero de minutos é de "+minutos);
    }
}
