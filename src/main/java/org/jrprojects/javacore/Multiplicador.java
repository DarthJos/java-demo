package org.jrprojects.javacore;

import java.util.Scanner;

public class Multiplicador {

    public static void imprimeTabla() {
        Scanner scanner = new Scanner(System.in);
        int cont = 0;

        System.out.println("Ingresa un número para imprimir su tabla de multiplicar: ");
        int num = scanner.nextInt();

        System.out.println(getTabla(num));
    }

    private static String getTabla(int num){
        String tabla ="Tabla del " + num + "\n";

        for (int i = 0; i <=10 ; i++) {
            int multiplicacion = i * num;
            tabla += num + " x " + i + " = " + multiplicacion + "\n";
        }

        return tabla;
    }
}
