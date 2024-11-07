
import java.util.Scanner;

/***
 * Mayor de tres números: Dados tres números, determinar cuál es el mayor. Si son iguales, mostrar un mensaje.
 * @author juampyz7
 */

public class Problema3_MayorNumeros {
    public static void main(String[] args) {
        int numero1, numero2, numero3, mayor;
        Scanner tcl = new Scanner(System.in);
        System.out.print("INGRESA EL PRIMER NUMERO: ");
        numero1 = tcl.nextInt();
        System.out.print("INGRESA EL SEGUNDO NUMERO: ");
        numero2 = tcl.nextInt();
        System.out.print("INGRESA EL TERCER NUMERO: ");
        numero3 = tcl.nextInt();
        
        mayor = numero1;
        if (numero1 == numero2 && numero2 == numero3){
            System.out.println("LOS TRES NUMEROS SON IGUALES");
    }
        else {
            mayor = numero1;
        if (numero2 > mayor)
            mayor = numero2;
        if (numero3 > mayor)
            mayor = numero3;
        System.out.println("EL MAYOR DE LOS TRES NUMEROS ES: " + mayor);
        }
    }
}

