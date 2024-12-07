package org.jrprojects;

import org.jrprojects.javacore.Calificacion;
import org.jrprojects.javacore.VerificadorPalabras;

import static org.jrprojects.javacore.Calculadora.calculadora;
import static org.jrprojects.javacore.Multiplicador.imprimeTabla;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        //calculadora();
        imprimeTabla();

        //Calificacion calificacion = new Calificacion();
        //System.out.println("Promedio de las notas: "+calificacion.getPromedio());

        /*VerificadorPalabras verificador = new VerificadorPalabras();
        String frase = "Hola Mundo Java!";
        String palabra = "Java";
        System.out.println("Cantidad de Palabras: " + verificador.cuentaPalabras(frase));
        System.out.println("Frase en mayusculas: " + verificador.aMayusculas(frase));
        System.out.println("La palabra '"+palabra+"' se encuentra en la frase? " + verificador.verificaPalabra(frase, palabra));*/
    }
}