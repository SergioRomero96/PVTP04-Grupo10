package aplicacion.punto3.beans.forms;

import aplicacion.punto3.modelo.dominio.Calculadora;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Lenovo
 */
@ManagedBean
@ViewScoped
public class CalculadoraFormBean {

    private Calculadora calculadora;
    private char eleccion;
   
    //se inicializa el atributo tipo Calculadora
    public CalculadoraFormBean() {
        calculadora = new Calculadora();
    }

    /**
     * @return the calculadora
     */
    public Calculadora getCalculadora() {
        return calculadora;
    }

    /**
     * @param calculadora the calculadora to set
     */
    public void setCalculadora(Calculadora calculadora) {
        this.calculadora = calculadora;
    }

    /**
     * @return the eleccion
     */
    public char getEleccion() {
        return eleccion;
    }

    /**
     * @param eleccion the eleccion to set
     */
    public void setEleccion(char eleccion) {
        this.eleccion = eleccion;
    }
    /**
     * Permite obtener un resultado segun la operacion que solicite el usuario
     * @return 
     */
    public double obtenerResultado() {
        double resultado = .0;
        calculadora = new Calculadora();
        if (eleccion == 'S') {
            resultado = calculadora.calcularSuma();
        }
        if (eleccion == 'R') {
            resultado = calculadora.calcularResta();
        }
        if (eleccion == 'D') {
            resultado = calculadora.calcularDivicion();
        }
        if (eleccion == 'M') {
            resultado = calculadora.calcularMultiplicacion();
        }
        if (eleccion == 'P') {
            resultado = calculadora.calcularPotencia();
        }
        return resultado;
    }
}
