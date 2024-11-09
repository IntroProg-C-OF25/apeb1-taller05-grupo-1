
import java.util.Scanner;

/**
 * *
 * Ordenamiento de Tres Números: Dados tres números, ordenarlos en orden
 * ascendente.
 *
 * @author juampyz7
 */
public class Problema9_Ordenamiento3Numeros {

    public static void main(String[] args) {
        int numero1, numero2, numero3, numeroMayor, numeroMedio, numeroMenor;
        Scanner tcl = new Scanner(System.in);
        System.out.print("INGRESE EL PRIMER NUMERO: ");
        numero1 = tcl.nextInt();
        System.out.print("INGRESE EL SEGUNDO NUMERO: ");
        numero2 = tcl.nextInt();
        System.out.print("INGRESE EL TERCER NUMERO: ");
        numero3 = tcl.nextInt();
        if (numero1 <= numero2 && numero1 <= numero3) {
            numeroMenor = numero1;
            if (numero2 <= numero3) {
                numeroMedio = numero2;
                numeroMayor = numero3;
            } else {
                numeroMedio = numero3;
                numeroMayor = numero2;
            }
        } else if (numero2 <= numero1 && numero2 <= numero3) {
            numeroMenor = numero2;
            if (numero1 <= numero3) {
                numeroMedio = numero1;
                numeroMayor = numero3;
            } else {
                numeroMedio = numero3;
                numeroMayor = numero1;
            }
        } else {
            numeroMenor = numero3;
            if (numero1 <= numero2) {
                numeroMedio = numero1;
                numeroMayor = numero2;
            } else {
                numeroMedio = numero2;
                numeroMayor = numero1;
            }
        }
        System.out.println("EL ORDEN ASCENDENTE DE LOS NUMEROS ES: " + numeroMenor + "," + numeroMedio + "," + numeroMayor);
        

        
    }
}
