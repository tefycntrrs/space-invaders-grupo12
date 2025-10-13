package vista;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;


public class Main {
    public static void main(String[] args) {
    	SwingUtilities.invokeLater(() -> new VentanaJuego().setVisible(true));
    }
}