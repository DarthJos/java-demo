package org.jrprojects.refuerzo.colecciones;

import java.util.*;

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

    /**
     * Gestión de un diccionario:
     *
     * Usa un HashMap para almacenar palabras como claves y sus definiciones como valores.
     * Permite al usuario buscar la definición de una palabra.
     * Elimina una entrada dada una clave.
     */
    public void ejercicioDiccionario() {
        System.out.println("*** Ejercicio Diccionario ***");
        Scanner scanner = new Scanner(System.in);

        Map<String, String> diccionario = new HashMap<>();
        diccionario.put("hola","hello");
        diccionario.put("mundo","world");
        diccionario.put("amor","love");

        System.out.println("Ingresa una palabra en español para obtenerla en inglés: ");
        String palabraBuscar = scanner.nextLine().toLowerCase();

        if (diccionario.containsKey(palabraBuscar)) {
            System.out.println(diccionario.get(palabraBuscar));
        }
        else{
            System.out.println("Palabra no encontrada");
        }
    }

    /**
     * Crea un TreeMap para almacenar estudiantes (clave: ID, valor: nombre).
     * Agrega algunos estudiantes de forma desordenada.
     * Imprime los estudiantes en orden ascendente por su ID.
     */
    public void ejercicioEstudiantes() {
        System.out.println("*** EjercicioEstudiantes ***");
        Map<Integer, String> estudiantes = new TreeMap<>();
        estudiantes.put(4, "Juanito Macías");
        estudiantes.put(1, "Pánfilo Pérez");
        estudiantes.put(7, "Neto Cornetas");
        estudiantes.put(2, "Benito Camelas");

       for (Map.Entry<Integer, String> estudiante : estudiantes.entrySet()) {
           System.out.println(estudiante);
       }
    }

    /**
     * Historial de acceso con LinkedHashMap:
     *
     * Usa un LinkedHashMap para simular un historial de navegación (clave: URL, valor: fecha de acceso).
     * Asegúrate de que el historial se mantenga en orden de acceso.
     * Elimina la URL más antigua si hay más de 5 elementos.
     */
    public void ejercicioHistorialNavegacion() {

    }
}
