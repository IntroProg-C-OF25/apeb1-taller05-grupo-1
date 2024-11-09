
import java.util.Scanner;

/***
 * Rango de Notas: Asignar una letra (A, B, C, D) a una calificación en función de su rango (A para 90-100, B para 80-89, etc.).
 * @author juampyz7
 */
public class Problema7_RangoNotas {
    public static void main(String[] args) {
        int calificacion;
        Scanner tcl = new Scanner(System.in);
        System.out.println("INGRESE SU CALIFICACION DEL 0-100: ");
        calificacion = tcl.nextInt();
        String letra = null;
        if (calificacion > 90 && calificacion <= 100)
            letra = "A";
        else
        if (calificacion > 80 && calificacion <= 90)
            letra = "B";
        if (calificacion > 70 && calificacion <= 80)
            letra = "C";
        if (calificacion > 60 && calificacion <= 70)
            letra = "D";
        System.out.println("LA CALIFICACION CORRESPONDE A LA LETRA: " + letra);
        
    }
    
}
