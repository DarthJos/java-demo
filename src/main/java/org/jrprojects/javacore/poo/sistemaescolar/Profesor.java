package org.jrprojects.javacore.poo.sistemaescolar;

public class Profesor extends Persona{

    private String materia;

    public Profesor(String nombre, int edad, String materia) {
        super(nombre, edad);
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public String mostrarDetalles() {
        return "Profesor: " + getNombre() + "\n" +
                "Edad: " + getEdad() + "\n" +
                "Materia: " + getMateria() + "\n";
    }
}
