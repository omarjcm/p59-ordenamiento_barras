/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import controlador.Constante;
import controlador.GestionarBarras;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Core i5 11va
 */
public class OrdenamientoBarras extends JFrame {
    
    private GestionarBarras controlarBarras;
    
    private JButton iniciarBtn;
    private JButton ordenarBtn;
    private JButton pausarBtn;
    
    public OrdenamientoBarras() {
        super();
        this.setTitle("Ordenamiento de Barras");
        
        GridBagLayout gb = new GridBagLayout();
        this.setLayout(gb);
        
        GridBagConstraints cons = new GridBagConstraints();
        
        this.iniciarBtn = new JButton("Iniciar");
        cons.gridx = 0;
        cons.gridy = 0;
        cons.gridwidth = 1;
        cons.gridheight = 1;
        cons.weightx = 1.0;
        this.getContentPane().add( this.iniciarBtn, cons );
        
        this.ordenarBtn = new JButton("Ordenar");
        cons.gridx = 1;
        cons.gridy = 0;
        cons.gridwidth = 1;
        cons.gridheight = 1;
        cons.weightx = 1.0;
        this.getContentPane().add( this.ordenarBtn, cons );
        
        this.pausarBtn = new JButton("Pausar");
        cons.gridx = 2;
        cons.gridy = 0;
        cons.gridwidth = 1;
        cons.gridheight = 1;
        cons.weightx = 1.0;
        this.getContentPane().add( this.pausarBtn, cons );
        
        this.controlarBarras = new GestionarBarras();
        cons.gridx = 0;
        cons.gridy = 1;
        cons.gridwidth = 3;
        cons.gridheight = 3;
        cons.weightx = 1.0;
        cons.weighty = 1.0;
        cons.fill = GridBagConstraints.BOTH;
        cons.anchor = GridBagConstraints.CENTER;
        this.getContentPane().add(this.controlarBarras, cons);
        
        this.pack();
        
        this.setSize( Constante.ANCHO, Constante.ALTO );
        this.addWindowListener( new VentanaMonitor() );
        this.setLocationRelativeTo(null);
        
        this.setVisible(true);
        this.setResizable(false);
    }
    
    
}
