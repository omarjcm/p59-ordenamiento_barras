/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.Point;
import modelo.Barra;

/**
 *
 * @author Core i5 11va
 */
public class OrdenamientoBurbuja implements Runnable {
    
    private GestionarBarras controlarBarras;
    private Barra barra01;
    private Barra barra02;
    
    private int velocidad;
    
    public OrdenamientoBurbuja(GestionarBarras barras) {
        this.controlarBarras = barras;
        this.velocidad = 100;
    }
    
    private void intercambiar(int j, int j_1) {
        Point posicion_01 = new Point( (int)this.barra02.getPosicion().getX(), (int)this.barra01.getPosicion().getY() );
        Barra temporal = new Barra( posicion_01, this.barra01.getAncho(), 
                this.barra01.getAlto(), this.barra01.getColor() );
       
        Point posicion = new Point( (int)this.barra01.getPosicion().getX(), (int)this.barra02.getPosicion().getY() );
        this.barra01 = new Barra( posicion, this.barra02.getAncho(), 
                this.barra02.getAlto(), this.barra02.getColor() );
        
        Point posicion_02 = new Point( (int)temporal.getPosicion().getX(), (int)temporal.getPosicion().getY() );
        this.barra02 = new Barra( posicion_02, temporal.getAncho(),
                temporal.getAlto(), temporal.getColor());
        
        this.controlarBarras.getBarras().set(j, this.barra01);
        this.controlarBarras.getBarras().set(j_1, this.barra02);
    }
    
    @Override
    public void run() {
        for (int i=this.controlarBarras.getBarras().size()-1; i>0; i--) {
            for (int j=0; j<i; j++) {
                this.barra01 = this.controlarBarras.getBarras().get(j);
                this.barra02 = this.controlarBarras.getBarras().get(j+1);
                
                if (this.barra01.getAlto() > this.barra02.getAlto()) {
                    intercambiar( j, j+1 );
                    try {
                        Thread.sleep( this.velocidad );
                        this.controlarBarras.repaint();                        
                    } catch(InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        }
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    
    
}
