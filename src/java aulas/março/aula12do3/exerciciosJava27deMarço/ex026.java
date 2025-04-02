package março.aula12do3.exerciciosJava27deMarço;

import java.util.Scanner;

public class ex026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("TABELA DE PESO:");
        System.out.println("PESO MAXIMO POR CATEGORIA: 90kg");
        System.out.println("DIGITE SEU PESO (kg): ");
        int pesoAtleta = sc.nextInt();
        if (pesoAtleta <= 90) {
            System.out.println("ATLETA DENTRO  DOS LIMITES DA CATEGORIA");

        } else if (pesoAtleta < 70) {
            System.out.println("ABAIXO DO PESO PRA CATEGORIA");
        } else if (pesoAtleta > 90) {
            System.out.println("ATLETA ACIMA DO LIMITE DA CATEGORIA");
        }

    }
}
