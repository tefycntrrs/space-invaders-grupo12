package ui;

import controlador.Controlador;
import estructura.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class GUI extends JFrame {

	private final GamePanel gamePanel;

    public GUI() {
        super("Space Invader - Simple GUI");
        gamePanel = new GamePanel();

        setLayout(new BorderLayout());
        add(gamePanel, BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(900, 700));
        setLocationRelativeTo(null);
    }

    // ---------------- Panel de juego hiper simple ----------------
    private static class GamePanel extends JPanel {
        private final Controlador ctrl = new Controlador();
        private final Timer timer;
        private String hint = "ENTER: iniciar  |  ←/→: mover  |  ESPACIO: disparar  |  ESC: terminar";

        public GamePanel() {
            setBackground(Color.BLACK);

            // Key bindings simples
            bindKey("ENTER", "start", () -> {
                try {
                    if (ctrl.devolverCreditos() == 0) ctrl.cargarCreditos(1);
                    ctrl.iniciar();
                } catch (Exception e) {
                    hint = "Error: " + e.getMessage();
                }
            });

            bindKey("LEFT", "left", ctrl::moverIzq);
            bindKey("RIGHT", "right", ctrl::moverDer);
            bindKey("SPACE", "shoot", ctrl::disparar);
            bindKey("ESCAPE", "end", () -> {
                try {
                    ctrl.terminar();
                } catch (Exception e) {
                    hint = "Error: " + e.getMessage();
                }
            });

            // loop super simple
            timer = new Timer(30, e -> {
                Juego j = ctrl.getJuego();
                Partida p = j.getPartida();
                if (p != null) p.actualizar();
                repaint();
            });
            timer.start();
        }

        private void bindKey(String key, String name, Runnable action) {
            getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(key), name);
            getActionMap().put(name, new AbstractAction() {
                @Override public void actionPerformed(ActionEvent e) { action.run(); }
            });
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D) g;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            double sx = getWidth()  / (double) Partida.ANCHO;
            double sy = getHeight() / (double) Partida.ALTO;

            // Texto de ayuda
            g2.setColor(Color.WHITE);
            g2.drawString(hint, 12, 18);

            Juego j = ctrl.getJuego();
            Partida p = j.getPartida();
            if (p == null) {
                g2.drawString("Sin partida: presiona ENTER (se usa 1 crédito).", 12, 36);
                return;
            }

            // HUD muy simple
            g2.drawString("Nivel: " + p.getNivel() + "  Vidas: " + p.getVidas() + "  Puntos: " + p.getPuntos(), 12, 36);

            // Batería
            g2.setColor(Color.GREEN);
            int bx = (int) Math.round(p.getBateria().getX() * sx);
            int by = (int) Math.round((Partida.ALTO - 20) * sy);
            g2.fillRect(bx - 15, by, 30, 10);

            // Naves
            g2.setColor(Color.CYAN);
            for (Nave n : p.getOleada().getNaves()) {
                if (!n.isViva()) continue;
                int nx = (int) Math.round(n.getX() * sx);
                int ny = (int) Math.round(n.getY() * sy);
                g2.fillRect(nx - 10, ny - 8, 20, 16);
            }

            // Proyectiles
            g2.setColor(Color.YELLOW);
            for (Proyectil pr : p.getProyectiles()) {
                int px = (int) Math.round(pr.getX() * sx);
                int py = (int) Math.round(pr.getY() * sy);
                g2.fillRect(px - 2, py - 6, 4, 12);
            }

            // Muro (fila simple de segmentos)
            g2.setColor(new Color(150, 150, 150));
            Muro muro = p.getMuro();
            int count = muro.getSegmentos().size();
            if (count > 0) {
                int baseY = (int) Math.round((Partida.ALTO - 100) * sy);
                int margen = (int) Math.round(100 * sx);
                int anchoZona = getWidth() - 2 * margen;
                int paso = Math.max(1, anchoZona / (count + 1));
                for (int i = 0; i < count; i++) {
                    Segmento s = muro.getSegmentos().get(i);
                    int cx = margen + (i + 1) * paso;
                    int tam = Math.max(6, (int) Math.round(s.getTamano() * sx));
                    int altoSeg = Math.max(6, (int) Math.round(15 * sy));
                    if (s.roto()) {
                        g2.drawRect(cx - tam / 2, baseY - altoSeg / 2, tam, altoSeg);
                    } else {
                        g2.fillRect(cx - tam / 2, baseY - altoSeg / 2, tam, altoSeg);
                    }
                }
            }
        }
    }
}