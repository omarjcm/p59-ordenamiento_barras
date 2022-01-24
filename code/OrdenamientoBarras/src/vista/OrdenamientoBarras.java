/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import controlador.Constante;
import controlador.GestionarBarras;
import controlador.IniciarListener;
import controlador.MasListener;
import controlador.MenosListener;
import controlador.OrdenarListener;
import controlador.PausarListener;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;
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
    
    private JButton masBtn;
    private JButton menosBtn;
    
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

        this.masBtn = new JButton("+");
        cons.gridx = 3;
        cons.gridy = 0;
        cons.gridwidth = 1;
        cons.gridheight = 1;
        cons.weightx = 0.1;
        this.getContentPane().add( this.masBtn, cons );
        
        this.menosBtn = new JButton("-");
        cons.gridx = 4;
        cons.gridy = 0;
        cons.gridwidth = 1;
        cons.gridheight = 1;
        cons.weightx = 0.1;
        this.getContentPane().add( this.menosBtn, cons );
        
        this.controlarBarras = new GestionarBarras();
        cons.gridx = 0;
        cons.gridy = 1;
        cons.gridwidth = 5;
        cons.gridheight = 4;
        cons.weightx = 1.0;
        cons.weighty = 1.0;
        cons.fill = GridBagConstraints.BOTH;
        cons.anchor = GridBagConstraints.CENTER;
        this.getContentPane().add(this.controlarBarras, cons);
        
        this.pack();
        
        ActionListener iniciarLstnr = new IniciarListener(this.controlarBarras);
        this.iniciarBtn.addActionListener( iniciarLstnr );
        
        ActionListener ordenarLstnr = new OrdenarListener(this.controlarBarras);
        this.ordenarBtn.addActionListener( ordenarLstnr );
        
        ActionListener pausarLstnr = new PausarListener(this.controlarBarras);
        this.pausarBtn.addActionListener( pausarLstnr );
        
        ActionListener masListener = new MasListener(this.controlarBarras);
        this.masBtn.addActionListener(masListener);
        
        ActionListener menosListener = new MenosListener(this.controlarBarras);
        this.menosBtn.addActionListener(menosListener);
        
        this.setSize( Constante.ANCHO, Constante.ALTO );
        this.addWindowListener( new VentanaMonitor() );
        this.setLocationRelativeTo(null);
        
        this.setVisible(true);
        this.setResizable(false);
    }
    
    
}
