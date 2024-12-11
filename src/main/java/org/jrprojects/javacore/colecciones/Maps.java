package org.jrprojects.javacore.colecciones;

import java.util.*;

public class Maps {
    /**
     * Ejercicio 5: Agenda de contactos
     * Crea un HashMap para almacenar nombres (clave) y números de teléfono (valor).
     * Agrega al menos 5 contactos.
     * Imprime todos los contactos en el formato: Nombre: Número.
     * Actualiza el número de un contacto existente.
     * Elimina un contacto específico.
     * Busca si un contacto existe por su nombre.
     */
    public void ejercicio5() {
        //Crea un HashMap para almacenar nombres (clave) y números de teléfono (valor).
        HashMap<String, String> contactos = new HashMap();

        //Agrega al menos 5 contactos.
        contactos.put("Giselle", "272-208-9496");
        contactos.put("Josimar", "271-132-0219");
        contactos.put("Casa", "271-713-0061");
        contactos.put("Despacho", "271-714-4025");
        contactos.put("Chapis", "271-212-2480");

        System.out.println(contactos);

        //Actualiza el número de un contacto existente.
        contactos.replace("Josimar", "271-152-8209");

        //Imprime todos los contactos en el formato: Nombre: Número.
        System.out.println("-- Contactos --");
        for (Map.Entry<String, String> contacto : contactos.entrySet()) {
            System.out.println(contacto.getKey() + ": " + contacto.getValue());
        }

        //Elimina un contacto específico.
        contactos.remove("Despacho");

        //Busca si un contacto existe por su nombre.
        for (String nombre : contactos.keySet()){
            if (nombre.equals("Giselle")) System.out.println("Giselle encontrada");
        }

        System.out.println(contactos);
    }

    /**
     * Ejercicio 6: Contar frecuencias
     * Dada una lista de palabras, usa un HashMap para contar cuántas veces aparece cada palabra.
     * Imprime las palabras junto con sus frecuencias.
     */
    public void ejercicio6() {
        String cadena = "Hola Mundo Java. Este es un ejemplo de cadena en Java.";
        String[] arrayPalabras = cadena.split(" ");     //Parte toda la cadena por palabras y las almacena en un array
        List<String> listaPalabras = new ArrayList<>(Arrays.asList(arrayPalabras)); //Almacena el arreglo de palabras como una lista
        HashSet<String> palabrasSinRepetir = new HashSet<>(Arrays.asList(arrayPalabras));     //Guarda cada palabra sin repetir en un set
        HashMap<String, Integer> incidenciasPalabras = new HashMap<String, Integer>();

        // Revisa cada palabra sin repetir del texo y busca cuantas veces aparece en la lista completa de palabras
        for (String palabraSinRepetir : palabrasSinRepetir) {
            int frecuencia = 0;
            for (String palabra : listaPalabras) {
                if (palabraSinRepetir.equals(palabra)) frecuencia++;
            }
            incidenciasPalabras.put(palabraSinRepetir, frecuencia);
        }

        //Imprime cada palabra con su respectiva frecuencia
        System.out.println("-- Frecuencia por palabra --");
        for (Map.Entry<String,Integer> palabraContada : incidenciasPalabras.entrySet()) {
            System.out.println(palabraContada.getKey() + "--> " + palabraContada.getValue());
        }

    }
}
