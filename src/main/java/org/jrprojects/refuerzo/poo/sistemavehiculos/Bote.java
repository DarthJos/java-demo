package org.jrprojects.refuerzo.poo.sistemavehiculos;

public class Bote extends Vehiculo{
    public Bote(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void mover() {
        System.out.println("Moviendo Bote...");
    }
}
