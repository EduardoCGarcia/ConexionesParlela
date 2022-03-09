package nodos;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author EduardoCGarcia
 */
public class Lienzo extends JPanel implements MouseListener{
    private Vector<Nodo> vectorNodos;
    
    public Lienzo(){
        this.vectorNodos = new Vector<>();
        this.generaCubo();
    }
    
    @Override
    public void paint(Graphics g){
        for (Nodo nodo : vectorNodos) {
            nodo.pintar(g);
        }
    }
    
    public void generaCubo(){
        this.vectorNodos.add(new Nodo(100,100));//Nodo 0000
        this.vectorNodos.add(new Nodo(100,200));
        this.vectorNodos.add(new Nodo(200,100));
        this.vectorNodos.add(new Nodo(200,200));
        repaint();
    }
    
    
    
    
    
    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
     
}
