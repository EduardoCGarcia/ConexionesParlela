package nodos;

import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author EduardoCGarcia
 */
public class Cubo {
    private ArrayList<Enlace> arrayEnlaces;
    private ArrayList<Nodo> arrayNodos;

    public Cubo(ArrayList<Enlace> arrayEnlaces, ArrayList<Nodo> arrayNodos) {
        this.arrayEnlaces = arrayEnlaces;
        this.arrayNodos = arrayNodos;
    }
    
    public void pintar(Graphics g){
        for (Nodo nodo : arrayNodos) {
            nodo.pintar(g);
        }
        for (Enlace enlace : arrayEnlaces) {
            enlace.pintar(g);
        }
    }
    
    
    
}
