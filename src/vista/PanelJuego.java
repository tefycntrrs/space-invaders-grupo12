package vista;

import controlador.Controlador;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

/*Panel principal del juego donde se muestra la nave
 y se controlan los movimientos mediante el teclado.
 */

public class PanelJuego extends JPanel {

    private static final long serialVersionUID = 1L;
    private int ancho;
    private int alto;
    // Imagen de la nave mostrada en pantalla
    private ImagenNave imagenNave;
    private Controlador controlador;

    public PanelJuego() {

        this.alto = 600;
        this.ancho = 800;

        // Desactiva layout automático para usar coordenadas absolutas
        setLayout(null);
        setPreferredSize(new Dimension(ancho, alto));

        // Crea y agrega la imagen de la nave
        imagenNave = new ImagenNave();
        add(imagenNave);

        // Posiciona inicialmente la nave en el centro
        imagenNave.mover(400, 300);

        // Permite que el panel reciba eventos de teclado
        setFocusable(true);
        requestFocusInWindow();

        // Agrega el escuchador de teclas personalizado
        addKeyListener(new ManejoTecla());

        controlador = new Controlador();
    }

    /**
     * Clase interna que maneja las teclas presionadas por el usuario.
     asi lo hizo el profe en clase
     */
    class ManejoTecla extends MiPropioKeyAdapter {

        int x;

        @Override
        public void keyTyped(KeyEvent e) {
        }

        @Override
        public void keyPressed(KeyEvent e) {
            // Captura el código de la tecla presionada
            int key = e.getKeyCode();
            // Mueve la nave según la tecla
            if (key == KeyEvent.VK_LEFT) {
                // Acción para flecha izquierda
                x = controlador.moverNaveIzquierda();
            } else if (key == KeyEvent.VK_RIGHT) {
                // Acción para flecha derecha
                x = controlador.moverNaveDerecha();
            }
            // Actualiza la posición visual de la nave en el panel
            imagenNave.mover(x, 300);
        }

        @Override
        public void keyReleased(KeyEvent e) {
            // No se usa en este caso

        }

    }

}
