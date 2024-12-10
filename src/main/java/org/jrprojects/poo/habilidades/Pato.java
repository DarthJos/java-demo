package org.jrprojects.poo.habilidades;

public class Pato implements Volador, Nadador{

    @Override
    public void nadar() {
        System.out.println("Pato nadando...");
    }

    @Override
    public void volar() {
        System.out.println("Pato volando...");
    }
}
