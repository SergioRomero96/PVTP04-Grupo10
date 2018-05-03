/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.punto2.beans.forms;

import aplicacion.punto2.beans.GestorNumeroBean;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Sergio Romero
 */
@ManagedBean
@ViewScoped
public class GestorNumeroFormBean {
    @ManagedProperty(value = "#{gestorNumeroBean}")
    private GestorNumeroBean gestorNumeroBean;
    
    /**
     * Creates a new instance of GestorNumeroFormBean
     */
    public GestorNumeroFormBean() {
    }

    /**
     * @return the gestorNumeroBean
     */
    public GestorNumeroBean getGestorNumeroBean() {
        return gestorNumeroBean;
    }

    /**
     * @param gestorNumeroBean the gestorNumeroBean to set
     */
    public void setGestorNumeroBean(GestorNumeroBean gestorNumeroBean) {
        this.gestorNumeroBean = gestorNumeroBean;
    }
    
}
