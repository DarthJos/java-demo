package org.jrprojects.refuerzo.poo.sistemaempleados;

public class Empleado {
    private String nombre;
    private double salarioBase;

    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void calcularSalario() {
        System.out.println("\nNombre: " + nombre);
        System.out.println("Salario base: " + salarioBase);
    }
}
