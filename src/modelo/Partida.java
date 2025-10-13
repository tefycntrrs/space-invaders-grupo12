package modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Partida {
	/*
    public static int ANCHO = 800;
    public static int ALTO = 600;

    private int nivel = 1;
    private String dificultad = "Normal";
    private int puntos = 0;
    private int vidas = 3;
    private Bateria bateria;
    private Oleada oleada;
    private Muro muro;
    private int velocidad = 1;
    private boolean enPausa = false;

    private List<Proyectil> proyectiles = new ArrayList<>();

    public Partida() {
        this.bateria = new Bateria(ANCHO / 2);
        this.muro = crearMuroBasico();
        this.oleada = crearOleadaBasica();
    }

    private Muro crearMuroBasico() {
        Muro m = new Muro();
        for (int i = 0; i < 10; i++) m.agregarSegmento(new Segmento(5, 3));
        for (int i = 0; i < 2; i++) m.agregarTronera(new Segmento(5, 0));
        return m;
    }

    private Oleada crearOleadaBasica() {
        return new Oleada(15, 10, 10, 4);
    }

    public void actualizar() {
        if (enPausa) return;

        oleada.mover(ANCHO);

        for (Proyectil p : proyectiles) p.actualizar();

        for (Proyectil p : proyectiles) {
            if (!p.isDelJugador()) continue;
            for (Nave n : oleada.getNaves()) {
                if (n.isViva() && Math.abs(p.getX() - n.getX()) <= 1 && Math.abs(p.getY() - n.getY()) <= 1) {
                    n.destruir();
                    puntos += 10;
                }
            }
        }

        Iterator<Proyectil> it = proyectiles.iterator();
        while (it.hasNext()) {
            Proyectil p = it.next();
            if (p.getY() < 0 || p.getY() > ALTO) it.remove();
        }

        if (oleada.todasMuertas()) subirDeNivel();
    }

    public void subirDeNivel() {
        nivel += 1;
        velocidad += 1;
        oleada = crearOleadaBasica();
    }

    public void moverBateriaIzq() {
        bateria.moverIzq();
    }

    public void moverBateriaDer() {
        bateria.moverDer(ANCHO);
    }

    public void disparar() {
        proyectiles.add(bateria.disparar());
    }

    public int getNivel() { return nivel; }
    public void setNivel(int nivel) { this.nivel = nivel; }
    public String getDificultad() { return dificultad; }
    public void setDificultad(String dificultad) { this.dificultad = dificultad; }
    public int getPuntos() { return puntos; }
    public void setPuntos(int puntos) { this.puntos = puntos; }
    public int getVidas() { return vidas; }
    public void setVidas(int vidas) { this.vidas = vidas; }
    public Bateria getBateria() { return bateria; }
    public void setBateria(Bateria bateria) { this.bateria = bateria; }
    public Oleada getOleada() { return oleada; }
    public void setOleada(Oleada oleada) { this.oleada = oleada; }
    public Muro getMuro() { return muro; }
    public void setMuro(Muro muro) { this.muro = muro; }
    public int getVelocidad() { return velocidad; }
    public void setVelocidad(int velocidad) { this.velocidad = velocidad; }
    public boolean isEnPausa() { return enPausa; }
    public void setEnPausa(boolean enPausa) { this.enPausa = enPausa; }
    public List<Proyectil> getProyectiles() { return proyectiles; }
    public void setProyectiles(List<Proyectil> proyectiles) { this.proyectiles = proyectiles; }
    */
}
