
package março.aula12do3.exercicios;


import java.util.Scanner;

public class calculadora {

    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        operacoes x = new operacoes();

        System.out.println("BEM VINDO");
        System.out.println("MENU DE OPERAÇÔES");
        System.out.println("1-ADICAO");
        System.out.println("2-SUBTRACAO");
        System.out.println("3-MULTIPLICACAO");
        System.out.println("4-DIVISAO");

        System.out.println("Digite a opcao desejada");
        int opcao = z.nextInt();

        switch (opcao) {
            case 1:
                x.soma();
                break;
            case 2:
                x.subtracao();
                break;
            case 3:
                x.multiplicacao();
                break;
            case 4:
                x.dividir();
                break;

        }
    }
}
    
