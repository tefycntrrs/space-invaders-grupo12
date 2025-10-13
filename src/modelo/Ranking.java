package modelo;

import java.util.HashMap;
import java.util.Map;

public class Ranking {
    private Map<String, Integer> items = new HashMap<>();

    public void guardar(String nombre, int puntaje) {
        if (nombre == null || nombre.isEmpty()) throw new IllegalArgumentException("Nombre vacio");
        items.merge(nombre, puntaje, Math::max);
    }

    // Getters/Setters
    public Map<String, Integer> getItems() { return items; }
    public void setItems(Map<String, Integer> items) { this.items = items; }
}
