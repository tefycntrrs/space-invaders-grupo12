package vista;

import javax.swing.*;
import java.awt.*;
/*Clase que representa visualmente la imagen de la nave.
 Hereda de JLabel para poder mostrarse en un JPanel y manipular su posición.
 */
public class ImagenNave extends JLabel {

    private static final long serialVersionUID = 1L;
    // Dimensiones del JLabel que contendrá la imagen
    private int ancho;
    private int alto;

    public ImagenNave() {

        ancho = 50;
        alto = 50;

        // Carga la imagen desde los recursos del proyecto
        Image image = new ImageIcon(getClass().getResource("/nave.png")).getImage();

        // Escala la imagen para ajustarla al tamaño deseado
        Image imagenAEscala = image.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH);

        // Crea el icono escalado y lo asigna al JLabel
        ImageIcon icono = new ImageIcon(imagenAEscala);
        setIcon(icono);
    }

//Mueve la nave a las coordenadas (x, y) dentro del panel.
    public void mover(int x, int y) {
        setBounds(x, y, ancho, alto);
    }
}
