package org.jrprojects.javacore.poo.gestionempleados;

public class EmpleadoTiempoCompleto extends Empleado{

    public EmpleadoTiempoCompleto(String nombre, double salario) {
        super(nombre, salario);
    }

    @Override
    public double calcularBonificacion() {
        return this.getSalario() * 0.20;
    }
}
