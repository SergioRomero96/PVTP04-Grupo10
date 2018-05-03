/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.punto2.beans;

import aplicacion.punto2.modelo.dominio.GestorNumeros;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Sergio Romero
 */
@ManagedBean
@ViewScoped
public class GestorNumeroBean implements Serializable{
    private GestorNumeros gestorNumero;
    
    /**
     * Creates a new instance of GestorNumeroBean
     */
    public GestorNumeroBean() {
    }
    
    @PostConstruct
    public void init(){
        gestorNumero = new GestorNumeros();
    }
    
    /**
     * @return the gestorNumero
     */
    public GestorNumeros getGestorNumero() {
        return gestorNumero;
    }

    /**
     * @param gestorNumero the gestorNumero to set
     */
    public void setGestorNumero(GestorNumeros gestorNumero) {
        this.gestorNumero = gestorNumero;
    }
    
}
