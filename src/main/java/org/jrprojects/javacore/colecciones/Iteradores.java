package org.jrprojects.javacore.colecciones;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Iteradores {

    /**
     * Ejercicio 7: Iterador básico
     * Crea una lista de cadenas con nombres de ciudades.
     * Usa un Iterator para recorrer la lista e imprime cada ciudad.
     * Elimina todas las ciudades que comiencen con la letra "A".
     */
    public void ejercicio7() {
        //Crea una lista de cadenas con nombres de ciudades.
        List<String> ciudades = new ArrayList<>();
        ciudades.add("Córdoba");
        ciudades.add("Fortín");
        ciudades.add("Orizaba");
        ciudades.add("Puebla");
        ciudades.add("CDMX");
        ciudades.add("Atlixco");
        ciudades.add("Atotonilco");

        System.out.println("-- Lista de ciudades --");

        //Usa un Iterator para recorrer la lista e imprime cada ciudad.
        Iterator<String> iterador = ciudades.iterator();
        while(iterador.hasNext()) {
            var ciudad = iterador.next();
            System.out.println(ciudad);

            //Elimina todas las ciudades que comiencen con la letra "A".
            if (ciudad.startsWith("A")){
                iterador.remove();
            }
        }

        // como el iterador hizo los cambios sobre la lista, se puede mandar a imprimir la lista para ver los cambios
        System.out.println("-- Lista de ciudades que no empiezan con A --");
        System.out.println(ciudades);
    }

    /**
     * Ejercicio 8: Iterador con Set
     * Crea un HashSet con números enteros.
     * Usa un Iterator para recorrer el conjunto e imprime los números.
     * Elimina todos los números mayores a 50.
     */
    public void ejercicio8() {
        HashSet<Integer> enteros = new HashSet<>();
        enteros.add(3);
        enteros.add(20);
        enteros.add(41);
        enteros.add(56);
        enteros.add(70);
        enteros.add(11);
        enteros.add(3);

        //Imprime la lista original
        System.out.println("-- Lista Original --");
        System.out.println(enteros);

        //
        Iterator<Integer> iterador = enteros.iterator();
        while (iterador.hasNext()) {
            var entero = iterador.next();
            System.out.println(entero);

            //Elimina todos los números mayores a 50
            if (entero > 50) {
                iterador.remove();
            }
        }

        System.out.println("-- Lista sin mayores de 50 --");
        System.out.println(enteros);



    }
}
