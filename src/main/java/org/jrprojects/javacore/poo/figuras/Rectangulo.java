package org.jrprojects.javacore.poo.figuras;

public class Rectangulo extends Figura{

    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base*altura;
    }
}
