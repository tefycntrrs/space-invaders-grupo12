package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VentanaInicial extends JFrame {
	
	public VentanaInicial() {
		setTitle("Space Invaders - Grupo 12");
		setSize(400,300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridLayout (3,1,10,10));
		
		JButton btnCargar = new JButton("Cargar Créditos");
		JButton btnIniciar = new JButton("Iniciar Juego");
		JButton btnRanking = new JButton("Ver Ranking");
		
		btnCargar.addActionListener(e -> {
			JOptionPane.showMessageDialog(this,"Abrir ventana para cargar Créditos");
		});
		
		btnIniciar.addActionListener(e -> {
	            JOptionPane.showMessageDialog(this, "Iniciar partida (validar créditos)");
	    });

	    btnRanking.addActionListener(e -> {
	            JOptionPane.showMessageDialog(this, "Mostrar ranking de jugadores");
	    });
	    
	    add(btnCargar);
	    add(btnIniciar);
	    add(btnRanking);
	}
	
	
} 
