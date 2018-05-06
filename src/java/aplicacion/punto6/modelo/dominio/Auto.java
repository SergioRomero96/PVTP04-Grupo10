/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.punto6.modelo.dominio;

import java.io.Serializable;

/**
 *
 * @author Sergio Romero
 */
public class Auto implements Serializable {

    private String patente;
    private String marca;
    private int modelo;
    private String color;
    private String combustible;

    /**
     * Constructor por defecto
     */
    public Auto() {
    }

    /**
     * Constructor con parametros
     * @param patente
     * @param marca
     * @param modelo
     * @param color
     * @param combustible
     */
    public Auto(String patente, String marca, int modelo, String color, String combustible) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.combustible = combustible;
    }

    /**
     * @return the patente
     */
    public String getPatente() {
        return patente;
    }

    /**
     * @param patente the patente to set
     */
    public void setPatente(String patente) {
        this.patente = patente;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public int getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the combustible
     */
    public String getCombustible() {
        return combustible;
    }

    /**
     * @param combustible the combustible to set
     */
    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }
}
