package maio.exercicioEnquanto2105;
import java.util.Scanner;
public class ex015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número para calcular o fatorial: ");
        int num = sc.nextInt();
        int fatorial = 1;
        while (num > 1) {
            fatorial *= num;
            num--;
        }
        System.out.println("Fatorial: " + fatorial);
    }
}