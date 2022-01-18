/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Barra;

/**
 *
 * @author Core i5 11va
 */
public class OrdenamientoBurbuja {
    
    private GestionarBarras controlarBarras;
    private Barra barra01;
    private Barra barra02;
    
    public OrdenamientoBurbuja(GestionarBarras barras) {
        this.controlarBarras = barras;
    }
    
    private void intercambiar(int j, int j_1) {
        
    }
    
    public void ordenar() {
        for (int i=this.controlarBarras.getBarras().size()-1; i>0; i--) {
            for (int j=0; j<i; j++) {
                this.barra01 = this.controlarBarras.getBarras().get(j);
                this.barra02 = this.controlarBarras.getBarras().get(j+1);
                
                if (this.barra01.getAlto() < this.barra02.getAlto()) {
                    intercambiar( j, j+1 );
                }
            }
        }
    }
}
