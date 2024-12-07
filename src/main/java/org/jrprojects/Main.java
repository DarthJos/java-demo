package org.jrprojects;

import org.jrprojects.javacore.Estudiante;
import org.jrprojects.javacore.VerificadorPalabras;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        //calculadora();
        //imprimeTabla();

        //Calificacion calificacion = new Calificacion();
        //System.out.println("Promedio de las notas: "+calificacion.getPromedio());

        /*VerificadorPalabras verificador = new VerificadorPalabras();
        String frase = "Hola Mundo Java!";
        String palabra = "Java";
        System.out.println("Cantidad de Palabras: " + verificador.getNumPalabras(frase));
        System.out.println("Frase en mayusculas: " + verificador.setToMayus(frase));
        System.out.println("La palabra '"+palabra+"' se encuentra en la frase? " + verificador.contienePalabra(frase, palabra));*/

        Estudiante josi = new Estudiante("Josi", 34, 100);
        Estudiante yvi = new Estudiante("Yvi", 24, 99);
        Estudiante carito = new Estudiante("Luna Carolina", 1, 99.9);

        System.out.println(josi.isApproved());
        System.out.println(yvi.getEdad());
        System.out.println(carito.getNombre());
    }
}