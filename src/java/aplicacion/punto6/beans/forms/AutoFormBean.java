/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.punto6.beans.forms;

import aplicacion.punto6.modelo.dominio.Auto;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.primefaces.PrimeFaces;
import org.primefaces.context.RequestContext;

/**
 *
 * @author Sergio Romero
 */
@ManagedBean
@ViewScoped
public class AutoFormBean implements Serializable{
    
    private Auto[] autos;
    private Auto auto;
    /**
     * Creates a new instance of AutoFormBean
     */
    public AutoFormBean() {
        auto = new Auto();
        autos = new Auto[6];
        autos[0] = new Auto("CTC123","Ford",2010,"Gris","Diesel");
        autos[1] = new Auto("DEH482","Toyota",2012,"Negro","Super");
        autos[2] = new Auto("DJK283","Peugeot",2012,"Morado","Diesel");
        autos[3] = new Auto("GIO348","Nisan",2014,"Azul","Super"); 
        autos[4] = new Auto("MNS382","BMW",2016,"Azul","Infinia");
        autos[5] = new Auto("ZXV438","Bentley",2018,"Gris","Diesel");
    }
    
    public void modificarAuto(){
        boolean band = false;
        for(int i = 0; i< getAutos().length && !band; i++)
            if(getAuto().getPatente().equals(getAutos()[i].getPatente())){
                getAutos()[i].setMarca(getAuto().getMarca());
                getAutos()[i].setModelo(getAuto().getModelo());
                getAutos()[i].setColor(getAuto().getColor());
                getAutos()[i].setCombustible(getAuto().getCombustible());
                band = true;
            }
        PrimeFaces.current().executeScript("PF('dialogEditar').hide();");
    }

    /**
     * @return the autos
     */
    public Auto[] getAutos() {
        return autos;
    }

    /**
     * @param autos the autos to set
     */
    public void setAutos(Auto[] autos) {
        this.autos = autos;
    }

    /**
     * @return the auto
     */
    public Auto getAuto() {
        return auto;
    }

    /**
     * @param auto the auto to set
     */
    public void setAuto(Auto auto) {
        this.auto = auto;
    }
}
