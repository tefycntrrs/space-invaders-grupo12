package vista;

import modelo.MuroDeEnergia;

import javax.swing.*;
import java.awt.*;

/**
 * Componente visual que representa el muro en pantalla.
 * Se sincroniza con el modelo MuroEnergia para mostrar su estado.
 */

public class ImagenMuroDeEnergia extends JLabel {

    private static final long serialVersionUID = 1L;

    private MuroDeEnergia muro;

    public ImagenMuroDeEnergia(MuroDeEnergia muro) {
        this.muro = muro;
        setBounds(muro.getCoordenadaX(),muro.getCoordenadaY(),muro.getAncho(),muro.getAlto());
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        int resistencia = muro.getResistencia();

        // Color cambia según la resistencia
        if (resistencia > 60) g2.setColor(Color.CYAN);
        else if (resistencia > 30) g2.setColor(Color.ORANGE);
        else g2.setColor(Color.RED);

        // Dibuja rectángulo principal del muro
        g2.fillRect(0, 0, muro.getAncho(), muro.getAlto());

        // Dibuja 2 troneras (huecos)
        g2.setColor(getBackground());
        int troneraWidth = muro.getAncho() / 5;
        int troneraHeight = muro.getAlto() / 3;
        g2.clearRect(muro.getAncho() / 4 - troneraWidth / 2, muro.getAlto() / 2 - troneraHeight / 2, troneraWidth, troneraHeight);
        g2.clearRect(3 * muro.getAncho() / 4 - troneraWidth / 2, muro.getAlto() / 2 - troneraHeight / 2, troneraWidth, troneraHeight);
    }

    public void actualizar() {
        repaint();
    }
}
