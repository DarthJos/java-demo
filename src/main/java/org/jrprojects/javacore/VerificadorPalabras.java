package org.jrprojects.javacore;

public class VerificadorPalabras {

    public int cuentaPalabras(String frase){

        String[] palabras = frase.split(" ");

        return palabras.length;
    }

    public String aMayusculas(String frase) {
        return frase.toUpperCase();
    }

    public String verificaPalabra(String frase, String palabra) {

        return frase.contains(palabra) ? "Sí" : "No";
    }
}
