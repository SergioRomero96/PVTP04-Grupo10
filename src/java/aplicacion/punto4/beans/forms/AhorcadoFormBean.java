/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.punto4.beans.forms;

import aplicacion.punto4.modelo.dominio.Ahorcado;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Sergio Romero
 */
@ManagedBean
@ViewScoped
public class AhorcadoFormBean implements Serializable{
    private Ahorcado ahorcado;
    /**
     * Creates a new instance of AhorcadoFormBean
     */
    public AhorcadoFormBean() {
        ahorcado = new Ahorcado();
    }

    /**
     * @return the ahorcado
     */
    public Ahorcado getAhorcado() {
        return ahorcado;
    }

    /**
     * @param ahorcado the ahorcado to set
     */
    public void setAhorcado(Ahorcado ahorcado) {
        this.ahorcado = ahorcado;
    }
    
}
