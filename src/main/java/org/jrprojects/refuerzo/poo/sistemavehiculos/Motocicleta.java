package org.jrprojects.refuerzo.poo.sistemavehiculos;

public class Motocicleta extends Vehiculo{
    public Motocicleta(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void mover() {
        System.out.println("Moviendo Motocicleta...");
    }
}
