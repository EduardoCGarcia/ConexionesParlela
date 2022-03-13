 package nodos;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author EduardoCGarcia
 */
public class Nodo {
    private int x,y;
    public final int d = 15;

    public Nodo(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public void pintar(Graphics g){
        g.setColor(Color.BLACK);
        g.drawOval(this.x - d/2, this.y - d/2, d, d); //Nodo 0000
        
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    
    
    
}
