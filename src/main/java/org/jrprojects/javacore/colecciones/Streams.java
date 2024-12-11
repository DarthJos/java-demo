package org.jrprojects.javacore.colecciones;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class Streams {

    /**
     * Ejercicio 9: Procesamiento de datos
     * Dada una lista de números enteros:
     * Filtra los números pares.
     * Multiplica cada número par por 2.
     * Imprime la suma de todos los números resultantes.
     */
    public void ejercicio9() {
        //Dada una lista de números enteros:
        List<Integer> enteros = new ArrayList<>();
        enteros.add(4);
        enteros.add(2);
        enteros.add(5);
        enteros.add(6);
        enteros.add(11);
        System.out.println("-- Lista original --");
        System.out.println(enteros);

        //Filtra los números pares.
        System.out.println("-- Filtra números pares -- ");
        enteros.stream()
                .filter(entero -> entero % 2 ==0)
                .forEach(System.out::println);

        //Multiplica cada número par por 2.
        System.out.println("-- Multiplica números por 2 --");
        enteros.stream()
                .map(entero -> entero * 2)
                .forEach(System.out::println);

        //Imprime la suma de todos los números resultantes.
        System.out.println("-- Suma de todos los números multiplicados x 2 --");
        int suma =
                enteros.stream()
                        .map(entero -> entero * 2)
                        .reduce(0, Integer::sum);

        System.out.println(suma);
    }

    /**
     * Ejercicio 10: Filtrar cadenas
     * Dada una lista de cadenas:
     * Filtra las cadenas que tienen más de 4 caracteres.
     * Convierte las cadenas filtradas a mayúsculas.
     * Almacena las cadenas en una nueva lista.
     */
    public void ejercicio10() {
        //Dada una lista de cadenas:
        List<String> cadenas = new ArrayList<>();
        cadenas.add("Hola");
        cadenas.add("Mundo");
        cadenas.add("Java");
        cadenas.add("Mischa");
        cadenas.add("!");

        List<String> upperCadenas = new ArrayList<>();

        cadenas.stream()
                .filter(cadena -> cadena.length() > 4)  //Filtra las cadenas que tienen más de 4 caracteres.
                .map(String::toUpperCase)               //Convierte las cadenas filtradas a mayúsculas.
                .forEach(upperCadenas::add);            //Almacena las cadenas en una nueva lista.


        System.out.println("-- Lista original --");
        System.out.println(cadenas);
        System.out.println("-- Lista resultante --");
        System.out.println(upperCadenas);
    }

    /**
     * Ejercicio 11: Estadísticas con Streams
     * Crea una lista de números decimales.
     * Usa Streams para calcular:
     * El número más pequeño.
     * El número más grande.
     * El promedio de todos los números.
     */
    public void ejercicio11() {
        //Crea una lista de números decimales.
        List<Double> decimales = new ArrayList<>();
        decimales.add(10.1);
        decimales.add(2.4);
        decimales.add(3.0);
        decimales.add(21.5);
        decimales.add(13.7);
        System.out.println("-- Lista original --");
        System.out.println(decimales);

        //Usa Streams para calcular:
        //El número más pequeño.
        var minimo = decimales.stream()
                .min(Comparator.naturalOrder());
        //El número más grande.
        var maximo = decimales.stream()
                .max(Comparator.naturalOrder());

        //El promedio de todos los números.
        var promedio = decimales.stream()
                .mapToDouble(Double::doubleValue)
                .average();

        System.out.println("Mínimo: " + minimo);
        System.out.println("Máximo: " + maximo);
        System.out.println("Promedio. " + promedio);
    }

    /**
     * Ejercicio 12: Agrupamiento con Collectors
     * Dada una lista de estudiantes con sus calificaciones, clasifica a los estudiantes en:
     * Aprobados (calificación >= 60).
     * Reprobados (calificación < 60).
     */
    public void ejercicio12() {
        //Dada una lista de estudiantes con sus calificaciones, clasifica a los estudiantes en:
        HashMap<String, Double> estudiantes = new HashMap<>();
        estudiantes.put("Romina", 98.0);
        estudiantes.put("Gabriel Lee", 59.9);
        estudiantes.put("Renata", 100.0);
        estudiantes.put("Anahi", 56.5);
        estudiantes.put("Victoria", 83.0);
        estudiantes.put("Gabo", 95.0);

        //Aprobados (calificación >= 60).
        HashMap<String, Double> aprobados = new HashMap<>();
        estudiantes.entrySet().stream()
                .filter(aprobado -> aprobado.getValue() >= 60)
                .forEach(aprobado -> aprobados.put(aprobado.getKey(), aprobado.getValue()));

        //Reprobados (calificación < 60).
        HashMap<String, Double> reprobados = new HashMap<>();
        estudiantes.entrySet().stream()
                .filter(reprobado -> reprobado.getValue() < 60)
                .forEach(reprobado -> reprobados.put(reprobado.getKey(),reprobado.getValue()));

        System.out.println("-- Aprobados --");
        System.out.println(aprobados);
        System.out.println("-- Reprobados --");
        System.out.println(reprobados);
    }
}
