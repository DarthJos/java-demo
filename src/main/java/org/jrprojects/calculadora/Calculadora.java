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

        System.out.println(str_num1 + " " + operacion + " " + str_num2);
    }


}
