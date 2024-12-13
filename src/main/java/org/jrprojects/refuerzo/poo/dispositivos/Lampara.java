package org.jrprojects.refuerzo.poo.dispositivos;

public class Lampara implements Conectable{
    @Override
    public void encender() {
        System.out.println("Encendiendo Lampara...");
    }

    @Override
    public void apagar() {
        System.out.println("Apagando Lampara...");
    }
}
