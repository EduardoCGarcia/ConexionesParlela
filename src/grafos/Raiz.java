package grafos;

import java.awt.Color;
import java.awt.Point;


/**
 *
 * @author EduardoCGarcia
 */
public class Raiz {
   private Nodo raiz, nodoH, nodoV, nodoD, nodoC;
   private Enlace horizontal, vertical, diagonal, curva;
   private Color colorEnlace;
   private String nombre;

 
    
    public Raiz(Nodo raiz, Nodo nodoH, Nodo nodoV, Nodo nodoD, Nodo nodoC,Color colorEnlace) {
        this.raiz = raiz;
        this.nodoH = nodoH;
        this.nodoV = nodoV;
        this.nodoD = nodoD;
        this.nodoC = nodoC;
        this.nombre = raiz.getNombre();
        this.setHorizontal(new Enlace(raiz.getX(), raiz.getY(), nodoH.getX(), nodoH.getY(), colorEnlace, raiz.getNombre() + "-" + nodoH.getNombre()));
        this.setVertical(new Enlace(raiz.getX(), raiz.getY(), nodoV.getX(), nodoV.getY(), colorEnlace, raiz.getNombre() + "-" + nodoV.getNombre()));
        this.setDiagonal(new Enlace(raiz.getX(), raiz.getY(), nodoD.getX(), nodoD.getY(), colorEnlace, raiz.getNombre() + "-" + nodoD.getNombre()));
        this.setCurva(new Enlace(raiz.getX(), raiz.getY(), nodoC.getX(), nodoC.getY(), colorEnlace, raiz.getNombre() + "-" + nodoC.getNombre()));
    }
    
    public Raiz(Nodo raiz, Nodo nodoC, Color colorEnlace) {
        this.raiz = raiz;
        this.nodoC = nodoC;
        this.setCurva(new Enlace(raiz.getX(), raiz.getY(), nodoC.getX(), nodoC.getY(), colorEnlace, raiz.getNombre() + "-" + nodoC.getNombre()));
    }

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }

    public Nodo getNodoH() {
        return nodoH;
    }

    public void setNodoH(Nodo nodoH) {
        this.nodoH = nodoH;
    }

    public Nodo getNodoV() {
        return nodoV;
    }

    public void setNodoV(Nodo nodoV) {
        this.nodoV = nodoV;
    }

    public Nodo getNodoD() {
        return nodoD;
    }

    public void setNodoD(Nodo nodoD) {
        this.nodoD = nodoD;
    }

    public Nodo getNodoC() {
        return nodoC;
    }

    public void setNodoC(Nodo nodoC) {
        this.nodoC = nodoC;
    }

    public Enlace getHorizontal() {
        return horizontal;
    }

    public void setHorizontal(Enlace horizontal) {
        this.horizontal = horizontal;
    }

    public Enlace getVertical() {
        return vertical;
    }

    public void setVertical(Enlace vertical) {
        this.vertical = vertical;
    }

    public Enlace getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(Enlace diagonal) {
        this.diagonal = diagonal;
    }

    public Enlace getCurva() {
        return curva;
    }

    public void setCurva(Enlace curva) {
        this.curva = curva;
    }

    public Color getColorEnlace() {
        return colorEnlace;
    }

    public void setColorEnlace(Color colorEnlace) {
        this.colorEnlace = colorEnlace;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
   
}
