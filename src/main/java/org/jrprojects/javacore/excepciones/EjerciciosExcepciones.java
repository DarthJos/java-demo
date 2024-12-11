package org.jrprojects.javacore.excepciones;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EjerciciosExcepciones {
    /**
     * Ejercicio 1: Try-Catch-Finally
     * Escribe un programa que solicite al usuario dos números e intente realizar la división del primero entre el segundo.
     *
     * Requisitos:
     *
     * Usa un bloque try-catch para capturar la excepción de división por cero.
     * Usa un bloque finally para imprimir un mensaje de despedida.
     */
    public void ejercicio1() {
        System.out.println("*** EJERCICIO 1 ***");
        Scanner scanner = new Scanner(System.in);
        int numerador = 0;
        int denominador = 0;
        String division = "NA";

        try {
            System.out.println("Ingrese el numerador: ");
            numerador = scanner.nextInt();
            System.out.println("Ingrese el denominador: ");
            denominador = scanner.nextInt();

            division = String.valueOf(numerador/denominador);

            System.out.println("División: " + division + "\n");
        } catch (InputMismatchException e) {
            System.out.println("Sólo puedes ingresar números enteros...");
        } catch (ArithmeticException e) {
            System.out.println("Error: División por cero no permitida.");
        } finally {
            System.out.println("Gracias por usar el programa.");
        }
    }

    /**
     * Ejercicio 2: Manejo de throws
     * Escribe un programa que lea un archivo de texto llamado datos.txt y cuente el número de líneas en él.
     *
     * Requisitos:
     *
     * Crea un método llamado contarLineas que use la palabra clave throws para declarar que puede lanzar una IOException.
     * Maneja la excepción en el método principal.
     */
    public void contarLineas(String ruta) {
        System.out.println("*** EJERCICIO 2 ***");
        int contador = 0;

        try(BufferedReader br = new BufferedReader(new FileReader(ruta))){
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
                contador++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: El archivo datos.txt no se encontró.\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Número de líneas: " + contador);
    }

    /**
     *
     *Ejercicio 3: Excepciones Personalizadas.
     * Crea una clase de excepción personalizada llamada EdadInvalidaException.
     * Luego, escribe un programa que valide la edad de una persona antes de permitirle registrarse en un sistema.
     * @param edad recibe un número entero que representa la edad
     */
    public void validaEdad(int edad) throws EdadInvalidaException {
        System.out.println("*** Ejercicio 3 ***");
        if (edad<18 || edad>99) {
            throw new EdadInvalidaException("La edad ingresada no es válida");
        }
        else {
            System.out.println("Registro completado con éxito.");
        }
    }

    /**
     * Ejercicio 4: Jerarquía de Excepciones
     * Escribe un programa que intente convertir una cadena de caracteres a un número entero y realice una operación con él.
     *
     * Requisitos:
     *
     * Maneja las siguientes excepciones usando bloques catch separados:
     * NumberFormatException si la conversión falla.
     * ArithmeticException si ocurre una operación inválida (como dividir por cero).
     * Usa un bloque finally para imprimir "Programa terminado".
     */
    public void convierteACadenaYDivide(String cad1, String cad2) {
        System.out.println("*** Ejercicio 4 ***");
        try {
            int num1 = Integer.parseInt(cad1);
            int num2 = Integer.parseInt(cad2);

            System.out.println("Division de "+num1+"/"+num2 + "= " + num1/num2);
        } catch (NumberFormatException e) {
            System.out.println("Error: La entrada no es un número válido.");
        } catch (ArithmeticException e) {
            System.out.println("Error: División por cero.");
        }finally {
            System.out.println("Programa terminado.");
        }
    }

    /**
     * Ejercicio 5: Múltiples excepciones con try-catch
     * Escribe un programa que intente acceder a un índice de un arreglo ingresado por el usuario.
     *
     * Requisitos:
     *
     * Usa un arreglo fijo de tamaño 5 con valores predefinidos.
     * Captura las siguientes excepciones:
     * ArrayIndexOutOfBoundsException si el índice está fuera de los límites.
     * InputMismatchException si el usuario ingresa un valor no numérico.
     */
    public void ejercicio5() {
        System.out.println("*** Ejercicio 5 ***");
        Scanner input = new Scanner(System.in);
        //Declara arreglo con 5 valores predefinidos
        int[] enteros = {1, 2, 3, 4, 5};
        System.out.println("Ingresa un número para buscar índice y asignar valor: ");
        try {
            int index = input.nextInt();
            System.out.println(enteros[index]);
            enteros[3] = index;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Índice fuera de rango.\n");
        } catch (InputMismatchException e) {
            System.out.println("Error: entrada inválida, por favor ingrese un número.");
        }
    }

    /**
     * Ejercicio 6: Uso combinado de conceptos
     * Crea un programa que simule un sistema de retiro de cajero automático.
     *
     * Requisitos:
     *
     * Crea una excepción personalizada llamada SaldoInsuficienteException.
     * Escribe un método llamado retirarDinero que:
     * Verifique si el saldo es suficiente antes de permitir el retiro.
     * Lance la excepción personalizada si el saldo no es suficiente.
     * Usa un bloque try-catch para manejar la excepción y mostrar un mensaje apropiado al usuario.
     */
    double saldo = 500.0;
    public void retirarDinero(double monto) throws EdadInvalidaException {
        //verifica si hay saldo suficiente
        if (monto > saldo) {
            throw new EdadInvalidaException("Fondos insuficientes. Saldo disponible: "+saldo);
        }
        else {
            saldo -= monto;
            System.out.println("Retiro exitoso. Saldo restante: "+saldo);
        }
    }
}
