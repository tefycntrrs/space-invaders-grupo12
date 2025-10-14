package modelo;
/*Clase que representa la nave del jugador.
 Contiene su posición, tamaño, velocidad y el área donde puede moverse. */

public class Nave {
    private int coordenadaX;
    private int coordenadaY;
    private int velocidad;
    // Tamaño de la nave
    private int ancho;
    private int alto;
    // Referencia al área de juego para validar límites
    private AreaDeJuego areaJuego;


    public Nave(int coordenadaX, int coordenadaY, int velocidad, int ancho, int alto, AreaDeJuego areaJuego) {
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
        this.velocidad = velocidad;
        this.ancho = ancho;
        this.alto = alto;
        this.areaJuego = areaJuego;

    }
//moverizquierda y derecha Mueve la nave hacia la izquierda dentro de los límites del área de juego.
    public int moverIzquierda() {
        if (this.coordenadaX - this.velocidad > 0)
            this.coordenadaX -= this.velocidad;
        return this.coordenadaX;

    }

    public int moverDerecha() {
        if (this.coordenadaX + this.velocidad + this.ancho <= areaJuego.getAncho())
            this.coordenadaX += this.velocidad;
        return this.coordenadaX;
    }

}
