package org.jrprojects.javacore.lambdas;

import org.w3c.dom.ls.LSOutput;

import java.util.function.Predicate;

public class EjerciciosLambdas {
    /**
     * Suma de dos números
     * Crea una interfaz funcional llamada Operacion con un método int ejecutar(int a, int b).
     * Usa una función lambda para implementar:
     *
     * La suma de dos números.
     * La resta de dos números.
     */
    @FunctionalInterface
    interface Operacion {
        int ejecutar (int a, int b);
    }

    public void ejecutaOperaciones(int num1, int num2) {
        Operacion suma = (a, b) -> a + b;
        Operacion resta = (a, b) -> a - b;

        System.out.println("Suma: " + suma.ejecutar(num1, num2));
        System.out.println("Resta: " + resta.ejecutar(num1, num2));
    }

    /**
     * Verificar números pares
     * Usa la interfaz Predicate para verificar si un número es par.
     */
    public boolean esPar(int num) {
        Predicate<Integer> numPar = numero -> numero % 2 == 0;

        return numPar.test(num);
    }
}
