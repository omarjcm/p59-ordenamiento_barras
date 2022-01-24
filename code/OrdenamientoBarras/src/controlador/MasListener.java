/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Core i5 11va
 */
public class MasListener implements ActionListener {

    private GestionarBarras barras;
    
    public MasListener(GestionarBarras barras) {
        this.barras = barras;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.barras.aumentarVelocidad();
    }
    
}
