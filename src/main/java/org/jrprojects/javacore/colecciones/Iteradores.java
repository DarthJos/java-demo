package org.jrprojects.javacore.colecciones;

import java.util.ArrayList;
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
}
