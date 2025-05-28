import java.util.Scanner;
public class operacoes {
    
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("digite o n1:");
        int n1 = sc.nextInt();
        System.out.println("digite o n2:");
        int n2 = sc.nextInt();

        System.out.println("digite a operacao desejada:");
        System.out.println("1-somar,2-subtrair,3-multiplicar,4-dividir");
        int opcaoOperacao = sc.nextInt();

        switch (opcaoOperacao) {
            case 1:
            int soma = n1 + n2;
            System.out.println("a soma é de "+soma);
                break;
            case 2:
            int subtracao = n1 - n2;
            System.out.println("a subtracao é de "+subtracao);
                break;
            case 3:
            int multiplicacao = n1 * n2;
            System.out.println("a multiplicacao é de "+multiplicacao);
                break;
            case 4:
            double divisao = n1 / n2;
            System.out.println("a divisao é de "+divisao);
                break;

        }

    }
    
}
