package org.jrprojects.refuerzo.poo.gestionacademica;

public class Profesor extends Persona{

    private String materia;

    public Profesor(int edad, String nombre) {
        super(edad, nombre);
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public void enseñar() {
        System.out.println("Enseñando...");
    }
}
