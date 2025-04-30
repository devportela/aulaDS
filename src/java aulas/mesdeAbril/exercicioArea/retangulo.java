package mesdeAbril.exercicioArea;


public class retangulo {

    private double base;
    private double altura;

    public void setBase(double base) {
        this.base = base;
    }

    public double getBase() {
        return base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public double getArea() {
        return base * altura;
    }
}