package maio.exercicioEnquanto2105;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int secreto = 7;
        int palpite;
        do {
            System.out.println("adivinhe o numero  entre (1 e 10): ");
            palpite = sc.nextInt();

        } while (palpite != secreto); {
            System.out.println("voce acertou!");
        }
    }
}
