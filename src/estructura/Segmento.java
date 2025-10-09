package estructura;

public class Segmento {
    private int tamano;
    private int vida;
    private int vidaMax;

    public Segmento(int tamano, int vida) {
        if (tamano <= 0 || vida <= 0) throw new IllegalArgumentException("Segmento invalido");
        this.tamano = tamano;
        this.vida = vida;
        this.vidaMax = vida;
    }

    public int danio(int puntos) {
        if (puntos < 0) throw new IllegalArgumentException("Danio negativo");
        vida = Math.max(0, vida - puntos);
        return vida;
    }

    public boolean roto() {
        return vida <= 0;
    }

    public void reparar() {
        this.vida = this.vidaMax;
    }

    // Getters y setters
    public int getTamano() { return tamano; }
    public void setTamano(int tamano) { this.tamano = tamano; }
    public int getVida() { return vida; }
    public void setVida(int vida) { this.vida = vida; }
    public int getVidaMax() { return vidaMax; }
    public void setVidaMax(int vidaMax) { this.vidaMax = vidaMax; }
}
