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
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            System.out.println(r.nextInt(0, 4));
        }
        
        
    }
}
