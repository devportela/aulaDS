package março.aula12do3.login1903;

import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        String senhaPadrao = "123";

        System.out.println("SISTEMA DE LOGIN");
        System.out.println("DIGITE SEU NOME");
        String nome = sc.next();
        System.out.println("OLÀ,"+nome);
        System.out.println("DIGITE SUA SENHA: ");
        String senha = sc.next();
        System.out.println("-------------------------------------");
        if (senha.equals(senhaPadrao)){
            System.out.println("ACESSO APROVADO");
        } else if(!senha.equals(senhaPadrao)){
            System.out.println("ACESSO NEGADO");
        }


    }
}
