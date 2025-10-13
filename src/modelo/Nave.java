package modelo;

public class Nave {
    private int coordenadaX;
    private int coordenadaY;
    private int velocidad;
    private int ancho;
    private int alto;
    private AreaDeJuego areaJuego;
    

    public Nave(int coordenadaX, int coordenadaY, int velocidad, int ancho, int alto, AreaDeJuego areaJuego) {
    	this.coordenadaX = coordenadaX;
    	this.coordenadaY = coordenadaY;
    	this.velocidad = velocidad;
    	this.ancho = ancho;
    	this.alto = alto;
    	this.areaJuego = areaJuego;
    	
    }
    
    public int moverIzquierda() {
    	if(this.coordenadaX - this.velocidad > 0)
    		this.coordenadaX -= this.velocidad;
    	return this.coordenadaX;
    	
    }
    
    public int moverDerecha() {
    	if(this.coordenadaX + this.velocidad + this.ancho <= areaJuego.getAncho())
    		this.coordenadaX += this.velocidad;
    	return this.coordenadaX;
    }
   
}
