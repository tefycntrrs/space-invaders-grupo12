package modelo;

/**
 * Representa un muro de energía con una cantidad de resistencia (vida).
 * La clase se encarga de la lógica, pero no del dibujo en pantalla.
 */

public class MuroDeEnergia {

    private int resistencia = 100;
    private int coordenadaX;
    private int coordenadaY;
    private int ancho;
    private int alto;

    public MuroDeEnergia(int coordenadaX,int coordenadaY,int ancho,int alto) {
        this.resistencia = 100;
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
        this.ancho = ancho;
        this.alto = alto;
    }

    //Llamado cuando un disparo enemigo golpea el muro
    public void recibirDisparoEnemigo() {
        resistencia -= 5;
        if (resistencia < 0 )
            resistencia = 0;
    }

    //Llamado cuando un disparo nuestro lo atraviesa por error.
    public void recibirDisparoPropio() {
        resistencia -= 10;
        if (resistencia < 0)
            resistencia = 0;
    }

    public boolean estaDestruido() {
        return resistencia <= 0;
    }

    //getters

    public int getResistencia() {
        return resistencia;
    }

    public int getCoordenadaX() {
        return coordenadaX;
    }

    public int getCoordenadaY() {
        return coordenadaY;
    }

    public int getAncho() {
        return ancho;
    }

    public int getAlto() {
        return alto;
    }
}
