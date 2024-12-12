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

    /**
     * Ejercicio 3: Prioridad de hilos
     *
     * Escribe un programa con tres hilos.
     * Establece diferentes prioridades a los hilos y observa el orden en el que se ejecutan.
     */
    public void ejercicio3() {
        MyThread hilo1 = new MyThread(1);
        MyThread hilo2 = new MyThread(2);
        MyThread hilo3 = new MyThread(3);

        hilo1.setPriority(1);
        hilo2.setPriority(10);
        hilo3.setPriority(5);

        hilo1.start();
        hilo2.start();
        hilo3.start();
    }

    /**
     * Crear dos hilos:
     *  - Uno imprimirá los números pares del 1 al 10,
     *  - El otro los números impares del 1 al 10.
     * Ejecución concurrente: Ambos hilos deben ejecutarse de forma simultánea, es decir, intercalando sus impresiones.
     */
    public void ejercicioParesImpares() {
        HiloImpares hiloImpares = new HiloImpares();
        HiloPares hiloPares = new HiloPares();

        hiloImpares.start();
        hiloPares.start();
    }

    /**
     * Ejercicio 4: Pool de Hilos
     *
     * Utiliza ExecutorService con un pool fijo de 3 hilos.
     * Crea 10 tareas que impriman el nombre del hilo que las está ejecutando y el índice de la tarea
     * (por ejemplo, "Hilo pool-1-thread-1 ejecutando tarea 3").
     */
}
