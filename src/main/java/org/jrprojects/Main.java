package org.jrprojects;

import org.jrprojects.javacore.Calificacion;

import static org.jrprojects.javacore.Calculadora.calculadora;
import static org.jrprojects.javacore.Multiplicador.imprimeTabla;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        //calculadora();
        //imprimeTabla();

        Calificacion calificacion = new Calificacion();
        System.out.println("Promedio de las notas: "+calificacion.getPromedio());
    }
}