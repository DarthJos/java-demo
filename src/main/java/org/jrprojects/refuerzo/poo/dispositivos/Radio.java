package org.jrprojects.refuerzo.poo.dispositivos;

public class Radio implements Conectable{
    @Override
    public void encender() {
        System.out.println("Encendiendo Radio...");
    }

    @Override
    public void apagar() {
        System.out.println("Apagando Radio...");
    }
}
