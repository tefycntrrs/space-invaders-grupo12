package vista;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ImagenNave extends JLabel {
	
	private static final long serialVersionUID = 1L;
	private int ancho;
	private int alto;
	
	public ImagenNave() {
		
		ancho = 50;
		alto = 50;
		
		Image image = new ImageIcon("/nave.png").getImage();
		Image imagenAEscala = image.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH);
		ImageIcon icono = new ImageIcon(imagenAEscala);
		setIcon(icono);
	}
	
	public void mover(int x, int y) {
		setBounds(x,y,ancho,alto);
	}
}
