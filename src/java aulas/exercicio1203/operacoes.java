package exercicio1203;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class operacoes {
Scanner sc = new Scanner(System.in);

    void adicao(){
        System.out.println("digite o primeiro numero");
        int n1 = sc.nextInt();
        System.out.println("digite o segundo numero");
        int n2 = sc.nextInt();
        int soma = n1 + n2 ;
        JOptionPane.showMessageDialog(null,"a soma dos numeros é de "+soma);



    }



}
