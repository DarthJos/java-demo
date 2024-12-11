package org.jrprojects.javacore.hilos;

public class MyThread extends Thread{
    private int threadID;

    public MyThread(int threadID){
        this.threadID = threadID;
    }

    public void run() {
        System.out.println("Hilo "+threadID+" ejecutándose");
    }
}
