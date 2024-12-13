package org.jrprojects.refuerzo.poo.dispositivos;

public class Televisor implements Conectable{
    @Override
    public void encender() {
        System.out.println("Encendiendo Televisor...");
    }

    @Override
    public void apagar() {
        System.out.println("Apagando Televisor...");
    }
}
