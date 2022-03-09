package app;

import javax.swing.JFrame;
import nodos.Lienzo;

/**
 *
 * @author EduardoCGarcia
 */
public class main2 {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Grafos");
        ventana.add(new Lienzo());
        ventana.setSize(900,600);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }   
}
