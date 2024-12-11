package org.jrprojects.javacore.poo.sistemaescolar;

public class Estudiante extends Persona {
    private double calificacion;

    public Estudiante(String nombre, int edad, double calificacion) {
        super(nombre, edad);
        this.calificacion = calificacion;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public String mostrarDetalles() {
        return "Estudiante: " + getNombre() + "\n" +
                "Edad: " + getEdad() + "\n" +
                "Calificación Final: " + getCalificacion() + "\n";
    }
}
