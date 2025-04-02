package março.aula12do3.exerciciosJava27deMarço;

import java.util.Scanner;

public class ex024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o seu  salario: ");
        double salario = sc.nextDouble();
        double salarioBonus = salario + 10;
        System.out.println("seu salario + o bonus é de " + salarioBonus);

    }
}
