/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.punto7y8.beans.forms;

import aplicacion.punto7y8.modelo.dominio.Libro;
import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Sergio Romero
 */
@ManagedBean
@ViewScoped
public class LibroFormBean implements Serializable{
    private Libro libro;
    private ArrayList<Libro> libros;
    private String autorBuscado;
    private ArrayList<Libro> busquedaLibros;
    /**
     * Creates a new instance of LibroFormBean
     */
    public LibroFormBean() {
        libro = new Libro();
        libros = new ArrayList<>();
    }
    
    
    public void agregarLibro(){
        libros.add(libro);
        libro = new Libro();
        
    }
    
    public void buscarLibros(){
        busquedaLibros = new ArrayList<>();
        if(!libros.isEmpty()){
            for(Libro book : libros){
                if(book.getAutor().equals(autorBuscado)){
                    busquedaLibros.add(book);
                }
            }              
        }
        autorBuscado = "";
    }
    
    public ArrayList<String> listaAutores(){
        ArrayList<String> autores = new ArrayList<>();
        autores.add("Garcia Marquez Gabriel" );
        autores.add("Stevenson Robert");
        autores.add("Matute Ana Maria ");
        autores.add("Hemingway Ernest" );
        autores.add("Faulkner William ");
        autores.add("Infante Guillermo");
        return autores;
    }

    /**
     * @return the libro
     */
    public Libro getLibro() {
        return libro;
    }

    /**
     * @param libro the libro to set
     */
    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    /**
     * @return the libros
     */
    public ArrayList<Libro> getLibros() {
        return libros;
    }

    /**
     * @param libros the libros to set
     */
    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    /**
     * @return the autores
     */

    /**
     * @return the busquedaLibros
     */
    public ArrayList<Libro> getBusquedaLibros() {
        return busquedaLibros;
    }

    /**
     * @param busquedaLibros the busquedaLibros to set
     */
    public void setBusquedaLibros(ArrayList<Libro> busquedaLibros) {
        this.busquedaLibros = busquedaLibros;
    }

    /**
     * @return the autorBuscado
     */
    public String getAutorBuscado() {
        return autorBuscado;
    }

    /**
     * @param autorBuscado the autorBuscado to set
     */
    public void setAutorBuscado(String autorBuscado) {
        this.autorBuscado = autorBuscado;
    }
}