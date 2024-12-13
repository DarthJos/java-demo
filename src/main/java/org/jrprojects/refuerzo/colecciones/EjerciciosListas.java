package org.jrprojects.refuerzo.colecciones;

import java.util.*;

/**
 * Ejercicio 1: Crear una lista de números enteros:
 *
 * Añade los números del 1 al 10.
 * Elimina los números pares.
 * Muestra los números restantes usando un iterador.
 */
public class EjerciciosListas {

    public void ejercicio1() {
        System.out.println("*** Ejercicio 1 ***");
        List<Integer> enteros = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            enteros.add(i);
        }

        enteros.removeIf(entero -> entero % 2 == 0);

        Iterator<Integer> iterator = enteros.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    /**
     * Ejercicio 2. Lista de palabras únicas:
     *
     * Crea una lista con palabras repetidas.
     * Usa un Set para filtrar palabras duplicadas.
     * Muestra la lista original y el conjunto resultante.
     */
    public void ejercicio2() {
        System.out.println("*** Ejercicio 2 ***");
        List<String> palabras = new ArrayList<>();
        palabras.add("Hola");
        palabras.add("Mundo");
        palabras.add("Java");
        palabras.add("Bienvenido");
        palabras.add("al ");
        palabras.add("Mundo");

        //Imprime la lista de palabras original mediante un stream
        System.out.println("Lista original: ");
        palabras.forEach(System.out::println);

        //Crea el hasmap y lo llena con cada palabra de la lista original
        Set<String> palabrasUnicas = new HashSet<>(palabras);

        //Imprime el set resultante sin palabras repetidas
        System.out.println("\nLista sin repetidas: ");
        palabrasUnicas.forEach(System.out::println);
    }
}
