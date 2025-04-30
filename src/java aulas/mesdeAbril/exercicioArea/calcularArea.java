package mesdeAbril.exercicioArea;

public class calcularArea {
    public static void main(String[] args) {
        System.out.println("SISTEMA DE CALCULO DE AREA");
        System.out.println("============================");
        quadrado q = new quadrado();
        q.setLado(5);
        System.out.println("area do quadrado é de " + q.getArea());
        retangulo r = new retangulo();
        r.setBase(5);
        r.setAltura(3);
        System.out.println("area do retangulo é de" + r.getArea());


    }
}
