package modelo;

public class Monedero {
    private int creditos;

    public void cargar(int m) {
        if (m <= 0) throw new IllegalArgumentException("Monto invalido");
        creditos += m;
    }

    public boolean consumirUno() {
        if (creditos <= 0) return false;
        creditos -= 1;
        return true;
    }

    public int reintegrar() {
        int dev = creditos;
        creditos = 0;
        return dev;
    }

    public int getCreditos() { return creditos; }
    public void setCreditos(int creditos) { this.creditos = creditos; }
}
