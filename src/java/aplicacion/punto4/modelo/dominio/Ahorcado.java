/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.punto4.modelo.dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Sergio Romero
 */
public class Ahorcado implements Serializable {

    private String palabra;
    private char letra;
    private int intentos;
    private int fallos;
    private boolean letraEncontrada;
    private ArrayList<Character> letrasUsadas;
    private String palabraOculta;
    private int contador;
    private String resultado;
    private String images;
    private boolean estadoJuego;

    /**
     * Constructor por defecto
     */
    public Ahorcado() {
        images = "ahorcado_0.jpg";
        intentos = 6;
        fallos = 0;
        contador = 0;
        palabra = elegirPalabra();
        palabraOculta = ocultarPalabra();
        letrasUsadas = new ArrayList<>();

    }

    /**
     * Constructor con parametro
     *
     * @param palabra
     * @param letra
     * @param intentos
     * @param fallos
     * @param letrasUsadas
     */
    public Ahorcado(String palabra, char letra, int intentos, int fallos, ArrayList<Character> letrasUsadas) {
        this.palabra = palabra;
        this.letra = letra;
        this.intentos = intentos;
        this.fallos = fallos;
        this.letrasUsadas = letrasUsadas;
    }

    /**
     * Metodo que devuelve una palabra aleatoria de una lista
     * @return la palabra seleccionada
     */
    public String elegirPalabra() {
        Random rnd = new Random();
        String[] palabras = {"ARGENTINA", "BOLIVIA", "CHILE", "PERU", "URUGUAY", "PARAGUAY", "COLOMBIA",
            "ECUADOR", "VENEZUELA", "BRASIL", "MEXICO"};
        int random = rnd.nextInt(palabras.length);
        return palabras[random];

    }

    /**
     * Metodo para ocultar la palabra elegida
     * @return la palabra oculta
     */
    public String ocultarPalabra() {
        palabraOculta = "";
        for (int i = 0; i < palabra.length(); i++) {
            palabraOculta = palabraOculta + "-";
        }
        return palabraOculta;
    }

    /**
     * Metodo para verificar si la letra ingresada pertenece o no a la palabra
     */
    public void verificarLetra() {
        letra = String.valueOf(letra).toUpperCase().charAt(0);//convierte la letra Minus a Mayus
        if (!letrasUsadas.contains(letra) && !estadoJuego) {//verifica si la letra ya fue ingresada y si sigue jugando
            letrasUsadas.add(letra);//agrega la letra a una lista de letras usadas
            char[] tempCharArray = palabraOculta.toCharArray();//convierte la palabra oculta en un arreglo de caracteres
            for (int i = 0; i < palabra.length(); i++) {
                if (palabra.charAt(i) == letra) {//compara la letra con cada caracter
                    tempCharArray[i] = letra;//lo reemplaza cuando encontro coincidencia
                    contador++;//contador para saber cantidad de letras acertadas
                    setLetraEncontrada(true);//es V porque encontro la letra
                }
            }
            if (isLetraEncontrada() == false) {//si es F entonces
                intentos--;//resta los intentos
                fallos++;//se incrementa los fallos
                images = (images.substring(0, 9) + fallos + ".jpg");//muestra el siguiente dibujo
            }
            if (intentos > 0 && contador <= palabra.length() - 1) {//si intento es mayor q 0 y si no se completo la palabra
                letraEncontrada = false;//se cambia el estado de letraEncontrada
                palabraOculta = String.valueOf(tempCharArray);//se convierte el String el array de Caracteres
            } else {
                if (intentos == 0 && fallos == 6) {//sino si el intento es igual a 0 o fallos es igual a 6
                    resultado = "  PERDISTE!!...";//entonces perdio el juego
                } else if (contador > palabra.length() - 1) {//caso contrario si completo las letras de la palabra
                    resultado = "  GANASTE!!...";//gano el juego
                }
                palabraOculta = palabra;//se muestra la palabra oculta
                letrasUsadas = new ArrayList<>();//se reinicia la lista de letras usadas
                estadoJuego = true;//V si gano el juego
            }
        }
    }

    /**
     * @return the palabra
     */
    public String getPalabra() {
        return palabra;
    }

    /**
     * @param palabra the palabra to set
     */
    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    /**
     * @return the letra
     */
    public char getLetra() {
        return letra;
    }

    /**
     * @param letra the letra to set
     */
    public void setLetra(char letra) {
        this.letra = letra;
    }

    /**
     * @return the intentos
     */
    public int getIntentos() {
        return intentos;
    }

    /**
     * @param intentos the intentos to set
     */
    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    /**
     * @return the fallos
     */
    public int getFallos() {
        return fallos;
    }

    /**
     * @param fallos the fallos to set
     */
    public void setFallos(int fallos) {
        this.fallos = fallos;
    }

    /**
     * @return the letrasUsadas
     */
    public ArrayList<Character> getLetrasUsadas() {
        return letrasUsadas;
    }

    /**
     * @param letrasUsadas the letrasUsadas to set
     */
    public void setLetrasUsadas(ArrayList<Character> letrasUsadas) {
        this.letrasUsadas = letrasUsadas;
    }

    /**
     * @return the palabraOculta
     */
    public String getPalabraOculta() {
        return palabraOculta;
    }

    /**
     * @param palabraOculta the palabraOculta to set
     */
    public void setPalabraOculta(String palabraOculta) {
        this.palabraOculta = palabraOculta;
    }

    /**
     * @return the letraEncontrada
     */
    public boolean isLetraEncontrada() {
        return letraEncontrada;
    }

    /**
     * @param letraEncontrada the letraEncontrada to set
     */
    public void setLetraEncontrada(boolean letraEncontrada) {
        this.letraEncontrada = letraEncontrada;
    }

    /**
     * @return the contador
     */
    public int getContador() {
        return contador;
    }

    /**
     * @param contador the contador to set
     */
    public void setContador(int contador) {
        this.contador = contador;
    }

    /**
     * @return the resultado
     */
    public String getResultado() {
        return resultado;
    }

    /**
     * @param resultado the resultado to set
     */
    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    /**
     * @return the images
     */
    public String getImages() {
        return images;
    }

    /**
     * @param images the images to set
     */
    public void setImages(String images) {
        this.images = images;
    }

    /**
     * @return the estadoJuego
     */
    public boolean isEstadoJuego() {
        return estadoJuego;
    }

    /**
     * @param estadoJuego the estadoJuego to set
     */
    public void setEstadoJuego(boolean estadoJuego) {
        this.estadoJuego = estadoJuego;
    }

}
