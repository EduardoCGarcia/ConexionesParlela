/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

/**
 *
 * @author EduardoCGarcia
 */
public class Xor {
    public static void main(String[] args) {
        String s = "1100";
        String s1 = "1010";
        char p,q;
        for (int i = 0; i < s.length(); i++) {
            p = s.charAt(i);
            q = s1.charAt(i);
            if (p == q) {
                System.out.println("0");
            } else {
                System.out.println("1");
            }
                    
        }
        
    }
}
