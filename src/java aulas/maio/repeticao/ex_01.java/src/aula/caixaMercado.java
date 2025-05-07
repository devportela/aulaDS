package aula;

import java.util.Scanner;

public class caixaMercado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("CAIXA MERCADO");
        System.out.println("PASSE OS SEUS ITENS");
        double contProdutos = 1;
        double totalProduto = 0;
        

        while(contProdutos <=5){
            System.out.println("DIGITE O VALOR DO PRODUTO: ");
            double valor = sc.nextDouble();
             totalProduto = totalProduto + valor;
             System.out.println("dei a bunda pra "+totalProduto);
             System.out.println(" homens");
            contProdutos++;

        }
       
        



    }
    


}
