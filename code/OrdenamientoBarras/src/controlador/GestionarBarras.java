/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.LinkedList;
import javax.swing.JPanel;
import modelo.Barra;

/**
 *
 * @author Core i5 11va
 */
public class GestionarBarras extends JPanel {
    
    private LinkedList<Barra> barras;
    private Color[] coloresBarras;
    private int[] altoBarras;
    private int[] anchoBarras;
    
    public GestionarBarras() {
        super();
        
        this.barras = new LinkedList<Barra>();
        this.generarBarrasAleatorias();
    }
    
    public void generarBarrasAleatorias() {
        generarColoresAleatorios();
        generarAltoBarrasAleatorios();
        cargarBarras();
    }
    
    private void generarColoresAleatorios() {
        // Asigne memoria al arreglo de colores, pero sin colores.
        this.coloresBarras = new Color[ Constante.NUM_BARRAS ];
        
        for (int i=0; i<Constante.NUM_BARRAS; i++) {
            int rojo = (int) (Math.random() * 255);
            int verde = (int) (Math.random() * 255);
            int azul = (int) (Math.random() * 255);
            
            this.coloresBarras[i] = new Color(rojo, verde, azul);
        }
    }
    
    private void generarAltoBarrasAleatorios() {
        this.altoBarras = new int[Constante.NUM_BARRAS];
        
        for (int i=0; i<Constante.NUM_BARRAS; i++) {
            this.altoBarras[i] = (int) (Math.random() * Constante.ALTO_BARRA + 10);
        }
    }
    
    private void cargarBarras() {
        this.barras = new LinkedList<Barra>();
        
        int anchoBarra = Constante.ANCHO / Constante.NUM_BARRAS;
        int x = 5;
        //int y = 60;
        for (int i=0; i<Constante.NUM_BARRAS; i++) {
            int y = 60 + Constante.ALTO_BARRA - this.altoBarras[i];
            Point posicion = new Point(x, y);
            this.barras.add( new Barra( posicion, anchoBarra, this.altoBarras[i], this.coloresBarras[i] ) );
            x = x + anchoBarra;
        }
    }
    
    public void cargarBarras(Graphics g) {
        for (Barra barra : this.barras) {
            g.fillRect(barra.getPosicion().x, barra.getPosicion().y, barra.getAncho(), barra.getAlto());
            g.setColor( barra.getColor() );
        }
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground( Color.LIGHT_GRAY );
        
        cargarBarras(g);
    }
}
