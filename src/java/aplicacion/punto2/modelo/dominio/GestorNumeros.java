/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aplicacion.punto2.modelo.dominio;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * 
 * @author Sergio Romero
 */
public class GestorNumeros implements Serializable{
    private double numero;
    private double numeroMenor;
    private double numeroMayor;
    private double promedioNumeros;
    private ArrayList<Double> numeros;

    public GestorNumeros() {
        numeros = new ArrayList<>();
    }

    public GestorNumeros(double numero, double numeroMenor, double numeroMayor, double promedioNumeros, ArrayList<Double> numeros) {
        this.numero = numero;
        this.numeroMenor = numeroMenor;
        this.numeroMayor = numeroMayor;
        this.promedioNumeros = promedioNumeros;
        this.numeros = numeros;
    }
    
    /**
     * @return the numero
     */
    public double getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(double numero) {
        this.numero = numero;
    }

    /**
     * @return the numeroMenor
     */
    public double getNumeroMenor() {
        return numeroMenor;
    }

    /**
     * @param numeroMenor the numeroMenor to set
     */
    public void setNumeroMenor(double numeroMenor) {
        this.numeroMenor = numeroMenor;
    }

    /**
     * @return the numeroMayor
     */
    public double getNumeroMayor() {
        return numeroMayor;
    }

    /**
     * @param numeroMayor the numeroMayor to set
     */
    public void setNumeroMayor(double numeroMayor) {
        this.numeroMayor = numeroMayor;
    }

    /**
     * @return the promedioNumeros
     */
    public double getPromedioNumeros() {
        return promedioNumeros;
    }

    /**
     * @param promedioNumeros the promedioNumeros to set
     */
    public void setPromedioNumeros(double promedioNumeros) {
        this.promedioNumeros = promedioNumeros;
    }

    /**
     * @return the numeros
     */
    public ArrayList<Double> getNumeros() {
        return numeros;
    }

    /**
     * @param numeros the numeros to set
     */
    public void setNumeros(ArrayList<Double> numeros) {
        this.numeros = numeros;
    }
    
    public void agregarNumeros(){
        numeros.add(numero);
        numero = 0.0;
    }
    
    public double obtenerNumeroMayor(){
        if(!numeros.isEmpty()){
            numeroMayor = numeros.get(0);
            for(double i : numeros){
                if(i > numeroMayor)
                    numeroMayor = i;
            }
        }
        return numeroMayor;
    }
    
    public double obtenerNumeroMenor(){
        if(!numeros.isEmpty()){
            numeroMenor = numeros.get(0);
            for(double i : numeros){
                if(i < numeroMenor)
                    numeroMenor = i;
            }
        }
        return numeroMenor;
    }
    
    public double obtenerPromedio(){
        if(!numeros.isEmpty()){
            double suma = 0.0;
            for(double i : numeros){
                suma += i;
            }
            promedioNumeros = suma / numeros.size();
        }
        return promedioNumeros;
    }
}
