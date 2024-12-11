package org.jrprojects.javacore.excepciones;

/**
 * Ejercicio 3: Excepciones Personalizadas
 * Crea una clase de excepción personalizada llamada EdadInvalidaException.
 * Luego, escribe un programa que valide la edad de una persona antes de permitirle registrarse en un sistema.
 */
public class EdadInvalidaException extends Exception{
    public EdadInvalidaException (String mensaje) {
        super(mensaje);
    }
}
