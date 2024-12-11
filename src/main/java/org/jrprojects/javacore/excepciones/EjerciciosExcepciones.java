package org.jrprojects.javacore.excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EjerciciosExcepciones {
    /**
     * Ejercicio 1: Try-Catch-Finally
     * Escribe un programa que solicite al usuario dos números e intente realizar la división del primero entre el segundo.
     *
     * Requisitos:
     *
     * Usa un bloque try-catch para capturar la excepción de división por cero.
     * Usa un bloque finally para imprimir un mensaje de despedida.
     */
    public void ejercicio1() {
        System.out.println("*** EJERCICIO 1 ***");
        Scanner scanner = new Scanner(System.in);
        int numerador = 0;
        int denominador = 0;
        String division = "NA";

        try {
            System.out.println("Ingrese el numerador: ");
            numerador = scanner.nextInt();
            System.out.println("Ingrese el denominador: ");
            denominador = scanner.nextInt();

            division = String.valueOf(numerador/denominador);

            System.out.println("División: " + division + "\n");
        } catch (InputMismatchException e) {
            System.out.println("Sólo puedes ingresar números enteros...");
        } catch (ArithmeticException e) {
            System.out.println("Error: División por cero no permitida.");
        } finally {
            System.out.println("Gracias por usar el programa.");
        }
    }
}
