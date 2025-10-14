package modelo;
//Esta clase define los límites del espacio en el que puede moverse la nave.

public class AreaDeJuego {

    private int alto;
    private int ancho;

    public AreaDeJuego(int alto, int ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }

    //no vamos a tener setters porque el tamaño nunca va a modificarse
    public int getAlto() {
        return alto;
    }

    public int getAncho() {
        return ancho;
    }
}
