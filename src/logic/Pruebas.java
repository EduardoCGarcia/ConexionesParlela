/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

import java.util.Random;

/**
 *
 * @author EduardoCGarcia
 */
public class Pruebas {
    public static void main(String[] args) {
        String tag = "1111";
        Random indiceRandom = new Random();
        StringBuilder n = new StringBuilder(tag);
        int i;
        while(!tag.equals("0000")){
            i = indiceRandom.nextInt(0, 4);
            if (tag.charAt(i) == '1') {
                n.setCharAt(i, '0');
                tag = n.toString();
                switch (i) {
                    case 0 -> {
                        System.out.println("Curva");
                    }
                    case 1 -> {
                        System.out.println("Diagonal");
                    }
                    case 2 -> {
                        System.out.println("Vertical");
                    }
                    case 3 -> {
                        System.out.println("Horizontal");
                    }
                }
            } 
            
            
        }
        System.out.println("Nuevo tag" + tag);
        
    }
}
