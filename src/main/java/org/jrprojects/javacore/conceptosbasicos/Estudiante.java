package org.jrprojects.javacore.conceptosbasicos;

/**
 * clase Estudiante que contenga:
 *
 * Atributos: nombre, edad, calificación.
 * Métodos:
 *  Un método para establecer los valores de los atributos.
 *  Un método para calcular si el estudiante pasa el curso (calificación >= 6).
 *  Un método para mostrar los datos del estudiante.
 */
public class Estudiante {

    private String nombre;
    private int edad;
    private double calificacion;

    public Estudiante(String nombre, int edad, double calificacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public String isApproved() {
        return calificacion >= 6 ? "Pasa el curso" : "No pasa el curso";
    }
}
