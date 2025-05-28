import java.util.Scanner;

public class diaDaSemana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ola,bem vindo ao sistema de descobrir o dia da semana!");
        System.out.println("digite abaixo, o dia da semana desejado:");
        int diaSemana = sc.nextInt();
        //estrutura de repeticao switch
        switch (diaSemana) {
            case 1: //caso o dia da semana for =  1 ele vai imprimir a mensagem da case.
            System.out.println("hoje é domingo!");
                break;

                case 2:
                System.out.println("hoje é segunda!");
                break;

                case 3:
                System.out.println("hoje é terca feira!");
                break;

                case 4:
                System.out.println("hoje é quarta!");
                break;
                case 5:
                System.out.println("hoje é quinta feira");
                break;
                case 6:
                System.out.println("hoje é sexta feira");
                break;
                case 7:
                System.out.println("hoje é sabado");
                break;

        
            default: //mesma coisa que o outrocaso ou senao, se quando os valores forem inseridos,ele nao for valido com nenhum das cases ele vai parar no default
            //exceção da estrutura switch
            System.out.println("digite um dia valido");


                break;
        }
    
    
    
    }
    
}
