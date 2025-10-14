package controlador;

import modelo.AreaDeJuego;
import modelo.Nave;

public class Controlador {

    Nave nave;
    AreaDeJuego areaJuego;

    public Controlador() {
        areaJuego = new AreaDeJuego(600, 800);
        nave = new Nave(100, 400, 10, 50, 50, areaJuego);
    }

    public int moverNaveDerecha() {
        return nave.moverDerecha();
    }

    public int moverNaveIzquierda() {
        return nave.moverIzquierda();
    }
}
