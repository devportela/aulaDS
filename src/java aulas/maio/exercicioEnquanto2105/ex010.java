package maio.exercicioEnquanto2105;

import java.util.Scanner;

public class ex010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine();
        int i = 0;
        while (i < palavra.length()) {
            System.out.println(palavra.charAt(i));
            i++;
        }
    }
}