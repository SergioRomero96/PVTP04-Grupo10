
package aplicacion.punto1.beans.forms;

import aplicacion.punto1.modelo.dominio.ConversorTemperatura;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Lenovo
 */
@ManagedBean
@ViewScoped
public class ConvertidorTemperaturaFormBean {
// se define los atributos conversor es una atributo tipo ConversorTemperatura que permite trabajar con la clase
 //ConversorTemperatura 
    private ConversorTemperatura conversor;
    //atributos que se utilizara para obtener las selecciones de conversion del usuario
    private char valorInicial;
    private char valorFinal;

    public ConvertidorTemperaturaFormBean() {
        conversor = new ConversorTemperatura();
    }

    /**
     * @return the conversors
     */
    public ConversorTemperatura getConversor() {
        return conversor;
    }

    /**
     * @param conversor the conversor to set
     */
    public void setConversor(ConversorTemperatura conversor) {
        this.conversor = conversor;
    }

    /**
     * @return the valorInicial
     */
    public char getValorInicial() {
        return valorInicial;
    }

    /**
     * @param valorInicial the valorInicial to set
     */
    public void setValorInicial(char valorInicial) {
        this.valorInicial = valorInicial;
    }

    /**
     * @return the valorFinal
     */
    public char getValorFinal() {
        return valorFinal;
    }

    /**
     * @param valorFinal the valorFinal to set
     */
    public void setValorFinal(char valorFinal) {
        this.valorFinal = valorFinal;
    }
    /**
     * Metodo que permite obtener el resultado segun la conversion que desea realizar el usuario 
     * ya sea de Celsius a Kelvin de Celsius a Fahreneit - Fahreneit a Kelvin , Kelvin a Fahrenheit - Kelvin a Celsius
     * Fahreneit a Celsius
     * @return  Conversion
     */
    public double obtenerResultado() {
        /*se define la variable resultado=.0 en el caso que no se encuentre niguna considaencia de los datos ingresados
        por el usuario entonces retorana .0*/
        double resultado = .0;
        //se crea un objeto tipo ConversorTemperatura llamado conversor
        conversor = new ConversorTemperatura();
        /*Segun la opcion de incio y final ingresados por el usuario se obtendra el resultado de la conversion
        solicitada*/
        if (valorInicial == 'F' && valorFinal == 'C') {
            resultado = conversor.obtenerDeFahreneitAcelsius();
        }
        if (valorInicial == 'C' && valorFinal == 'F') {
            resultado = conversor.obtenerDeCelsiusAFahrenheit();
        }
        if (valorInicial == 'F' && valorFinal == 'K') {
            resultado = conversor.obtenerDeFahreneitAkelvin();
        }
        if (valorInicial == 'K' && valorFinal == 'F') {
            resultado = conversor.obtenerDeKelvinAfahreneit();
        }
        if (valorInicial == 'C' && valorFinal == 'K') {
            resultado = conversor.obtenerDeCelsiusAKelvin();
        }
        if (valorInicial == 'K' && valorFinal == 'C') {
            resultado = conversor.obtenerDeKelvinAcelsius();
        }
        return resultado;
    }
    
}
