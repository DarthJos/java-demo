package org.jrprojects.javacore.poo.figuras;

public class Circulo extends Figura{

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return 3.1416 * (radio*radio);
    }
}
