/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

import grafos.Raiz;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;

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
        findRutaRandom();
    }
    
    public void pintarOrigen(){
        this.raizOrigen.getRaiz().setColorNodo(Color.red);
    }
    public void pintarDestino(){
        this.raizDestino.getRaiz().setColorNodo(Color.red);
    }
    public void pintarNodoH(){
        this.raizH.getRaiz().setColorNodo(Color.red);
    }
    public void pintarNodoV(){
        this.raizV.getRaiz().setColorNodo(Color.red);
    }
    public void pintarNodoD(){
        this.raizD.getRaiz().setColorNodo(Color.red);
    }
    public void pintarNodoC(){
        this.raizC.getRaiz().setColorNodo(Color.red);
    }
    
    public void pintarEnlaceH(){
        this.raizOrigen.getHorizontal().setEnlaceColor(Color.red);  
        this.raizH.getHorizontal().setEnlaceColor(Color.red);
    }
    public void pintarEnlaceV(){
        this.raizOrigen.getVertical().setEnlaceColor(Color.red);  
        this.raizV.getVertical().setEnlaceColor(Color.red);
    }
    public void pintarEnlaceD(){
        this.raizOrigen.getDiagonal().setEnlaceColor(Color.red);  
        this.raizD.getDiagonal().setEnlaceColor(Color.red);
    }
    public void pintarEnlaceC(){
        this.raizOrigen.getCurva().setEnlaceColor(Color.red);  
        this.raizC.getCurva().setEnlaceColor(Color.red);
    }
    
    public void findRutaRandom(){
        String tag = this.tag;
        Random indiceRandom = new Random();
        StringBuilder n = new StringBuilder(tag);
        pintarOrigen();
        pintarDestino();
        int i;
        while(!tag.equals("0000")){
            i = indiceRandom.nextInt(0, 4);
            if (tag.charAt(i) == '1') {
                n.setCharAt(i, '0');
                tag = n.toString();
                switch (i) {
                    case 0 -> {
                        pintarNodoC();
                        pintarEnlaceC();
                        raizOrigen = raizC;
                        this.nombreOrigen = raizOrigen.getNombre();
                        findRaiz();
                    }
                    case 1 -> {
                        pintarNodoD();
                        pintarEnlaceD();
                        raizOrigen = raizD;
                        this.nombreOrigen = raizOrigen.getNombre();
                        findRaiz();
                    }
                    case 2 -> {
                        pintarNodoV();
                        pintarEnlaceV();
                        raizOrigen = raizV;
                        this.nombreOrigen = raizOrigen.getNombre();
                        findRaiz();
                    }
                    case 3 -> {
                        pintarNodoH();
                        pintarEnlaceH();
                        raizOrigen = raizH;
                        this.nombreOrigen = raizOrigen.getNombre();
                        findRaiz();
                    }
                }
            } 
            
            
        }
    }
    
    public void findRaiz(){
        for (Raiz r : raices) {
            if (r.getRaiz().getNombre().equals(nombreOrigen)) {
                this.raizOrigen = r;
                findHVDC(
                        r.getNodoH().getNombre(),
                        r.getNodoV().getNombre(),
                        r.getNodoD().getNombre(),
                        r.getNodoC().getNombre());
            } else if (r.getRaiz().getNombre().equals(nombreDestino)){
                this.raizDestino = r;
            }
        }
    }
    
    public void findHVDC(String h,String v,String d, String c){
        for (Raiz r : raices) {
            if (r.getRaiz().getNombre().equals(h)) {
                this.raizH = r;
                
            } else if (r.getRaiz().getNombre().equals(v)) {
                this.raizV = r;
            } else if (r.getRaiz().getNombre().equals(d)) {
                this.raizD = r;
            } else if (r.getRaiz().getNombre().equals(c)) {
                this.raizC = r;
            } 
        }
    }

    public String getNombreOrigen() {
        return nombreOrigen;
    }

    public void setNombreOrigen(String nombreOrigen) {
        this.nombreOrigen = nombreOrigen;
    }

    public String getNombreDestino() {
        return nombreDestino;
    }

    public void setNombreDestino(String nombreDestino) {
        this.nombreDestino = nombreDestino;
    }
    
    
    
}
