package org.jrprojects.refuerzo.colecciones;

import java.util.HashSet;
import java.util.Set;

public class EjerciciosSets {

    /**
     * Comparar Sets:
     *
     * Crea dos Sets con diferentes números enteros.
     * Encuentra la unión, intersección y diferencia entre ambos conjuntos.
     */
    public void ejercicioComparador() {
        System.out.println("*** Ejercicio contador ***");
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);

        //Union
        Set<Integer> setUnion = new HashSet<>(set1);
        setUnion.addAll(set2);
        System.out.println("Union: ");
        setUnion.forEach(System.out::println);

        //Intersección
        Set<Integer> setInterseccion = new HashSet<>(set1);
        setInterseccion.retainAll(set2);
        System.out.println("Intersección: ");
        setInterseccion.forEach(System.out::println);

        //Diferencia

        Set<Integer> setDiferencia1 = new HashSet<>(set1);
        setDiferencia1.removeAll(set2);
        Set<Integer> setDiferencia2 = new HashSet<>(set2);
        setDiferencia2.removeAll(set1);

        Set<Integer> setDiferenciaTotal = new HashSet<>(setDiferencia1);
        setDiferenciaTotal.addAll(setDiferencia2);
        System.out.println("Diferencia");
        setDiferenciaTotal.forEach(System.out::println);
    }
}
