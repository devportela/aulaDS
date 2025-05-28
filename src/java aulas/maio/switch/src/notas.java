import java.util.Scanner;

public class notas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite uma nota de 0 a 10: ");
        int nota = scanner.nextInt();

        switch (nota) {
            case 0: case 1: case 2: case 3: case 4:
                System.out.println("Insuficiente");
                break;
            case 5: case 6:
                System.out.println("Regular");
                break;
            case 7: case 8:
                System.out.println("Bom");
                break;
            case 9: case 10:
                System.out.println("Excelente");
                break;
            default:
                System.out.println("Nota inválida!");
        }

        scanner.close();
    }
}