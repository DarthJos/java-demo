package org.jrprojects.javacore.hilos;

import static java.lang.Thread.sleep;

public class EjerciciosHilos {

    /**
     * Ejercicio 1: Crear un hilo con Thread
     *
     * Escribe un programa que cree dos hilos utilizando la clase Thread.
     * Cada hilo debe imprimir un mensaje indicando su número (por ejemplo, "Hilo 1 ejecutándose")
     * y luego dormir durante 500ms.
     */
    public void ejercicio1() throws InterruptedException {
        MyThread hilo1 = new MyThread(1);
        MyThread hilo2 = new MyThread(2);
        hilo1.start();
        Thread.sleep(500);
        hilo2.start();
        Thread.sleep(500);
    }

    /**
     * Ejercicio 2: Crear un hilo con Runnable
     *
     * Crea una clase que implemente Runnable.
     * El método run() debe imprimir los números del 1 al 10 con una pausa de 200ms entre cada número.
     */
    public void ejercicio2() {
        MyRunnable hilo = new MyRunnable();
        hilo.run();
    }
}
