/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

import grafos.Raiz;
import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author EduardoCGarcia
 */
public class GeneradorRutas {
    String nombreOrigen,nombreDestino,tag;
    Raiz raizOrigen,raizDestino, raizH, raizV, raizD, raizC;
    ArrayList<Raiz> raices;

    public GeneradorRutas() {
    }
    
    public GeneradorRutas(String nombreOrigen, String nombreDestino, String tag, ArrayList<Raiz> raices) {
        this.nombreOrigen = nombreOrigen;
        this.nombreDestino = nombreDestino;
        this.tag = tag;
        this.raices = raices;
        this.findRaiz();
    }
    
    public void pintarNodos(){
        this.raizOrigen.getRaiz().setColorNodo(Color.red);
        this.raizH.getRaiz().setColorNodo(Color.red);
    }
    
    public void pintarEnlaceHorizontal(){
        this.raizOrigen.getHorizontal().setEnlaceColor(Color.red);
        this.raizH.getHorizontal().setEnlaceColor(Color.red);
    }
    
    
    
    public void findRaiz(){
        for (Raiz r : raices) {
            if (r.getRaiz().getNombre().equals(nombreOrigen)) {
                this.raizOrigen = r;
                findHVDC(
                        r.getNodoH().getNombre(),
                        r.getNodoV().getNombre(),
                        r.getNodoD().getNombre());
            } else if (r.getRaiz().getNombre().equals(nombreDestino)){
                this.raizDestino = r;
            }
        }
    }
    
    public void findHVDC(String h,String v,String d){
        for (Raiz r : raices) {
            if (r.getRaiz().getNombre().equals(h)) {
                this.raizH = r;
            } else if (r.getRaiz().getNombre().equals(v)) {
                this.raizV = r;
            } else if (r.getRaiz().getNombre().equals(d)) {
                this.raizD = r;
            } 
        }
    }
    
}
