package aplicacion.punto5.beans.forms;

import aplicacion.punto5.modelo.dominio.Profesor;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Lenovo
 */
@ManagedBean
@ViewScoped
public class ProfesorFormBean {

    private Profesor profesor;
    private Profesor nuevoProfesor;

    /**
     * Creates a new instance of ProfesorFormBean
     */
    public ProfesorFormBean() {
        profesor = new Profesor();
        nuevoProfesor = new Profesor();
    }

    /**
     * @return the profesor
     */
    public Profesor getProfesor() {
        return profesor;
    }

    /**
     * @param profesor the profesor to set
     */
    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    /**
     * @return the nuevoProfesor
     */
    public Profesor getNuevoProfesor() {
        return nuevoProfesor;
    }

    /**
     * @param nuevoProfesor the nuevoProfesor to set
     */
    public void setNuevoProfesor(Profesor nuevoProfesor) {
        this.nuevoProfesor = nuevoProfesor;
    }
    /**
     * permite agregar un nuevo profesor y poder mostrar los datos 
     */
    public void agregarProfesor() {
        profesor = nuevoProfesor;
        nuevoProfesor = new Profesor();
    }

}
