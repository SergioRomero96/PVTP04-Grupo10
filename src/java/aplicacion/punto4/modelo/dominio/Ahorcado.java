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
public class Ahorcado implements Serializable{
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

    public Ahorcado() {
        images = "ahorcado_0.jpg";
        intentos = 6;
        fallos = 0;
        contador = 0;
        palabra = elegirPalabra();
        palabraOculta = ocultarPalabra();
        letrasUsadas = new ArrayList<>();

    }

    public Ahorcado(String palabra, char letra, int intentos, int fallos, ArrayList<Character> letrasUsadas) {
        this.palabra = palabra;
        this.letra = letra;
        this.intentos = intentos;
        this.fallos = fallos;
        this.letrasUsadas = letrasUsadas;
    }

    public String elegirPalabra() {
        Random rnd = new Random();
        String[] palabras = {"ARGENTINA", "BOLIVIA", "CHILE", "PERU", "URUGUAY", "PARAGUAY", "COLOMBIA",
            "ECUADOR", "VENEZUELA", "BRASIL", "MEXICO"};
        int random = rnd.nextInt(palabras.length);
        return palabras[random];

    }

    public String ocultarPalabra() {
        palabraOculta = "";
        for (int i = 0; i < palabra.length(); i++) {
            palabraOculta = palabraOculta + "-";
        }
        return palabraOculta;
    }

    public void verificarLetra() {
        if (!letrasUsadas.contains(letra) && !estadoJuego) {
            letrasUsadas.add(letra);
            char[] tempCharArray = palabraOculta.toCharArray();
            for (int i = 0; i < palabra.length(); i++) {
                if (palabra.charAt(i) == letra) {
                    tempCharArray[i] = letra;
                    contador++;
                    setLetraEncontrada(true);
                }
            }
            if (isLetraEncontrada() == false) {
                intentos--;
                fallos++;
                images = (images.substring(0, 9) + fallos + ".jpg");

            }
            if (intentos > 0 && contador <= palabra.length() - 1) {
                letraEncontrada = false;
                palabraOculta = String.valueOf(tempCharArray);
            } else {
                if (intentos == 0 && fallos == 6) {
                    resultado = "  PERDISTE!!...";
                } else if (contador > palabra.length() - 1) {
                    resultado = "  GANASTE!!...";
                }
                palabraOculta = palabra;
                letrasUsadas = new ArrayList<>();
                estadoJuego = true;
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
