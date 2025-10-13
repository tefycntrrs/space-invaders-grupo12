package modelo;

public class AreaDeJuego {

	private int alto;
	private int ancho;
	
	public AreaDeJuego(int alto,int ancho) {
		this.alto = alto;
		this.ancho = ancho;
	}

	//no vamos a tener setters porque esto nunca va a modificarse
	public int getAlto() {
		return alto;
	}


	public int getAncho() {
		return ancho;
	}
	
}
