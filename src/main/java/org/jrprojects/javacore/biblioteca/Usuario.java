package org.jrprojects.javacore.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private int id;
    private String nombre;
    private List<Libro> listaDeLibrosPrestados = new ArrayList<>();

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Libro> getListaDeLibrosPrestados() {
        return listaDeLibrosPrestados;
    }

    public void setListaDeLibrosPrestados(List<Libro> listaDeLibrosPrestados) {
        this.listaDeLibrosPrestados = listaDeLibrosPrestados;
    }

    public void agregarLibro(Libro libro) {
        listaDeLibrosPrestados.add(libro);
    }

    public void quitarLibro(Libro libro) {
        listaDeLibrosPrestados.remove(libro);
    }
}
