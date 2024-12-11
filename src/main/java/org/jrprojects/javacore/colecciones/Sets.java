package org.jrprojects.javacore.colecciones;

import java.util.HashSet;

public class Sets {

    /**
     * Ejercicio 3: Eliminación de duplicados
     * Crea un HashSet para almacenar nombres.
     * Agrega nombres duplicados y verifica cuántos elementos únicos hay.
     * Elimina un elemento específico.
     * Recorre el HashSet con un bucle for-each.
     */
    public void ejercicio3() {
        //Crea un HashSet para almacenar nombres.
        HashSet<String> nombres = new HashSet<>();

        //Agrega nombres duplicados y verifica cuántos elementos únicos hay.
        nombres.add("Giselle");
        nombres.add("Diana");
        nombres.add("Diana");
        nombres.add("Lin");
        nombres.add("Celia");
        nombres.add("Lin");
        System.out.println("No. de elementos únicos: " + nombres.size());

        //Elimina un elemento específico.
        System.out.println("-- Original --");
        System.out.println(nombres);
        System.out.println("-- Resultante --");
        nombres.remove("Lin");
        System.out.println(nombres);

        //Recorre el HashSet con un bucle for-each.
        System.out.println("-- Recorriendo con for --");
        for (String nombre:nombres) {
            System.out.println(nombre);
        }
    }

    /**
     * Ejercicio 4: Operaciones entre conjuntos
     * Crea dos HashSet con números enteros.
     * Realiza las siguientes operaciones entre conjuntos:
     * Unión
     * Intersección
     * Diferencia
     */
    public void ejercicio4() {
        //Crea dos HashSet con números enteros.
        HashSet<Integer> enteros1 = new HashSet<>();
        enteros1.add(1);
        enteros1.add(2);
        enteros1.add(3);
        enteros1.add(4);

        HashSet<Integer> enteros2 = new HashSet<>();
        enteros2.add(3);
        enteros2.add(4);
        enteros2.add(5);
        enteros2.add(6);

        //Realiza las siguientes operaciones entre conjuntos:
        //Unión
        HashSet<Integer> unionEnteros = new HashSet<>(enteros1);
        unionEnteros.addAll(enteros2);
        System.out.println("-- Union de enteros1 y enteros2");
        System.out.println(unionEnteros);

        //Intersección
        HashSet<Integer> interseccionEnteros = new HashSet<>(enteros1);
        interseccionEnteros.retainAll(enteros2);
        System.out.println("-- Intersección de enteros1 con enteros2 --");
        System.out.println(interseccionEnteros);

        //Diferencia
        HashSet<Integer> diferenciaEnteros = new HashSet<>(enteros1);
        diferenciaEnteros.removeAll(enteros2);
        System.out.println("-- Diferencia de enteros1 - enteros2");
        System.out.println(diferenciaEnteros);
    }
}
