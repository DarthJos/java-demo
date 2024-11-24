package org.jrprojects.javacore;

import java.util.Scanner;

/**
 * Método principal para invocar la javacore
 */
public class Calculadora {

    public static void calculadora() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el 1er número: ");
        String strNum1 = scanner.nextLine();

        System.out.println("Ingresa el tipo de operación (+, -, *, /): ");
        String operacion = scanner.nextLine();

        System.out.println("Ingresa el 2o número: ");
        String strNum2 = scanner.nextLine();

        //Conversión de números a dobles
        double num1 = Double.parseDouble(strNum1);
        double num2 = Integer.parseInt(strNum2);
        double resultado = 0;

        if (operacion.equals("+")) { resultado = suma(num1, num2 );}
        else if (operacion.equals("-")) { resultado = resta(num1, num2 );}
        else if (operacion.equals("*")) { resultado = multiplicacion(num1, num2 );}
        else if (operacion.equals("/")) { resultado = division(num1, num2 );}
        else {
            System.out.println("Operación no reconocida...");
        }

        System.out.println(strNum1 + " " + operacion + " " + strNum2 + " = " + resultado);
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
        if (num2 == 0) {
            return 0;
        }
        return  num1 / num2;
    }
}
