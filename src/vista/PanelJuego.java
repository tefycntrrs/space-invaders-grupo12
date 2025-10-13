package vista;

import java.awt.Dimension;
import java.awt.event.KeyEvent;

import javax.swing.JPanel;

import controlador.Controlador;

public class PanelJuego extends JPanel{
	
	private static final long serialVersionUID = 1L;
	private int ancho;
	private int alto;
	private ImagenNave imagenNave;
	private Controlador controlador;
	
	public PanelJuego() {
		
		this.alto = 600;
		this.ancho = 800;
		
		setLayout(null);
		setPreferredSize(new Dimension(ancho,alto));
		
		imagenNave = new ImagenNave();
		add(imagenNave);
		imagenNave.mover(400, 300);
		
		setFocusable(true);
		requestFocusInWindow();
		addKeyListener(new ManejoTecla());
		
		controlador = new Controlador();
	}
	
	class ManejoTecla extends MiPropioKeyAdapter{
		
		int x;

		@Override
		public void keyTyped(KeyEvent e) {
			//izquierda 44 y derecha 46
			/*if((int)e.getKeyChar() == 44)
				x = controlador.moverNaveIzquierda();
			else
				if((int)e.getKeyChar() == 46)
					x = controlador.moverNaveDerecha();
			imagenNave.mover(x,300);
			*/
		}

		@Override
		public void keyPressed(KeyEvent e) {
			int key = e.getKeyCode();
			if (key == KeyEvent.VK_LEFT) {
				// Acción para flecha izquierda
				x = controlador.moverNaveIzquierda();
			} else if (key == KeyEvent.VK_RIGHT) {
				// Acción para flecha derecha
				x = controlador.moverNaveDerecha();
			} 
			imagenNave.mover(x, 300);
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}

}
