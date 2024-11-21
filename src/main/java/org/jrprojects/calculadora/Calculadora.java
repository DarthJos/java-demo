package org.jrprojects.calculadora;

import java.util.Scanner;

/**
 * Método principal para invocar la calculadora
 */
public class Calculadora {

    public static void calculadora() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el 1er número: ");
        String str_num1 = scanner.nextLine();

        System.out.println("Ingresa el tipo de operación (+, -, *, /): ");
        String operacion = scanner.nextLine();

        System.out.println("Ingresa el 2o número: ");
        String str_num2 = scanner.nextLine();

        //Conversión de números a dobles
        double num1 = Double.parseDouble(str_num1);
        double num2 = Integer.parseInt(str_num2);
        double resultado = 0;

        System.out.println(str_num1 + " " + operacion + " " + str_num2);
    }

    private static double suma(double num1, double num2) {
        return num1 + num2;
    }

    private static double resta(double num1, double num2) {
        return num1 - num2;
    }

    private static double multiplicacion(double num1, double num2) {
        return num1 * num2;
    }

    private static double division(double num1, double num2) {
        return  num1 / num2;
    }
}
