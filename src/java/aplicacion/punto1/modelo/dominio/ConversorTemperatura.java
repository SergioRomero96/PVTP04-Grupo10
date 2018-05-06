

package aplicacion.punto1.modelo.dominio;

/**
 * 
 * @author Lenovo
 */
public class ConversorTemperatura {
 //el atributo  num1 obtiene el valor ingresado por el usuario y poder realizar la conversion solicitada
    private double num1;

    
    public double getNum1() {
        return num1;
    }

    /**
     * @param num1 the num1 to set
     */
    public void setNum1(double num1) {
        this.num1 = num1;
    }
    /**
     * Metodo que permite obtener la conversion de Fahreneit a Celsius
     * @return 
     */
    public double obtenerDeFahreneitAcelsius(){
        return 5*(num1-32)/9;
    }
    /**
     * Metodo que permite obtener la conversion de Kelvin  a Celsius
     * @return 
     */
    public double obtenerDeKelvinAcelsius(){
        return num1-273.15;
    }
    /**
     * Metodo que permite obtener la conversion de Celsius a Kelvin
     * @return 
     */
    public double obtenerDeCelsiusAKelvin(){
        return num1+273.15;
    }
    /**
     * Metodo que permite obtener la conversion de Kelvin a Fahreneit
     * @return 
     */
    public double obtenerDeKelvinAfahreneit(){
        return (9*(num1-273.15))+32;
    }
    /**
     * Metodo que permite obtener la conversion de Celsius a Fahrenheit 
     * @return 
     */
     public double obtenerDeCelsiusAFahrenheit(){
        return (9*num1/5)+32;
    }
     /**
     * Metodo que permite obtener la conversion de Fahrenheit a Kelvin
     * @return 
     */
    public double obtenerDeFahreneitAkelvin(){
        return (5*(num1-32)/9)+273.15;
    }
}
