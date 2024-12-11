package org.jrprojects.javacore.poo.gestionempleados;

public class EmpleadoMedioTiempo extends Empleado{

    public EmpleadoMedioTiempo(String nombre, double salario) {
        super(nombre, salario);
    }

    @Override
    public double calcularBonificacion() {
        return this.getSalario() * .10;
    }
}
