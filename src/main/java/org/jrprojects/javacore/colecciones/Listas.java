package org.jrprojects.javacore.colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class Listas {

    /**
     * Ejercicio 1: Operaciones básicas con List
     * Crea un ArrayList para almacenar nombres de estudiantes.
     * Agrega al menos 5 nombres.
     * Imprime el tamaño de la lista.
     * Inserta un nombre en la segunda posición.
     * Elimina el tercer elemento de la lista.
     * Verifica si un nombre específico está en la lista.
     * Recorre la lista usando un bucle for.
     */
    public void ejercicio1() {

        //Crea un ArrayList para almacenar nombres de estudiantes.
        List<String> nombres = new ArrayList<>();

        //Agrega al menos 5 nombres.
        nombres.add("Valeria");
        nombres.add("Renata");
        nombres.add("María Paulina");
        nombres.add("Romina");
        nombres.add("Karen");

        //Imprime el tamaño de la lista.
        System.out.println("Tamaño de la lista: " + nombres.size());

        //Inserta un nombre en la segunda posición.
        nombres.add(1, "Alina");

        //Elimina el tercer elemento de la lista.
        nombres.remove(2);

        //Verifica si un nombre específico está en la lista.
        System.out.println("Se encuentra Romina? " + nombres.contains("Romina"));

        //Recorre la lista usando un bucle for.
        System.out.println("Lista de nombres: ");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }

    /**
     * Ejercicio 2: Ordenamiento
     * Crea una lista de números enteros.
     * Ordena la lista en orden ascendente.
     * Ordena la lista en orden descendente.
     * Usa el método Collections.shuffle() para mezclar los elementos y luego vuelve a ordenarlos.
     */
    public void ejercicio2() {
        //Crea una lista de números enteros.
        List<Integer> enteros = new ArrayList<>();
        enteros.add(4);
        enteros.add(1);
        enteros.add(3);
        enteros.add(2);

        System.out.println(enteros);

        //Ordena la lista en orden ascendente.
        Collections.sort(enteros);
        System.out.println(enteros);

        //Ordena la lista en orden descendente.
        Collections.sort(enteros,Collections.reverseOrder());
        System.out.println(enteros);

        //Usa el método Collections.shuffle() para mezclar los elementos y luego vuelve a ordenarlos.
        Collections.shuffle(enteros);
        System.out.println(enteros);
        Collections.sort(enteros);
        System.out.println(enteros);
    }
}
