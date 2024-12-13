package org.jrprojects.refuerzo.sintaxisbasica;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EjerciciosBasicos {

    /**
     * Ejercicio 1: Escribir "Hola, Mundo"
     * Crea un programa que imprima "Hola, Mundo" en la consola.
     */
    public void ejercicio1() {
        System.out.println("*** Ejercicio 1 ***");
        System.out.println("Hola, Mundo");
    }

    /**
     * Ejercicio 2: Número mayor
     * Escribe un programa que lea dos números enteros e imprima el mayor de ellos. Utiliza una estructura if.
     * @param num1 entero 1
     * @param num2 entero 2
     */
    public void ejercicio2(int num1, int num2) {
        System.out.println("*** Ejercicio 2 ***");
        if (num1 == num2) System.out.println("Los números son iguales");
        else if (num1 > num2) System.out.println("Num1 es mayor");
        else System.out.println("Num2 es mayor");
    }

    /**
     * Ejercicio 3: Suma de números pares
     * Crea un programa que imprima la suma de los números pares entre 1 y 50 usando un bucle for.
     */
    public void ejercicio3() {
        System.out.println("*** Ejercicio 3 ***");
        int suma = 0;
        for (int i = 0; i <= 50 ; i++) {
            if (i % 2 == 0) {
                suma += i;
            }
        }

        System.out.println("La suma de los números pares del 1 al 50 es: " + suma);
    }

    /**
     * Ejercicio 4: Factorial
     * Implementa un programa que calcule el factorial de un número dado utilizando un bucle while.
     * @param num numero al que se le va a calcular el factorial
     * @return
     */
    public int getFactorial(int num) {
        System.out.println("*** getFactorial("+num+") ***");
        int factorial = 1;
        int contador = 1;

        if (num == 0) return 0;

        while (contador <= num) {
            factorial *= contador;
            contador++;
        }

        return factorial;
    }


    /**
     * Ejercicio 5: Tabla de multiplicar
     * Crea un programa que imprima la tabla de multiplicar de un número ingresado por el usuario.
     * @param tabla número del que se quiere imprimir su tabla de multiplicar
     */
    public void imprimeTabla(int tabla) {
        System.out.println("*** imprimeTabla("+tabla+") ***");

        for (int i = 0; i <= 10; i++) {
            System.out.println(tabla + " x " + i + " = " + tabla*i);
        }
    }
}
