package vista;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
/*Clase abstracta que implementa la interfaz KeyListener.
 Sirve como plantilla para manejar eventos del teclado sin tener que
 sobrescribir los tres métodos en cada clase que use KeyListener.
 */

public abstract class MiPropioKeyAdapter implements KeyListener {

    @Override
    public abstract void keyTyped(KeyEvent e);

    @Override
    public abstract void keyPressed(KeyEvent e);

    @Override
    public abstract void keyReleased(KeyEvent e);

}
