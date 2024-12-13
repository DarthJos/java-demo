package org.jrprojects.refuerzo.poo.gestionacademica;

import java.util.List;

public class Curso {
    private String nombreCurso;
    private Profesor profesor;
    private List<Estudiante> estudiantes;

    public Curso(String nombreCurso, Profesor profesor, List<Estudiante> estudiantes) {
        this.nombreCurso = nombreCurso;
        this.profesor = profesor;
        this.estudiantes = estudiantes;
    }

    public void mostrarCurso() {
        System.out.println("Nombre del curso: " + nombreCurso);
        System.out.println("Profesor: ");
        profesor.mostrarInfo();
        System.out.println("Alumnos:");
        for (Estudiante estudiante : estudiantes) {
            estudiante.mostrarInfo();
        }
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
}
