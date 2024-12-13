package org.jrprojects.refuerzo.poo.gestionacademica;

public class Estudiante extends Persona{
    private String carrera;

    public Estudiante(int edad, String nombre) {
        super(edad, nombre);
    }

    public void estudiar() {
        System.out.println("Estudiando...");
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
}
