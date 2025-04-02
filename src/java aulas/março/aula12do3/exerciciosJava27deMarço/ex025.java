package março.aula12do3.exerciciosJava27deMarço;

import java.util.Scanner;

public class ex025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("RADAR DE VELOCIDADE");
        System.out.println("______________________");
        System.out.println("DIGITE SUA VELOCIDADE");
        int velocideVeiculo = sc.nextInt();
        if (velocideVeiculo > 90) {
            System.out.println("AVISO DE INFRAÇÂO");
            System.out.println("VEICULO ACIMA DA VELOCIDADE PERMITIDA PELA VIA!");
            System.out.println("SUA VELOCIDADE :" + velocideVeiculo);
        } else if (velocideVeiculo < 90) {
            System.out.println("VEICULO ABAIXO DA VELOCIDADE PERMITIDA PELA VIA!");
            System.out.println("SUA VELOCIDADE" + velocideVeiculo);
        }
    }
}
