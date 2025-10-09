package estructura;

import java.util.ArrayList;
import java.util.List;

public class Muro {
    private List<Segmento> segmentos = new ArrayList<>();
    private List<Segmento> troneras = new ArrayList<>();

    public Muro() { }

    public void agregarSegmento(Segmento s) {
        if (s == null) throw new IllegalArgumentException("Segmento nulo");
        segmentos.add(s);
    }

    public void agregarTronera(Segmento s) {
        if (s == null) throw new IllegalArgumentException("Tronera nula");
        troneras.add(s);
    }

    public void impactoEnemigo(int hit) {
        validarIndice(hit);
        segmentos.get(hit).danio(1);
    }

    public void impactoJugador(int hit, boolean pasoPorTronera) {
        if (pasoPorTronera) return;
        validarIndice(hit);
        segmentos.get(hit).danio(1);
    }

    public void reparar() {
        for (Segmento s : segmentos) s.reparar();
    }

    private void validarIndice(int idx) {
        if (idx < 0 || idx >= segmentos.size()) throw new IllegalStateException("Impacto fuera del muro");
    }

    public List<Segmento> getSegmentos() { return segmentos; }
    public void setSegmentos(List<Segmento> segmentos) { this.segmentos = segmentos; }
    public List<Segmento> getTroneras() { return troneras; }
    public void setTroneras(List<Segmento> troneras) { this.troneras = troneras; }
}
