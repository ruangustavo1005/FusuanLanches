package util;

/**
 * Classe de funções (in)úteis para trabalhar com números
 * @author Ruan
 */
public class NumberUtils {
    
    public static int parseInt(String s) {
        return s.equals("") ? 0 : Integer.parseInt(s);
    }
    
    public static float parseFloat(String s) {
        return (float) (s.equals("") ? 0.0 : Float.parseFloat(s));
    }
    
}
