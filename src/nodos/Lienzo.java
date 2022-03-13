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
    private ArrayList<Enlace> arrayEnlaces;
    private Point p1,p2;
    
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
        
        //nodo 0000
        p1 = new Point(arrayNodos.get(0).getX(), arrayNodos.get(0).getY());
        
        // Enlace 0000 ---> 0001
        p2 = new Point(arrayNodos.get(1).getX(), arrayNodos.get(1).getY());
        arrayEnlaces.add(new Enlace(p1.x, p1.y, p2.x, p2.y));
        // Enlace 0000 ---> 0010
        p2 = new Point(arrayNodos.get(2).getX(), arrayNodos.get(2).getY());
        arrayEnlaces.add(new Enlace(p1.x, p1.y, p2.x, p2.y));
        // Enlace 0000 ---> 0001
        p2 = new Point(arrayNodos.get(4).getX(), arrayNodos.get(4).getY());
        arrayEnlaces.add(new Enlace(p1.x, p1.y, p2.x, p2.y));
        
        //nodo 0001
        p1 = new Point(arrayNodos.get(1).getX(), arrayNodos.get(1).getY());
        
        // Enlace 0001 ---> 0000
        p2 = new Point(arrayNodos.get(0).getX(), arrayNodos.get(0).getY());
        arrayEnlaces.add(new Enlace(p1.x, p1.y, p2.x, p2.y));
        // Enlace 0001 ---> 0101
        p2 = new Point(arrayNodos.get(5).getX(), arrayNodos.get(5).getY());
        arrayEnlaces.add(new Enlace(p1.x, p1.y, p2.x, p2.y));
        // Enlace 0001 ---> 0011
        p2 = new Point(arrayNodos.get(3).getX(), arrayNodos.get(3).getY());
        arrayEnlaces.add(new Enlace(p1.x, p1.y, p2.x, p2.y));
        
        //nodo 0010
        p1 = new Point(arrayNodos.get(2).getX(), arrayNodos.get(2).getY());
        
        // Enlace 0010 ---> 0000
        p2 = new Point(arrayNodos.get(0).getX(), arrayNodos.get(0).getY());
        arrayEnlaces.add(new Enlace(p1.x, p1.y, p2.x, p2.y));
        // Enlace 0010 ---> 0110
        p2 = new Point(arrayNodos.get(6).getX(), arrayNodos.get(6).getY());
        arrayEnlaces.add(new Enlace(p1.x, p1.y, p2.x, p2.y));
        // Enlace 0010 ---> 0011
        p2 = new Point(arrayNodos.get(3).getX(), arrayNodos.get(3).getY());
        arrayEnlaces.add(new Enlace(p1.x, p1.y, p2.x, p2.y));
        
        //nodo 0011
        p1 = new Point(arrayNodos.get(3).getX(), arrayNodos.get(3).getY());
        
        // Enlace 0011 ---> 0001
        p2 = new Point(arrayNodos.get(1).getX(), arrayNodos.get(1).getY());
        arrayEnlaces.add(new Enlace(p1.x, p1.y, p2.x, p2.y));
        // Enlace 0011 ---> 0010
        p2 = new Point(arrayNodos.get(2).getX(), arrayNodos.get(2).getY());
        arrayEnlaces.add(new Enlace(p1.x, p1.y, p2.x, p2.y));
        // Enlace 0011 ---> 0111
        p2 = new Point(arrayNodos.get(7).getX(), arrayNodos.get(7).getY());
        arrayEnlaces.add(new Enlace(p1.x, p1.y, p2.x, p2.y));
        
        //nodo 0100
        p1 = new Point(arrayNodos.get(4).getX(), arrayNodos.get(4).getY());
        
        // Enlace 0100 ---> 0000
        p2 = new Point(arrayNodos.get(0).getX(), arrayNodos.get(0).getY());
        arrayEnlaces.add(new Enlace(p1.x, p1.y, p2.x, p2.y));
        // Enlace 0100 ---> 0101
        p2 = new Point(arrayNodos.get(5).getX(), arrayNodos.get(5).getY());
        arrayEnlaces.add(new Enlace(p1.x, p1.y, p2.x, p2.y));
        // Enlace 0100 ---> 0110
        p2 = new Point(arrayNodos.get(6).getX(), arrayNodos.get(6).getY());
        arrayEnlaces.add(new Enlace(p1.x, p1.y, p2.x, p2.y));
        
        //nodo 0101
        p1 = new Point(arrayNodos.get(5).getX(), arrayNodos.get(5).getY());
        
        // Enlace 0101 ---> 0001
        p2 = new Point(arrayNodos.get(1).getX(), arrayNodos.get(1).getY());
        arrayEnlaces.add(new Enlace(p1.x, p1.y, p2.x, p2.y));
        // Enlace 0101 ---> 0100
        p2 = new Point(arrayNodos.get(4).getX(), arrayNodos.get(4).getY());
        arrayEnlaces.add(new Enlace(p1.x, p1.y, p2.x, p2.y));
        // Enlace 0101 ---> 0111
        p2 = new Point(arrayNodos.get(7).getX(), arrayNodos.get(7).getY());
        arrayEnlaces.add(new Enlace(p1.x, p1.y, p2.x, p2.y));
        
        //nodo 0110
        p1 = new Point(arrayNodos.get(6).getX(), arrayNodos.get(6).getY());
        
        // Enlace 0110 ---> 0010
        p2 = new Point(arrayNodos.get(2).getX(), arrayNodos.get(2).getY());
        arrayEnlaces.add(new Enlace(p1.x, p1.y, p2.x, p2.y));
        // Enlace 0110 ---> 0111
        p2 = new Point(arrayNodos.get(7).getX(), arrayNodos.get(7).getY());
        arrayEnlaces.add(new Enlace(p1.x, p1.y, p2.x, p2.y));
        // Enlace 0110 ---> 0100
        p2 = new Point(arrayNodos.get(4).getX(), arrayNodos.get(4).getY());
        arrayEnlaces.add(new Enlace(p1.x, p1.y, p2.x, p2.y));
        
        //nodo 0111
        p1 = new Point(arrayNodos.get(7).getX(), arrayNodos.get(7).getY());
        
        // Enlace 0111 ---> 0101
        p2 = new Point(arrayNodos.get(6).getX(), arrayNodos.get(6).getY());
        arrayEnlaces.add(new Enlace(p1.x, p1.y, p2.x, p2.y));
        // Enlace 0111 ---> 0110
        p2 = new Point(arrayNodos.get(5).getX(), arrayNodos.get(5).getY());
        arrayEnlaces.add(new Enlace(p1.x, p1.y, p2.x, p2.y));
        // Enlace 0111 ---> 0011
        p2 = new Point(arrayNodos.get(3).getX(), arrayNodos.get(3).getY());
        arrayEnlaces.add(new Enlace(p1.x, p1.y, p2.x, p2.y));
        repaint();
        
        
        
    }
    
    
    
    
    
 
     
}
