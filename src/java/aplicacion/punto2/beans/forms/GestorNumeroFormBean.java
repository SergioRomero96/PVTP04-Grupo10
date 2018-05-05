/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.punto2.beans.forms;


import aplicacion.punto2.modelo.dominio.GestorNumeros;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Sergio Romero
 */
@ManagedBean
@ViewScoped
public class GestorNumeroFormBean {
   private GestorNumeros gestorNumeros;
    /**
     * Creates a new instance of GestorNumerosFormBean
     */
    public GestorNumeroFormBean() {
        gestorNumeros = new GestorNumeros();
    }

    /**
     * @return the gestorNumeros
     */
    public GestorNumeros getGestorNumeros() {
        return gestorNumeros;
    }

    /**
     * @param gestorNumeros the gestorNumeros to set
     */
    public void setGestorNumeros(GestorNumeros gestorNumeros) {
        this.gestorNumeros = gestorNumeros;
    }
    
    
}
