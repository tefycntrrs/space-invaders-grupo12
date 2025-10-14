package vista;

import javax.swing.*;
/**
 * Ventana donde se desarrolla el juego.
 * Contiene el panel con la lógica visual (PanelJuego).
 */

public class VentanaJuego extends JFrame {

    private static final long serialVersionUID = 1L;
    private PanelJuego panelJuego;

    public VentanaJuego() {

        panelJuego = new PanelJuego(); // crea el panel principal del juego
        setContentPane(panelJuego); // lo asigna como contenido de la ventana
        pack(); // ajusta el tamaño según el panel
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}
