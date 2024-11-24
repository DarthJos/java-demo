package org.jrprojects.javacore;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Ejercicio 4:
 * Promedio de notas Crea un programa que solicite 5 notas al usuario,
 * las almacene en un array y luego calcule y muestre el promedio.
 */
public class Calificacion {

    private List<Double> notas = new ArrayList<>();
    private double promedio;

    public List<Double> getNotas() {
        return notas;
    }

    public void setNotas() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.println("Ingresa la nota " + i + ": ");
            notas.add(scanner.nextDouble());
        }
    }

    public double getPromedio() {
        setNotas();
        setPromedio();
        return promedio;
    }

    public void setPromedio() {
        double suma = 0;

        for (int i = 0; i <notas.size() ; i++) {
            suma += notas.get(i);
        }

        this.promedio = suma/notas.size();
    }
}
