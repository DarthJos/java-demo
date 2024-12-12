package org.jrprojects.javacore.biblioteca;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jrprojects.javacore.biblioteca.excepciones.LibroNoDisponibleException;
import org.jrprojects.javacore.biblioteca.excepciones.UsuarioNoEncontradoException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Biblioteca {
    private static final Logger logger = LogManager.getLogger(Biblioteca.class);
    private List<Libro> listaDeLibros = new ArrayList<>();

    public List<Libro> getListaDeLibros() {
        return listaDeLibros;
    }


    public Map<Integer, Usuario> getUsuariosRegistrados() {
        return usuariosRegistrados;
    }

    private Map<Integer, Usuario> usuariosRegistrados = new HashMap<>();
    private int idUsuarioEnBiblio = 0;


    public void registrarUsuario(Usuario usuario) {
        //El id del usuario es único e irrepetible dentro de la biblio, si un usario se da de baja aún así el id queda inutilizable
        idUsuarioEnBiblio++;
        usuario.setId(idUsuarioEnBiblio);
        usuariosRegistrados.put(idUsuarioEnBiblio, usuario);
    }

    public void agregarLibro(Libro libro){
        listaDeLibros.add(libro);
    }

    public void prestarLibro(int userId, String tituloLibro) throws UsuarioNoEncontradoException, LibroNoDisponibleException {
        Libro libroAprestar = getLibro(tituloLibro);

        if (libroAprestar != null) {        //Revisa si el titulo que se quiere prestar existe en la lista de libros
            if (libroAprestar.isDisponible()) {     //Revisa la disponibilidad del libro
                if (usuariosRegistrados.get(userId) != null) {      //Revisa que el usuario esté registrado en la biblioteca
                    usuariosRegistrados.get(userId).agregarLibro(libroAprestar);    //Agrega el Libro a la lista de prestados del usuario
                    listaDeLibros.get(libroAprestar.getId()-1).setDisponible(false);  //Establece el libro en la lista de la biblioteca como no disponible
                }
                else{
                    throw new UsuarioNoEncontradoException("Usuario no está registrado en esta Biblioteca.");
                }
            }
            else {
                throw new LibroNoDisponibleException("Libro no disponible.");
            }

        }
        else {
            logger.error("No se encontró el libro a prestar.");
        }
    }

    public void devolverLibro(int userId, String tituloLibro) throws UsuarioNoEncontradoException {
        Libro libroAdevolver = getLibro(tituloLibro);

        if (libroAdevolver != null) {
            if (usuariosRegistrados.get(userId) != null) {
                usuariosRegistrados.get(userId).quitarLibro(libroAdevolver);
                listaDeLibros.get(libroAdevolver.getId()).setDisponible(true);
            }
            else{
                throw new UsuarioNoEncontradoException("Usuario no está registrado en esta Biblioteca.");
            }
        }
    }

    //REPORTES
    public List<Libro> librosPrestadosPorUsuario (int userId) throws UsuarioNoEncontradoException {
        Usuario usuario = usuariosRegistrados.get(userId);

        if (usuario != null) {
            return usuario.getListaDeLibrosPrestados();
        }
        else {
            throw new UsuarioNoEncontradoException("Usuario no encontrado.");
        }
    }

    public Libro getLibro(String tituloLibro) {
        for (Libro libro : listaDeLibros) {
            if (libro.getTitulo().equals(tituloLibro)) return libro;
        }
        return null;
    }
}
