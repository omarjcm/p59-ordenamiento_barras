/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.Color;
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
        generarBarrasAleatorias();
    }
    
    private void generarBarrasAleatorias() {
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
        for (int i=0; i<Constante.NUM_BARRAS; i++) {
            int y = 5;
            Point punto = new Point();
            //this.barras.add( new Barra() );
        }
    }
}
