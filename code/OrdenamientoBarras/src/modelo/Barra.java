/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.awt.Color;
import java.awt.Point;

/**
 *
 * @author Core i5 11va
 */
public class Barra {
    
    private int ancho;
    private int alto;
    private Point posicion;
    private Color color;
    
    public Barra(Point posicion, int ancho, int alto, Color color) {
        this.posicion = posicion;
        this.ancho = ancho;
        this.alto = alto;
        this.color = color;
    }
    
    public Barra(Barra barra) {
        this.posicion = barra.getPosicion();
        this.ancho = barra.getAncho();
        this.alto = barra.getAlto();
        this.color = barra.getColor();
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public Point getPosicion() {
        return posicion;
    }

    public void setPosicion(Point posicion) {
        this.posicion = posicion;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
    
}
