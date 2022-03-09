 package nodos;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author EduardoCGarcia
 */
public class Nodo {
    private int x,y;
    public static final int d = 30;

    public Nodo(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public void pintar(Graphics g){
        g.drawOval(this.x - d/2, this.y - d/2, d, d); //Nodo 0000
        
    }
}
