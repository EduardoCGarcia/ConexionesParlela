 package nodos;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
 
/**
 *
 * @author EduardoCGarcia
 */
public class Nodo {
    private int x,y;
    private String nombre;
    public Graphics dibujo;
    private Color colorNodo;
    private int diametro;

    /*public Nodo(int x, int y, String nombre) {
        this.x = x;
        this.y = y;
        this.nombre = nombre;
    }*/

    public Nodo(int x, int y, String nombre, Color colorNodo, int diametro) {
        this.x = x;
        this.y = y;
        this.nombre = nombre;
        this.dibujo = dibujo;
        this.colorNodo = colorNodo;
        this.diametro = diametro;
    }

    
    
    
    public void pintar(Graphics g){
        g.setColor(colorNodo);
        g.fillOval(this.x - diametro/2, this.y - diametro/2, diametro, diametro); //Nodo 0000
        g.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 14));
        g.drawString(nombre, x-diametro/2, y-diametro/2);
        this.dibujo = g;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Graphics getDibujo() {
        return dibujo;
    }

    public void setDibujo(Graphics dibujo) {
        this.dibujo = dibujo;
    }


    
    
    
    
    
}
