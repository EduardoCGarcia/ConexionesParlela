package logic;

import java.util.AbstractSet;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author EduardoCGarcia
 */
public class PermutationFinder {

    public static Set<String> permutationFinder(String str) {
        Set<String> perm = new HashSet<String>();
        if (str == null) {
            return null;
        } else if (str.length() == 0) {
            perm.add("");
            return perm;
        }
        char initial = str.charAt(0);
        String rem = str.substring(1);
        Set<String> words = permutationFinder(rem);
        for (String strNew : words) {
            for (int i = 0; i <= strNew.length(); i++) {
                perm.add(insertChar(strNew, initial, i));
            }
        }
        return perm;
    }

    public static String insertChar(String str, char c, int j) {
        String begin = str.substring(0, j);
        String end = str.substring(j);
        return begin + c + end;
    }

    
    /*
    1110
    
    0110 0010 0000
    0110 0100 0000
    
    1010 0010 0000
    1010 1000 0000
    
    1100 1000 0000
    1100 0100 0000
     
    */

    public static Set<String> wayFinder(String tag, String origen, String destino) {
        String posiciones = "0123";
        Set<String> perm = permutationFinder(posiciones);
        Set<String> rutas = new HashSet<String>();
        String tagAux = tag;

        int i = 0, j = 0;
        String ruta,mov;
        for (String p : perm) {
            StringBuilder n = new StringBuilder(tag);
            ruta = tag;
            mov = origen;
            tagAux = tag;
            j = 0;

            while (!tagAux.equals("0000")) {
                i = Character.getNumericValue(p.charAt(j));
                j++;
                if (tagAux.charAt(i) == '1') {
                    n.setCharAt(i, '0');
                    tagAux = n.toString();
                    switch (i) {
                        case 0 -> {
                            //System.out.println("Curva");
                            ruta += " " + tagAux;
                            mov += " -> " + "[Curva]";
                        }
                        case 1 -> {
                            //System.out.println("Diagonal");
                            ruta += " " + tagAux;
                            mov += " -> " + "[Diagonal]";
                        }
                        case 2 -> {
                            //System.out.println("Vertical");
                            ruta += " " + tagAux;
                            mov += " -> " + "[Vertical]";
                        }
                        case 3 -> {
                            //System.out.println("Horizontal");
                            ruta += " " + tagAux;
                            mov += " -> " + "[Horizontal]";
                        }
                    }
                } else {
                    break;
                }

            }
            if(ruta.endsWith("0000"))
                rutas.add(mov + " -> " + destino);

        }
        return rutas;
    }

}
