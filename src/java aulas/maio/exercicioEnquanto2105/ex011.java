package maio.exercicioEnquanto2105;

import java.util.Scanner;
public class ex011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0, num;
        while (soma <= 100) {
            System.out.print("Digite um número: ");
            num = sc.nextInt();
            soma += num;
        }
        System.out.println("Soma final: " + soma);
    }
}