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
    private ArrayList<Raiz> enlacesFinales;
    ArrayList<Raiz> raices;

    public Cubo() {
    }

    public Cubo(ArrayList<Nodo> nodos, ArrayList<Enlace> enlaces, ArrayList<Raiz> raices, ArrayList<Raiz> enlacesFinales) {
        this.nodos = nodos;
        this.enlaces = enlaces;
        this.raices = raices;
        this.enlacesFinales = enlacesFinales;
    }

    
    
    public void pintar(Graphics g){
        for (Nodo nodo : nodos) {
            nodo.pintar(g);
        }
        
        for (Enlace enlace : enlaces) {
            enlace.pintar(g);
            //System.out.println(enlace.getId());
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

    public ArrayList<Raiz> getRaices() {
        return raices;
    }

    public void setRaices(ArrayList<Raiz> raices) {
        this.raices = raices;
    }

    public ArrayList<Raiz> getEnlacesFinales() {
        return enlacesFinales;
    }

    public void setEnlacesFinales(ArrayList<Raiz> enlacesFinales) {
        this.enlacesFinales = enlacesFinales;
    }
    
    
    
    
    
}
