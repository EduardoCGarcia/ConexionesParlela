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
        this.generaCubo();
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
    
    public void generaCubo(){
        this.arrayNodos.add(new Nodo(50,50));   //Nodo 0000
        this.arrayNodos.add(new Nodo(150,50));  //Nodo 0001
        this.arrayNodos.add(new Nodo(50,150));  //Nodo 0010
        this.arrayNodos.add(new Nodo(150,150)); //Nodo 0011
        
        this.arrayNodos.add(new Nodo(100,100)); //Nodo 0100
        this.arrayNodos.add(new Nodo(200,100)); //Nodo 0101
        this.arrayNodos.add(new Nodo(100,200)); //Nodo 0110
        this.arrayNodos.add(new Nodo(200,200)); //Nodo 0111
        repaint();
        
        Raiz nueva;
        // NODO 0000
        nueva = new Raiz(arrayNodos.get(0),arrayNodos.get(1),arrayNodos.get(2),arrayNodos.get(4));
        agregar(nueva);
        // NODO 0001
        nueva = new Raiz(arrayNodos.get(1),arrayNodos.get(0),arrayNodos.get(3),arrayNodos.get(5));
        agregar(nueva);
        // NODO 0010
        nueva = new Raiz(arrayNodos.get(2),arrayNodos.get(3),arrayNodos.get(0),arrayNodos.get(6));
        agregar(nueva);
        //NODO 0011
        nueva = new Raiz(arrayNodos.get(3),arrayNodos.get(2),arrayNodos.get(1),arrayNodos.get(7));
        agregar(nueva);
        // NODO 0100
        nueva = new Raiz(arrayNodos.get(4),arrayNodos.get(5),arrayNodos.get(6),arrayNodos.get(0));
        agregar(nueva);
        // NODO 0101
        nueva = new Raiz(arrayNodos.get(5),arrayNodos.get(4),arrayNodos.get(7),arrayNodos.get(1));
        agregar(nueva);
        // NODO 0110
        nueva = new Raiz(arrayNodos.get(6),arrayNodos.get(7),arrayNodos.get(4),arrayNodos.get(2));
        agregar(nueva);
        // NODO 0111
        nueva = new Raiz(arrayNodos.get(7),arrayNodos.get(6),arrayNodos.get(5),arrayNodos.get(3));
        agregar(nueva);

        
//        //nodo 0001
//        p1 = new Point(arrayNodos.get(1).getX(), arrayNodos.get(1).getY());
//        
//        // Enlace 0001 ---> 0000
//        p2 = new Point(arrayNodos.get(0).getX(), arrayNodos.get(0).getY());
//        arrayEnlaces.add(new Enlace(p1.x, p1.y, p2.x, p2.y));
//        // Enlace 0001 ---> 0101
//        p2 = new Point(arrayNodos.get(5).getX(), arrayNodos.get(5).getY());
//        arrayEnlaces.add(new Enlace(p1.x, p1.y, p2.x, p2.y));
//        // Enlace 0001 ---> 0011
//        p2 = new Point(arrayNodos.get(3).getX(), arrayNodos.get(3).getY());
//        arrayEnlaces.add(new Enlace(p1.x, p1.y, p2.x, p2.y));
//        
//        //nodo 0010
//        p1 = new Point(arrayNodos.get(2).getX(), arrayNodos.get(2).getY());
//        
//        // Enlace 0010 ---> 0000
//        p2 = new Point(arrayNodos.get(0).getX(), arrayNodos.get(0).getY());
//        arrayEnlaces.add(new Enlace(p1.x, p1.y, p2.x, p2.y));
//        // Enlace 0010 ---> 0110
//        p2 = new Point(arrayNodos.get(6).getX(), arrayNodos.get(6).getY());
//        arrayEnlaces.add(new Enlace(p1.x, p1.y, p2.x, p2.y));
//        // Enlace 0010 ---> 0011
//        p2 = new Point(arrayNodos.get(3).getX(), arrayNodos.get(3).getY());
//        arrayEnlaces.add(new Enlace(p1.x, p1.y, p2.x, p2.y));
//        
//        //nodo 0011
//        p1 = new Point(arrayNodos.get(3).getX(), arrayNodos.get(3).getY());
//        
//        // Enlace 0011 ---> 0001
//        p2 = new Point(arrayNodos.get(1).getX(), arrayNodos.get(1).getY());
//        arrayEnlaces.add(new Enlace(p1.x, p1.y, p2.x, p2.y));
//        // Enlace 0011 ---> 0010
//        p2 = new Point(arrayNodos.get(2).getX(), arrayNodos.get(2).getY());
//        arrayEnlaces.add(new Enlace(p1.x, p1.y, p2.x, p2.y));
//        // Enlace 0011 ---> 0111
//        p2 = new Point(arrayNodos.get(7).getX(), arrayNodos.get(7).getY());
//        arrayEnlaces.add(new Enlace(p1.x, p1.y, p2.x, p2.y));
//        
//        //nodo 0100
//        p1 = new Point(arrayNodos.get(4).getX(), arrayNodos.get(4).getY());
//        
//        // Enlace 0100 ---> 0000
//        p2 = new Point(arrayNodos.get(0).getX(), arrayNodos.get(0).getY());
//        arrayEnlaces.add(new Enlace(p1.x, p1.y, p2.x, p2.y));
//        // Enlace 0100 ---> 0101
//        p2 = new Point(arrayNodos.get(5).getX(), arrayNodos.get(5).getY());
//        arrayEnlaces.add(new Enlace(p1.x, p1.y, p2.x, p2.y));
//        // Enlace 0100 ---> 0110
//        p2 = new Point(arrayNodos.get(6).getX(), arrayNodos.get(6).getY());
//        arrayEnlaces.add(new Enlace(p1.x, p1.y, p2.x, p2.y));
//        
//        //nodo 0101
//        p1 = new Point(arrayNodos.get(5).getX(), arrayNodos.get(5).getY());
//        
//        // Enlace 0101 ---> 0001
//        p2 = new Point(arrayNodos.get(1).getX(), arrayNodos.get(1).getY());
//        arrayEnlaces.add(new Enlace(p1.x, p1.y, p2.x, p2.y));
//        // Enlace 0101 ---> 0100
//        p2 = new Point(arrayNodos.get(4).getX(), arrayNodos.get(4).getY());
//        arrayEnlaces.add(new Enlace(p1.x, p1.y, p2.x, p2.y));
//        // Enlace 0101 ---> 0111
//        p2 = new Point(arrayNodos.get(7).getX(), arrayNodos.get(7).getY());
//        arrayEnlaces.add(new Enlace(p1.x, p1.y, p2.x, p2.y));
//        
//        //nodo 0110
//        p1 = new Point(arrayNodos.get(6).getX(), arrayNodos.get(6).getY());
//        
//        // Enlace 0110 ---> 0010
//        p2 = new Point(arrayNodos.get(2).getX(), arrayNodos.get(2).getY());
//        arrayEnlaces.add(new Enlace(p1.x, p1.y, p2.x, p2.y));
//        // Enlace 0110 ---> 0111
//        p2 = new Point(arrayNodos.get(7).getX(), arrayNodos.get(7).getY());
//        arrayEnlaces.add(new Enlace(p1.x, p1.y, p2.x, p2.y));
//        // Enlace 0110 ---> 0100
//        p2 = new Point(arrayNodos.get(4).getX(), arrayNodos.get(4).getY());
//        arrayEnlaces.add(new Enlace(p1.x, p1.y, p2.x, p2.y));
//        
//        //nodo 0111
//        p1 = new Point(arrayNodos.get(7).getX(), arrayNodos.get(7).getY());
//        
//        // Enlace 0111 ---> 0101
//        p2 = new Point(arrayNodos.get(6).getX(), arrayNodos.get(6).getY());
//        arrayEnlaces.add(new Enlace(p1.x, p1.y, p2.x, p2.y));
//        // Enlace 0111 ---> 0110
//        p2 = new Point(arrayNodos.get(5).getX(), arrayNodos.get(5).getY());
//        arrayEnlaces.add(new Enlace(p1.x, p1.y, p2.x, p2.y));
//        // Enlace 0111 ---> 0011
//        p2 = new Point(arrayNodos.get(3).getX(), arrayNodos.get(3).getY());
//        arrayEnlaces.add(new Enlace(p1.x, p1.y, p2.x, p2.y));
        repaint();
        
    }
    
    public void agregar(Raiz raiz){
        arrayEnlaces.add(raiz.getHorizontal());
        arrayEnlaces.add(raiz.getVertical());
        arrayEnlaces.add(raiz.getDiagonal());
    }
     
}
