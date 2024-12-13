package org.jrprojects.refuerzo.poo.sistemaempleados;

public class Vendedor extends Empleado{
    private double comision;

    public Vendedor(String nombre, double salarioBase) {
        super(nombre, salarioBase);
        comision = salarioBase * 0.10;
    }

    @Override
    public void calcularSalario() {
        System.out.println("\nNombre: " + getNombre());
        System.out.println("Sueldo base: " + getSalarioBase());
        System.out.println("Comisión: " + comision);
    }


}
