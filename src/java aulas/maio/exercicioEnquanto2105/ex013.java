package maio.exercicioEnquanto2105;
import java.util.Scanner;
public class ex013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("1 - Olá");
            System.out.println("2 - Tchau");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            if (opcao == 1) System.out.println("Olá!");
            else if (opcao == 2) System.out.println("Tchau!");
        } while (opcao != 3);
    }
}