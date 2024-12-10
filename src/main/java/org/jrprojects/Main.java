package org.jrprojects;

import org.jrprojects.poo.sistemaescolar.Estudiante;
import org.jrprojects.poo.sistemaescolar.Persona;
import org.jrprojects.poo.sistemaescolar.Profesor;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //System.out.println("Hello world!");

        ejecutaEjerciciosBasicos();
        ejecutaEjerciciosPOO();
    }

    public static void ejecutaEjerciciosBasicos() {

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
        miCuenta.retirar(350000);
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
    }

    public static void ejecutaEjerciciosPOO() {


        /*Automovil automovil = new Automovil();
        Bicicleta bicicleta = new Bicicleta();
        automovil.mover();
        bicicleta.mover();*/

        /*Animal[] animales = {
          new Perro(),
          new Gato()
        };

        for (int i = 0; i < animales.length; i++) {
            animales[i].hacerSonido();
        }*/

        /*List<Figura> listaFiguras = new ArrayList<>();
        listaFiguras.add(new Circulo(10));
        listaFiguras.add(new Rectangulo(2, 4));
        listaFiguras.add(new Circulo(1.0));
        listaFiguras.add(new Rectangulo(2, 2));

        for (int i = 0; i < listaFiguras.size(); i++) {
            System.out.println("El área es: "+ listaFiguras.get(i).calcularArea());
        }*/

        /*Pato pato = new Pato();
        pato.nadar();
        pato.volar();*/

        /*Empleado[] empleados = {
                new EmpleadoTiempoCompleto("Josimar", 43000.0),
                new EmpleadoMedioTiempo("Yvette", 20000.0)
        };

        for (Empleado empleado: empleados) {
            System.out.println("Nombre: " + empleado.getNombre() + "\n" +
                    "Salario: " + empleado.getSalario() + "\n" +
                    "Bonificación: " + empleado.calcularBonificacion() + "\n" );
        }*/

        /*List<Persona> personas = new ArrayList<>();
        personas.add(new Estudiante("Renata Limón", 17, 100));
        personas.add(new Estudiante("Romina Reyes", 17, 98));
        personas.add(new Estudiante("Valeria Córdova", 16, 99));
        personas.add(new Profesor("Josimar Reyes", 34, "Tecnología"));

        for (Persona persona : personas) {
            System.out.println(persona.mostrarDetalles());
        }*/
    }
}