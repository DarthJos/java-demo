package org.jrprojects.refuerzo.poo.gestionacademica;

public class Persona {
    private String nombre;
    private int edad;

    public Persona(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
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

    public void mostrarInfo() {
        System.out.println("\tNombre: " + nombre);
        System.out.println("\tEdad: " + edad);
    }
}
