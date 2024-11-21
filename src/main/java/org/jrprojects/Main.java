package org.jrprojects;

import org.jrprojects.calculadora.Calculadora;
import static org.jrprojects.calculadora.Calculadora.calculadora;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        Calculadora calculadora = new Calculadora();

        calculadora();
    }
}