package vista;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public abstract class MiPropioKeyAdapter implements KeyListener {
	
	@Override
	public abstract void keyTyped(KeyEvent e);

	@Override
	public abstract void keyPressed(KeyEvent e);

	@Override
	public abstract void keyReleased(KeyEvent e);


}
