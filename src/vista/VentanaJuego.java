package vista;

import javax.swing.JFrame;

public class VentanaJuego extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private PanelJuego panelJuego;
	
	public VentanaJuego() {
		
		panelJuego = new PanelJuego();
		setContentPane(panelJuego);
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}
