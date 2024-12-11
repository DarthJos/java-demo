package org.jrprojects.javacore.excepciones;

public class SaldoInsuficienteException extends Exception{
    public SaldoInsuficienteException(String mensaje) {
        super(mensaje);
    }
}
