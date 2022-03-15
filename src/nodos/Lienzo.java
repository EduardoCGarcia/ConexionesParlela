package nodos;


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
    private ArrayList<Raiz> arrayRaices;
    private ArrayList<Cubo> arrayCubos;
    
    public Lienzo() {
        this.arrayNodos = arrayNodos;
        crearNombres();
    }
    
    /*public Lienzo(String name){
        this.arrayNodos = new ArrayList<Nodo>();
        this.arrayEnlaces = new ArrayList<Enlace>();
        this.crearCubos(name);
    }*/
    
    /**
     * Primite pintar el cubo, recubiendo los nodos y enlaces para pintarlos
     * @param g 
     */
    @Override
    public void paint(Graphics g){
        /*Cubo cubo1 = new Cubo(this.arrayEnlaces, this.arrayNodos);
        cubo1.pintar(g);*/
        for (Nodo nodo : arrayNodos) {
            nodo.pintar(g);
        }
        repaint();
    }
    
    public void crearNombres(){
        ArrayList<String> nombres = new ArrayList<String>();
        nombres.add("0000");nombres.add("0001");nombres.add("0010");
        nombres.add("0011");nombres.add("0100");nombres.add("0101");
        nombres.add("0110");nombres.add("0111");
        generarNodos(50, 50, nombres,Color.BLACK);
        
        nombres.clear();
        nombres.add("1000");nombres.add("1001");nombres.add("1010");
        nombres.add("1011");nombres.add("1100");nombres.add("1101");
        nombres.add("1110");nombres.add("1111");
        generarNodos(50, 50, nombres,Color.BLACK);
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /*public void crearCubos(){
        ArrayList<String> nombres = new ArrayList<String>();
        nombres.add("0000");nombres.add("0001");nombres.add("0010");
        nombres.add("0011");nombres.add("0100");nombres.add("0101");
        nombres.add("0110");nombres.add("0111");
        generarCubo(50, 50, nombres);
        generaEnlacesCubo1();
        
        
        nombres.clear();
        nombres.add("1000");nombres.add("1001");nombres.add("1010");
        nombres.add("1011");nombres.add("1100");nombres.add("1101");
        nombres.add("1110");nombres.add("1111");
        generarCubo(500, 50, nombres);
        generaEnlacesCubo2();
    }*/
   /* public void crearCubos(String name){
        ArrayList<String> nombres = new ArrayList<String>();
        nombres.add(name);nombres.add("0001");nombres.add("0010");
        nombres.add("0011");nombres.add("0100");nombres.add("0101");
        nombres.add("0110");nombres.add("0111");
        generarCubo(50, 50, nombres);
        generaEnlacesCubo1();
        
        
        nombres.clear();
        nombres.add("1000");nombres.add("1001");nombres.add("1010");
        nombres.add("1011");nombres.add("1100");nombres.add("1101");
        nombres.add("1110");nombres.add("1111");
        generarCubo(500, 50, nombres);
        generaEnlacesCubo2();
    }*/
    
    /*public void agregar(Raiz raiz){
        arrayEnlaces.add(raiz.getHorizontal());
        arrayEnlaces.add(raiz.getVertical());
        arrayEnlaces.add(raiz.getDiagonal());
    */
    
    /*public void generarCubo(int x1, int y1, ArrayList<String> noms){
        int x2 = x1 + 100;
        int y2 = y1 + 100;
        this.arrayNodos.add(new Nodo(x1, y1, noms.get(0)));   //Nodo 0000
        this.arrayNodos.add(new Nodo(x2, y1, noms.get(1)));  //Nodo 0001
        this.arrayNodos.add(new Nodo(x1, y2, noms.get(2)));  //Nodo 0010
        this.arrayNodos.add(new Nodo(x2, y2, noms.get(3))); //Nodo 0011
        x1 += 50;
        y1 += 50;
        x2 = x1 + 100;
        y2 = y1 + 100;
        this.arrayNodos.add(new Nodo(x1, y1, noms.get(4))); //Nodo 0100
        this.arrayNodos.add(new Nodo(x2, y1, noms.get(5))); //Nodo 0101
        this.arrayNodos.add(new Nodo(x1, y2, noms.get(6))); //Nodo 0110
        this.arrayNodos.add(new Nodo(x2, y2, noms.get(7))); //Nodo 0111
        repaint();
    }*/
    
    /*public void generaEnlacesCubo1(){
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
    }*/
    

}
