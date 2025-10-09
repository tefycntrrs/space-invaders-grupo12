package estructura;

public class Juego {
    private Monedero monedero = new Monedero();
    private Ranking ranking = new Ranking();
    private Partida partida;

    public void iniciarPartida() {
        if (!monedero.consumirUno()) throw new IllegalStateException("Sin creditos");
        this.partida = new Partida();
    }

    public void finalizarPartida() {
        if (partida == null) throw new IllegalStateException("No hay partida");
        this.partida = null;
    }

    public int devolverCreditos() {
        return monedero.getCreditos();
    }

    public Monedero getMonedero() { return monedero; }
    public void setMonedero(Monedero monedero) { this.monedero = monedero; }
    public Ranking getRanking() { return ranking; }
    public void setRanking(Ranking ranking) { this.ranking = ranking; }
    public Partida getPartida() { return partida; }
    public void setPartida(Partida partida) { this.partida = partida; }
}
