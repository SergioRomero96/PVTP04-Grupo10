

package aplicacion.punto3.modelo.dominio;

import java.io.Serializable;

/**
 * 
 * @author Lenovo
 */
public class Calculadora implements Serializable{
    private double dato1;
    private double dato2;
    

    public Calculadora() {
    }

    public Calculadora(double dato1, double dato2) {
        this.dato1 = dato1;
        this.dato2 = dato2;
    }

    
    /**
     * @return the dato1
     */
    public double getDato1() {
        return dato1;
    }

    /**
     * @param dato1 the dato1 to set
     */
    public void setDato1(double dato1) {
        this.dato1 = dato1;
    }

    /**
     * @return the dato2
     */
    public double getDato2() {
        return dato2;
    }

    /**
     * @param dato2 the dato2 to set
     */
    public void setDato2(double dato2) {
        this.dato2 = dato2;
    }
    /**
     * Permite obtener la suma dado los datos ingresados
     * @return 
     */
    public double calcularSuma(){
        return dato1+dato2;
    }
    /**
     * Permite obtener la resta dado los datos ingresados
     * @return 
     */
    public double calcularResta(){
        return dato1-dato2;
    }
    /**
     * Permite obtener la Divicion dado los datos ingresados
     * @return 
     */
    public double calcularDivicion(){
        return dato1/dato2;
    }
    /**
     * Permite obtener la Multiplicacion dado los datos ingresados
     * @return 
     */
    public double calcularMultiplicacion(){
        return dato1*dato2;
    }
    /**
     * Permite obtener la Potencia dado los datos ingresados
     * @return 
     */
    public double calcularPotencia(){
        return Math.pow(dato1, dato2);
    }
    
    public void obtenerNumeros(double num1, double num2){
        dato1 = num1;
        dato2 = num2;
    }
    
}