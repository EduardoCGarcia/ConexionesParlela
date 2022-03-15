package grafos;

import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author EduardoCGarcia
 */
public class Cubo {
    private ArrayList<Nodo> nodos;
    private ArrayList<Enlace> enlaces;

    public Cubo() {
    }

    public Cubo(ArrayList<Nodo> arrayNodos, ArrayList<Enlace> ArrayEnlaces) {
        this.nodos = arrayNodos;
        this.enlaces = ArrayEnlaces;
    }
    
    public void pintar(Graphics g){
        for (Nodo nodo : nodos) {
            nodo.pintar(g);
        }
        
        for (Enlace enlace : enlaces) {
            enlace.pintar(g);
            System.out.println(enlace.getId());
        }
    }

    public ArrayList<Nodo> getNodos() {
        return nodos;
    }

    public void setNodos(ArrayList<Nodo> nodos) {
        this.nodos = nodos;
    }

    public ArrayList<Enlace> getEnlaces() {
        return enlaces;
    }

    public void setEnlaces(ArrayList<Enlace> enlaces) {
        this.enlaces = enlaces;
    }
    
    
    
}
