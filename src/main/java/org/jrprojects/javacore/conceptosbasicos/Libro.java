package org.jrprojects.javacore.conceptosbasicos;

import java.time.LocalDate;
import java.time.Period;

public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public String toString() {
        return "Título: " + titulo + "\n" +
                "Autor: " + autor + "\n" +
                "Año Publicación: " + anioPublicacion;
    }

    public String tieneMasDiezAnios() {
        Period tiempoDesdePublicacion = Period.between(LocalDate.of(anioPublicacion,1,1), LocalDate.now());

        return tiempoDesdePublicacion.getYears() >10 ? "El libro tiene más de 10 años de publicado.\n" : "El libro aún no tiene 10 años de publicado\n";
    }
}
