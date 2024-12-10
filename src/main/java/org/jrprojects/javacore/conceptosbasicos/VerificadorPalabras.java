package org.jrprojects.javacore.conceptosbasicos;

public class VerificadorPalabras {

    public int getNumPalabras(String frase){

        String[] palabras = frase.split(" ");

        return palabras.length;
    }

    public String setToMayus(String frase) {
        return frase.toUpperCase();
    }

    public String contienePalabra(String frase, String palabra) {

        return frase.contains(palabra) ? "Sí" : "No";
    }
}
