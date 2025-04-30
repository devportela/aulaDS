package mesdeAbril.exercicioArea;

import javax.swing.JOptionPane;
import mesdeAbril.exercicioArea.quadrado;
import mesdeAbril.exercicioArea.retangulo;

public class calcularArea {
    public static void main(String[] args) {
        System.out.println("SISTEMA DE CALCULO DE AREA");
        System.out.println("============================");

        int escolha = Integer.parseInt(
            JOptionPane.showInputDialog("Digite 1 para a área do quadrado, ou 2 para a área do retângulo:")
        );

        if (escolha == 1) {
            quadrado q = new quadrado();
            int lado = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do lado do quadrado:"));
            q.setLado(lado);
            System.out.println("Área do quadrado é: " + q.getArea());
        } else if (escolha == 2) {
            retangulo r = new retangulo();
            double base = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da base:"));
            double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura:"));
            r.setBase(base);
            r.setAltura(altura);
            System.out.println("Área do retângulo é: " + r.getArea());
        } else {
            System.out.println("Opção inválida.");
        }
    }
}
