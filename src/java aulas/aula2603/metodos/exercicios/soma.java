/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula2603.metodos.exercicios;

import java.util.Scanner;

/**
 *
 * @author GUSTAVO_4657
 */
public class soma {
    public static void main(String[]args){
        
     Scanner sc = new Scanner(System.in);   
     
     
     
 
         int n1,n2,soma;
     
        System.out.println("Digite o primeiro numero pra soma");
         n1 = sc.nextInt();
        
        
         System.out.println("Digite o segundo numero pra soma");       
        n2 = sc.nextInt();
        
        
        soma = n1+n2;
        
        System.out.println("A SOMA DOS NUMEROS É DE "+soma);
        
    }
}
