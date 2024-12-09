package org.jrprojects;

import org.jrprojects.javacore.CuentaBancaria;
import org.jrprojects.javacore.Estudiante;
import org.jrprojects.javacore.Libro;
import org.jrprojects.javacore.VerificadorPalabras;
import org.jrprojects.poo.sistematransporte.Automovil;
import org.jrprojects.poo.sistematransporte.Bicicleta;

public class Main {

    public static void main(String[] args) {
        //System.out.println("Hello world!");

        //calculadora();
        //imprimeTabla();

        //Calificacion calificacion = new Calificacion();
        //System.out.println("Promedio de las notas: "+calificacion.getPromedio());

        /*VerificadorPalabras verificador = new VerificadorPalabras();
        String frase = "Hola Mundo Java!";
        String palabra = "Java";
        System.out.println("Cantidad de Palabras: " + verificador.getNumPalabras(frase));
        System.out.println("Frase en mayusculas: " + verificador.setToMayus(frase));
        System.out.println("La palabra '"+palabra+"' se encuentra en la frase? " + verificador.contienePalabra(frase, palabra));*/

        /*Estudiante josi = new Estudiante("Josi", 34, 100);
        Estudiante yvi = new Estudiante("Yvi", 24, 99);
        Estudiante carito = new Estudiante("Luna Carolina", 1, 99.9);

        System.out.println(josi.isApproved());
        System.out.println(yvi.getEdad());
        System.out.println(carito.getNombre());*/

        /*CuentaBancaria miCuenta = new CuentaBancaria(4152313184328164L, 200000.00);
        miCuenta.depositar(150000);
        miCuenta.retirar(40000);
        System.out.println(miCuenta.mostrarSaldo());*/

        /*Libro[] libros = {
            new Libro("Un mundo feliz", "Aldous Houxley", 1900),
            new Libro("La tumba del templo de la Luna", "Ni Me Acuerdo", 1900),
            new Libro("Mi Mami", "Carolina Morales", 1930),
            new Libro("Cómo hacer una película Porno", "El Josi", 2014),
            new Libro("Es Neta?", "Jordy Rosado", 2019)
        };

        for (int i = 0; i < libros.length; i++) {
            System.out.println(libros[i].toString());
            System.out.println(libros[i].tieneMasDiezAnios());
        }*/

        Automovil automovil = new Automovil();
        Bicicleta bicicleta = new Bicicleta();
        automovil.mover();
        bicicleta.mover();
    }
}