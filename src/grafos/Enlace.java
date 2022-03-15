/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grafos;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author EduardoCGarcia
 */
public class Enlace {
    private int x1, y1, x2, y2;
    private Color colorEnlace;
    private String id;

    public Enlace(int x1, int y1, int x2, int y2, Color colorEnlace, String id) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.colorEnlace = colorEnlace;
        this.id = id;
    }

    public void pintar(Graphics g){
        g.setColor(colorEnlace);
        g.drawLine(x1, y1, x2, y2);
        
    }
    
    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public Color getEnlaceColor() {
        return colorEnlace;
    }

    public void setEnlaceColor(Color colorEnlace) {
        this.colorEnlace = colorEnlace;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    
}
