package org.jrprojects.javacore;

import java.util.Scanner;

public class Multiplicador {

    public static void imprimeTabla() {
        Scanner scanner = new Scanner(System.in);
        int cont = 0;

        System.out.println("Ingresa un número para imprimir su tabla de multiplicar: ");
        int num = scanner.nextInt();

        while (cont < 10) {
            cont++;
            System.out.println(num + " x " + cont + " = " + num*cont);
        }
    }
}
