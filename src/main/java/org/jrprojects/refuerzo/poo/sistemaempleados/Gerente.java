package org.jrprojects.refuerzo.poo.sistemaempleados;

public class Gerente extends Empleado{
    private double bono;

    public Gerente(String nombre, double salarioBase) {
        super(nombre, salarioBase);
        this.bono = salarioBase * 0.20;
    }

    @Override
    public void calcularSalario() {
        System.out.println("\nNombre: " + getNombre());
        System.out.println("Salario base: " + getSalarioBase());
        System.out.println("Bono: " + bono);
    }
}
