package aplicacion.punto3.beans.forms;

import aplicacion.punto3.modelo.dominio.Calculadora;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Lenovo
 */
@ManagedBean
@ViewScoped
public class CalculadoraFormBean implements Serializable {
    private Calculadora calculadora;
    private char operacion;
   
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
     * Permite obtener un resultado segun la operacion que solicite el usuario
     * @return 
     */
    public double obtenerResultado() {
        double resultado = 0;
        switch (operacion){
            case 'S': resultado = calculadora.calcularSuma(); break;
            case 'R': resultado = calculadora.calcularResta(); break;
            case 'M': resultado = calculadora.calcularMultiplicacion(); break;
            case 'D': resultado = calculadora.calcularDivicion(); break;
            case 'P': resultado = calculadora.calcularPotencia(); break; 
        }
        return resultado;
    }

    /**
     * @return the operacion
     */
    public char getOperacion() {
        return operacion;
    }

    /**
     * @param operacion the operacion to set
     */
    public void setOperacion(char operacion) {
        this.operacion = operacion;
    }
  
}
