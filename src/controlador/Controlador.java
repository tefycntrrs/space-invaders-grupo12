package controlador;

import estructura.*;

public class Controlador {
    private Juego juego = new Juego();

    public void cargarCreditos(int m) { juego.getMonedero().cargar(m); }

    public void iniciar() { juego.iniciarPartida(); }

    public void moverIzq() {
        Partida p = juego.getPartida();
        if (p != null) p.moverBateriaIzq();
    }

    public void moverDer() {
        Partida p = juego.getPartida();
        if (p != null) p.moverBateriaDer();
    }

    public void disparar() {
        Partida p = juego.getPartida();
        if (p != null) p.disparar();
    }

    public void pausar() {
        Partida p = juego.getPartida();
        if (p != null) p.setEnPausa(true);
    }

    public void reanudar() {
        Partida p = juego.getPartida();
        if (p != null) p.setEnPausa(false);
    }

    public void terminar() { juego.finalizarPartida(); }

    public String estado() {
        Partida p = juego.getPartida();
        if (p == null) return "Sin partida. Creditos: " + juego.devolverCreditos();
        return "Nivel " + p.getNivel() + " | Vidas " + p.getVidas() + " | Puntos " + p.getPuntos();
    }

    public void guardarEnRanking(String nombre) {
        Partida p = juego.getPartida();
        if (p == null) throw new IllegalStateException("No hay partida para guardar");
        juego.getRanking().guardar(nombre, p.getPuntos());
    }

    public int devolverCreditos() { return juego.devolverCreditos(); }

    public Juego getJuego() { return juego; }
}
