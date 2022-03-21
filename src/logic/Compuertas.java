package logic;

/**
 *
 * @author EduardoCGarcia
 */
public class Compuertas {
    public static String XOR(String a, String b){
        char p,q;
        String resultado = "";
        for (int i = 0; i < a.length(); i++) {
            p = a.charAt(i);
            q = b.charAt(i);
            if (p == q) {
                resultado += "0";
            } else {
                resultado += "1";
            }
        }
        return resultado;
    }
}
