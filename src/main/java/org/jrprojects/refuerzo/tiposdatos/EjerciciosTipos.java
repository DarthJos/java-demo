package org.jrprojects.refuerzo.tiposdatos;

import java.util.*;

public class EjerciciosTipos {
    Scanner scanner = new Scanner(System.in);

    /**
     * Ejercicio 6: Conversión de tipos
     * Crea un programa que convierta un número flotante a entero y lo imprima.
     * Luego convierte un entero a una cadena y muéstralo.
     */
    public void ejercicio6() {
        System.out.println("*** ejercicio6() ***");
        float flotante = 3.5F;
        System.out.println(flotante);
        int entero = (int) flotante;
        System.out.println(entero);
        String cadena = String.valueOf(entero);
        System.out.println(cadena);
    }

    /**
     * Ejercicio 7: Promedio de un array
     * Escribe un programa que calcule el promedio de un array de números enteros.
     * @param enteros arreglo de enteros
     */
    public double getPromedioArrayEnteros(int[] enteros) {
        System.out.println("*** getPromedioArrayEnteros(enteros[]) ***");
        System.out.println("Promedio de: ");
        Arrays.stream(enteros).forEach(entero -> System.out.println(entero));   //Imprime todos los elementos del array mediante un stream
        System.out.println("_____________");

        return Arrays.stream(enteros).average().getAsDouble();      //Obtiene el promedio del arreglo mediante un stream
    }

    /**
     * Ejercicio 8: Invertir un array
     * Implementa un programa que invierta los elementos de un array.
     *
     * @param enteros arreglo de enteros
     * @return arreglo invertido
     */

    public int[] invierteArrayEnteros(int[] enteros) {
        System.out.println("*** invierteArrayEnteros(enteros[]) ***");

        int[] arregloInvertido = new int[enteros.length];

        int j = enteros.length - 1;
        for (int i = 0; i < enteros.length; i++) {
            arregloInvertido[i] = enteros[j];
            j--;
        }

        return arregloInvertido;
    }

    /**
     * Ejercicio 9: Operaciones con cadenas
     * Crea un programa que realice las siguientes operaciones con una cadena ingresada por el usuario:
     *
     * Convertirla a mayúsculas.
     * Contar cuántas veces aparece una letra específica.
     * Reemplazar todas las vocales por un carácter *.
     * @param cadena
     */
    public void ejercicio9(String cadena) {
        System.out.println("*** ejercicio9(" + cadena + ") ***");

        String cadenaMayusculas = cadena.toUpperCase();
        System.out.println(cadenaMayusculas);

        System.out.println("Ingresa una letra para buscar cuantas veces aparece en la cadena: ");
        String letraBuscar = scanner.nextLine();
        int cuentaLetras = 0;
        char[] letras = cadena.toLowerCase().toCharArray();
        for (char letra:letras) {
            if (letra == letraBuscar.toLowerCase().charAt(0)) {
                cuentaLetras++;
            }
        }
        System.out.println("La letra " + letraBuscar + " aparece " + cuentaLetras +" veces en " + cadena);

    }

    /**
     * Ejercicio 10: Palíndromo
     * Escribe un programa que determine si una palabra ingresada es un palíndromo.
     *
     * @param cadena
     * @return es palindromo?
     */
    public boolean esPalindromo(String cadena) {
        System.out.println("*** esPalindromo(" + cadena + ") ***");
        StringBuilder sbCadena = new StringBuilder(cadena.toLowerCase().replaceAll(" ", ""));
        StringBuilder sbCadenaInvertida = new StringBuilder(sbCadena).reverse();
        return sbCadena.toString().equals(sbCadenaInvertida.toString());
    }
}
