package app;

import grafos.Cubo;
import grafos.Enlace;
import grafos.Nodo;
import grafos.Raiz;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author EduardoCGarcia
 */
public class Lienzo extends JPanel{
    private ArrayList<Nodo> arrayNodos;
    private ArrayList<Enlace> arrayEnlaces;
    public static ArrayList<Cubo> arrayCubos;
    public static Cubo c;
    public Lienzo() {
        this.arrayNodos = new ArrayList<Nodo>();
        this.arrayCubos = new ArrayList<Cubo>();
        this.arrayEnlaces = new ArrayList<Enlace>();
        
        crearNombres();
        System.out.println(arrayEnlaces.size());
        System.out.println(arrayNodos.size());
        c = new Cubo(arrayNodos,arrayEnlaces);
    }
    
    
    @Override
    public void paint(Graphics g){
        arrayCubos.add(c);
        for (Cubo cubo : arrayCubos) {
            cubo.pintar(g);
        }
        
    }
    
    public void crearNombres(){
        ArrayList<String> nombres = new ArrayList<String>();
        nombres.add("0000");nombres.add("0001");nombres.add("0010");
        nombres.add("0011");nombres.add("0100");nombres.add("0101");
        nombres.add("0110");nombres.add("0111");
        generarNodos(75, 75, nombres,Color.GREEN);
        generaEnlacesCubo1(arrayNodos);
        
        nombres.clear();
        nombres.add("1000");nombres.add("1001");nombres.add("1010");
        nombres.add("1011");nombres.add("1100");nombres.add("1101");
        nombres.add("1110");nombres.add("1111");
        generarNodos(375, 375, nombres,Color.GREEN);
    }
    
    public void generarNodos(int x1, int y1, ArrayList<String> noms, Color c){
        int x2 = x1 + 100;
        int y2 = y1 + 100;
        arrayNodos.add(new Nodo(x1, y1, noms.get(0),c,30));   //Nodo 0000
        arrayNodos.add(new Nodo(x2, y1, noms.get(1),c,30));  //Nodo 0001
        arrayNodos.add(new Nodo(x1, y2, noms.get(2),c,30));  //Nodo 0010
        arrayNodos.add(new Nodo(x2, y2, noms.get(3),c,30)); //Nodo 0011
        x1 += 50;
        y1 += 50;
        x2 = x1 + 100;
        y2 = y1 + 100;
        arrayNodos.add(new Nodo(x1, y1, noms.get(4),c,30)); //Nodo 0100
        arrayNodos.add(new Nodo(x2, y1, noms.get(5),c,30)); //Nodo 0101
        arrayNodos.add(new Nodo(x1, y2, noms.get(6),c,30)); //Nodo 0110
        arrayNodos.add(new Nodo(x2, y2, noms.get(7),c,30)); //Nodo 0111
        repaint();
    }
    
    public void generaEnlacesCubo1(ArrayList<Nodo> arrayNodos){
        Raiz nueva;
        nueva = new Raiz(arrayNodos.get(0),arrayNodos.get(1),arrayNodos.get(2),arrayNodos.get(4), Color.BLUE);
        agregar(nueva);
        nueva = new Raiz(arrayNodos.get(1),arrayNodos.get(0),arrayNodos.get(3),arrayNodos.get(5), Color.BLUE);
        agregar(nueva);
        nueva = new Raiz(arrayNodos.get(2),arrayNodos.get(3),arrayNodos.get(0),arrayNodos.get(6), Color.BLUE);
        agregar(nueva);
        nueva = new Raiz(arrayNodos.get(3),arrayNodos.get(2),arrayNodos.get(1),arrayNodos.get(7), Color.BLUE);
        agregar(nueva);
        nueva = new Raiz(arrayNodos.get(4),arrayNodos.get(5),arrayNodos.get(6),arrayNodos.get(0), Color.BLUE);
        agregar(nueva);
        nueva = new Raiz(arrayNodos.get(5),arrayNodos.get(4),arrayNodos.get(7),arrayNodos.get(1), Color.BLUE);
        agregar(nueva);
        nueva = new Raiz(arrayNodos.get(6),arrayNodos.get(7),arrayNodos.get(4),arrayNodos.get(2), Color.BLUE);
        agregar(nueva);
        nueva = new Raiz(arrayNodos.get(7),arrayNodos.get(6),arrayNodos.get(5),arrayNodos.get(3), Color.BLUE);
        agregar(nueva);
        repaint();
    }
    
    public void agregar(Raiz raiz){
        arrayEnlaces.add(raiz.getHorizontal());
        arrayEnlaces.add(raiz.getVertical());
        arrayEnlaces.add(raiz.getDiagonal());
    }
    
}
