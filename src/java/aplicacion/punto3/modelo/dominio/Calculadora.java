

package aplicacion.punto3.modelo.dominio;

/**
 * 
 * @author Lenovo
 */
public class Calculadora {
    private double dato1;
    private double dato2;

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
    public double calcularSuma(){
        return dato1+dato2;
    }
    public double calcularResta(){
        return dato1-dato2;
    }
    public double calcularDivicion(){
        return dato1/dato2;
    }
    public double calcularMultiplicacion(){
        return dato1*dato2;
    }
    public double calcularPotencia(){
        return Math.pow(dato1, dato2);
    }
}
