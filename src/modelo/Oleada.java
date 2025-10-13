package modelo;

import java.util.ArrayList;
import java.util.List;

public class Oleada {
    private List<Nave> naves = new ArrayList<>();
    private int dx = 1;

    public Oleada(int cantidad, int inicioX, int inicioY, int espacio) {
        for (int i = 0; i < cantidad; i++) {
            naves.add(new Nave(inicioX + i * espacio, inicioY));
        }
    }

    public void mover(int anchoArea) {
        for (Nave n : naves) {
            if (n.isViva()) n.setX(n.getX() + dx);
        }
        if (tocarBorde(anchoArea)) {
            bajar();
            dx = -dx;
        }
    }

    public boolean tocarBorde(int anchoArea) {
        for (Nave n : naves) {
            if (!n.isViva()) continue;
            if (n.getX() <= 0 || n.getX() >= anchoArea) return true;
        }
        return false;
    }

    public void bajar() {
        for (Nave n : naves) {
            if (n.isViva()) n.setY(n.getY() + 1);
        }
    }

    public boolean todasMuertas() {
        for (Nave n : naves) if (n.isViva()) return false;
        return true;
    }

    public List<Nave> getNaves() { return naves; }
    public void setNaves(List<Nave> naves) { this.naves = naves; }
    public int getDx() { return dx; }
    public void setDx(int dx) { this.dx = dx; }
}
