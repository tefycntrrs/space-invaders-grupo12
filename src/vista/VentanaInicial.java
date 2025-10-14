package vista;

import javax.swing.*;
import java.awt.*;
/**
 * Ventana principal del juego (menú inicial).
 * Contiene los botones para cargar créditos, iniciar el juego y ver el ranking.
 */

public class VentanaInicial extends JFrame {

    private static final long serialVersionUID = 1L;

    public VentanaInicial() {
        setTitle("Space Invaders - Grupo 12");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 1, 10, 10));

        JButton btnCargar = new JButton("Cargar Créditos");
        JButton btnIniciar = new JButton("Iniciar Juego");
        JButton btnRanking = new JButton("Ver Ranking");

        // Acción al presionar "Cargar Créditos"
        btnCargar.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Abrir ventana para cargar Créditos");
        });

        btnIniciar.addActionListener(e -> {
            VentanaJuego ventanaJuego = new VentanaJuego();
            ventanaJuego.setVisible(true);
        });

        btnRanking.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Mostrar ranking de jugadores");
        });

        add(btnCargar);
        add(btnIniciar);
        add(btnRanking);
    }


} 
