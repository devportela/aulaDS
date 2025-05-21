package maio.exercicioEnquanto2105;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("digite um numero: ");
        int num = sc.nextInt();
        while(num > 0){
            System.out.println(num);
            num--;
        }
    }
}
