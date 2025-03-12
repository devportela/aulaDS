package aula12do3;

import javax.swing.JOptionPane;

public class aula1203 {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("seu nome é : ");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("digite sua idade: "));
        JOptionPane.showMessageDialog(null,"Sua Idade é de "+idade);




    }
}
