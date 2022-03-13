package nodos;

import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author EduardoCGarcia
 */
public class Lienzo extends JPanel{
    private ArrayList<Nodo> arrayNodos;
    public static ArrayList<Enlace> arrayEnlaces;
    private ArrayList<Raiz> arrayRaices;
    
    public Lienzo(){
        this.arrayNodos = new ArrayList<Nodo>();
        this.arrayEnlaces = new ArrayList<Enlace>();
        this.crearCubos();
    }
    
    @Override
    public void paint(Graphics g){
        for (Nodo nodo : arrayNodos) {
            nodo.pintar(g);
        }
        for (Enlace enlace : arrayEnlaces) {
            enlace.pintar(g);
        }
    }
    
    public void crearCubos(){
        generarCubo(50, 50);
        generaEnlacesCubo1();
        
        
        generarCubo(500, 50);
        generaEnlacesCubo2();
    }
    
    public void agregar(Raiz raiz){
        arrayEnlaces.add(raiz.getHorizontal());
        arrayEnlaces.add(raiz.getVertical());
        arrayEnlaces.add(raiz.getDiagonal());
    }
    
    public void generarCubo(int x1, int y1){
        int x2 = x1 + 100;
        int y2 = y1 + 100;
        this.arrayNodos.add(new Nodo(x1, y1));   //Nodo 0000
        this.arrayNodos.add(new Nodo(x2, y1));  //Nodo 0001
        this.arrayNodos.add(new Nodo(x1, y2));  //Nodo 0010
        this.arrayNodos.add(new Nodo(x2, y2)); //Nodo 0011
        x1 += 50;
        y1 += 50;
        x2 = x1 + 100;
        y2 = y1 + 100;
        this.arrayNodos.add(new Nodo(x1, y1)); //Nodo 0100
        this.arrayNodos.add(new Nodo(x2, y1)); //Nodo 0101
        this.arrayNodos.add(new Nodo(x1, y2)); //Nodo 0110
        this.arrayNodos.add(new Nodo(x2, y2)); //Nodo 0111
        repaint();
    }
    
    public void generaEnlacesCubo1(){
        Raiz nueva;
        nueva = new Raiz(arrayNodos.get(0),arrayNodos.get(1),arrayNodos.get(2),arrayNodos.get(4));
        agregar(nueva);
        nueva = new Raiz(arrayNodos.get(1),arrayNodos.get(0),arrayNodos.get(3),arrayNodos.get(5));
        agregar(nueva);
        nueva = new Raiz(arrayNodos.get(2),arrayNodos.get(3),arrayNodos.get(0),arrayNodos.get(6));
        agregar(nueva);
        nueva = new Raiz(arrayNodos.get(3),arrayNodos.get(2),arrayNodos.get(1),arrayNodos.get(7));
        agregar(nueva);
        nueva = new Raiz(arrayNodos.get(4),arrayNodos.get(5),arrayNodos.get(6),arrayNodos.get(0));
        agregar(nueva);
        nueva = new Raiz(arrayNodos.get(5),arrayNodos.get(4),arrayNodos.get(7),arrayNodos.get(1));
        agregar(nueva);
        nueva = new Raiz(arrayNodos.get(6),arrayNodos.get(7),arrayNodos.get(4),arrayNodos.get(2));
        agregar(nueva);
        nueva = new Raiz(arrayNodos.get(7),arrayNodos.get(6),arrayNodos.get(5),arrayNodos.get(3));
        agregar(nueva);
        repaint();
    }
    
    public void generaEnlacesCubo2(){
        Raiz nueva;
        nueva = new Raiz(arrayNodos.get(8),arrayNodos.get(9),arrayNodos.get(10),arrayNodos.get(12));
        agregar(nueva);
        nueva = new Raiz(arrayNodos.get(9),arrayNodos.get(8),arrayNodos.get(11),arrayNodos.get(13));
        agregar(nueva);
        nueva = new Raiz(arrayNodos.get(10),arrayNodos.get(11),arrayNodos.get(8),arrayNodos.get(14));
        agregar(nueva);
        nueva = new Raiz(arrayNodos.get(11),arrayNodos.get(10),arrayNodos.get(9),arrayNodos.get(15));
        agregar(nueva);
        nueva = new Raiz(arrayNodos.get(12),arrayNodos.get(13),arrayNodos.get(14),arrayNodos.get(8));
        agregar(nueva);
        nueva = new Raiz(arrayNodos.get(13),arrayNodos.get(12),arrayNodos.get(15),arrayNodos.get(9));
        agregar(nueva);
        nueva = new Raiz(arrayNodos.get(14),arrayNodos.get(15),arrayNodos.get(12),arrayNodos.get(10));
        agregar(nueva);
        nueva = new Raiz(arrayNodos.get(15),arrayNodos.get(14),arrayNodos.get(13),arrayNodos.get(11));
        agregar(nueva);
        repaint();
    }
}
