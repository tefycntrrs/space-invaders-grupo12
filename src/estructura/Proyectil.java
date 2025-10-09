package estructura;

public class Proyectil {
    private int x;
    private int y;
    private boolean delJugador;

    public Proyectil(int x, int y, boolean delJugador) {
        this.x = x;
        this.y = y;
        this.delJugador = delJugador;
    }

    public void actualizar() {
        if (delJugador) y -= 1; else y += 1;
    }

    public int getX() { return x; }
    public void setX(int x) { this.x = x; }
    public int getY() { return y; }
    public void setY(int y) { this.y = y; }
    public boolean isDelJugador() { return delJugador; }
    public void setDelJugador(boolean delJugador) { this.delJugador = delJugador; }
}
