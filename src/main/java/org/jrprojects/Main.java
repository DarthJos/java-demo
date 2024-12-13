package org.jrprojects;

import org.jrprojects.javacore.biblioteca.Biblioteca;
import org.jrprojects.javacore.biblioteca.Libro;
import org.jrprojects.javacore.biblioteca.Usuario;
import org.jrprojects.javacore.biblioteca.excepciones.LibroNoDisponibleException;
import org.jrprojects.javacore.biblioteca.excepciones.UsuarioNoEncontradoException;
import org.jrprojects.javacore.excepciones.EdadInvalidaException;
import org.jrprojects.javacore.excepciones.EjerciciosExcepciones;
import org.jrprojects.javacore.excepciones.NumeroNegativoException;
import org.jrprojects.javacore.hilos.EjerciciosHilos;
import org.jrprojects.javacore.lambdas.EjerciciosLambdas;
import org.jrprojects.refuerzo.poo.dispositivos.Conectable;
import org.jrprojects.refuerzo.poo.dispositivos.Lampara;
import org.jrprojects.refuerzo.poo.dispositivos.Radio;
import org.jrprojects.refuerzo.poo.dispositivos.Televisor;
import org.jrprojects.refuerzo.poo.gestionacademica.Curso;
import org.jrprojects.refuerzo.poo.gestionacademica.Estudiante;
import org.jrprojects.refuerzo.poo.gestionacademica.Profesor;
import org.jrprojects.refuerzo.poo.sistemaempleados.Empleado;
import org.jrprojects.refuerzo.poo.sistemaempleados.Gerente;
import org.jrprojects.refuerzo.poo.sistemaempleados.Vendedor;
import org.jrprojects.refuerzo.poo.sistemavehiculos.Bote;
import org.jrprojects.refuerzo.poo.sistemavehiculos.Coche;
import org.jrprojects.refuerzo.poo.sistemavehiculos.Motocicleta;
import org.jrprojects.refuerzo.poo.sistemavehiculos.Vehiculo;
import org.jrprojects.refuerzo.sintaxisbasica.EjerciciosBasicos;
import org.jrprojects.refuerzo.tiposdatos.EjerciciosTipos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //System.out.println("Hello world!");

        //Ejercicios de la 1a Práctica
        /*ejecutaEjerciciosBasicos();
        ejecutaEjerciciosPOO();
        ejecutaEjerciciosColecciones();
        ejecutaEjerciciosExcepciones();
        ejecutaEjerciciosHilos();
        ejecutaEjerciciosLambda();
        ejecutaEjercicioBiblioteca();*/

        //Ejercicios de la 2a Práctica
        //ejecutaEjerciciosBasicos2();
        //ejecutaEjerciciosTipos();
        ejecutaEjerciciosPOO2();
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

    public static void ejecutaEjerciciosColecciones() {
        /*Listas ejerciciosListas = new Listas();
        ejerciciosListas.ejercicio1();
        ejerciciosListas.ejercicio2();*/

        /*Sets ejerciciosSets = new Sets();
        ejerciciosSets.ejercicio3();
        ejerciciosSets.ejercicio4();*/

        /*Maps maps = new Maps();
        maps.ejercicio5();
        maps.ejercicio6();*/

        /*Iteradores iteradores = new Iteradores();
        iteradores.ejercicio7();
        iteradores.ejercicio8();*/

        /*Streams streams = new Streams();
        streams.ejercicio9();
        streams.ejercicio10();
        streams.ejercicio11();
        streams.ejercicio12();*/
    }

    public static void ejecutaEjerciciosExcepciones() {
        EjerciciosExcepciones excepciones = new EjerciciosExcepciones();
        //excepciones.ejercicio1();
        //excepciones.contarLineas("src/main/java/org/jrprojects/javacore/excepciones/datos.txt");
        /*try{
           excepciones.validaEdad(25);
        } catch (EdadInvalidaException e) {
            System.out.println("Error: " + e);
        }*/
        //excepciones.convierteACadenaYDivide("10", "0");
        //excepciones.ejercicio5();
        /*try{
            excepciones.retirarDinero(600.0);
        } catch (EdadInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        }*/
        /*try {
            System.out.println(excepciones.calcularRaizCuadrada(-4));
        } catch (NumeroNegativoException e) {
            System.out.println("Error: " + e);
        }*/
    }

    public static void ejecutaEjerciciosHilos() {
        EjerciciosHilos ejerciciosHilos = new EjerciciosHilos();
        /*try {
            ejerciciosHilos.ejercicio1();
        } catch (InterruptedException e) {
            System.out.println("InterruptedException D:");
        }

        ejerciciosHilos.ejercicio2();*/
        //ejerciciosHilos.ejercicio3();

        //ejerciciosHilos.ejercicioParesImpares();
    }

    public static void ejecutaEjerciciosLambda(){
        EjerciciosLambdas ejerciciosLambdas = new EjerciciosLambdas();
        //ejerciciosLambdas.ejecutaOperaciones(3,2);
        //System.out.println(ejerciciosLambdas.esPar(11));
    }

    public static void ejecutaEjercicioBiblioteca() {
        Biblioteca biblioteca = new Biblioteca();

        // Agregar libros
        biblioteca.agregarLibro(new Libro(1, "1984", "George Orwell", true));
        biblioteca.agregarLibro(new Libro(2, "El principito", "Antoine de Saint-Exupéry", true));

        // Registrar usuarios
        biblioteca.registrarUsuario(new Usuario("Alice"));
        biblioteca.registrarUsuario(new Usuario("Bob"));

        int userId = 1;
        try {
            // Prestar libros
            biblioteca.prestarLibro(userId, "El principito");
            // Reporte de libros prestados
            System.out.println(biblioteca.getUsuariosRegistrados().get(userId).getNombre());
            biblioteca.librosPrestadosPorUsuario(userId).forEach(System.out::println);
        } catch (UsuarioNoEncontradoException e) {
            System.out.println(e.getMessage());
        } catch (LibroNoDisponibleException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void ejecutaEjerciciosBasicos2() {
        EjerciciosBasicos ejerciciosBasicos = new EjerciciosBasicos();
        ejerciciosBasicos.ejercicio1();
        ejerciciosBasicos.ejercicio2(4,6);
        ejerciciosBasicos.ejercicio3();
        System.out.println(ejerciciosBasicos.getFactorial(5));
        System.out.println("Ingresa un número para imprimir su tabla: ");
        int tabla = scanner.nextInt();
        ejerciciosBasicos.imprimeTabla(tabla);
    }

    public static void ejecutaEjerciciosTipos() {
        EjerciciosTipos ejerciciosTipos = new EjerciciosTipos();
        ejerciciosTipos.ejercicio6();
        int[] enteros = {1,2,3,4,5};
        System.out.println(ejerciciosTipos.getPromedioArrayEnteros(enteros));
        int[] enterosInvertidos = ejerciciosTipos.invierteArrayEnteros(enteros);
        Arrays.stream(enterosInvertidos).forEach(System.out::println);
        ejerciciosTipos.ejercicio9("Hola mundo java");
        System.out.println(ejerciciosTipos.esPalindromo("Anita lava la tina"));
    }


    private static void ejecutaEjerciciosPOO2() {
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new Gerente("Josimar", 80000));
        empleados.add(new Vendedor("Yvi", 50000));
        empleados.add(new Empleado("Chapis", 30000));
        for (Empleado empleado : empleados)
            empleado.calcularSalario();

        List<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(new Bote("Botal", "Super-B"));
        vehiculos.add(new Coche("Seat", "Toledo FR Line"));
        vehiculos.add(new Motocicleta("Harley", "Mamalona 3000"));
        for (Vehiculo vehiculo : vehiculos) vehiculo.mover();

        List<Conectable> dispositivos = new ArrayList<>();
        dispositivos.add(new Televisor());
        dispositivos.add(new Radio());
        dispositivos.add(new Lampara());
        for(Conectable dispositivo : dispositivos) {
            dispositivo.encender();
            dispositivo.apagar();
        }

        Profesor profesor = new Profesor(34, "Josimar Reyes Campos");
        List<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante(17, "Romina Reyes"));
        estudiantes.add(new Estudiante(17, "Renata Limón"));
        estudiantes.add(new Estudiante(17, "Karen Vazquez"));
        estudiantes.add(new Estudiante(16, "Valeria Córdova"));
        Curso tecnologia = new Curso("Tecnología V", profesor, estudiantes);
        tecnologia.mostrarCurso();
    }
}