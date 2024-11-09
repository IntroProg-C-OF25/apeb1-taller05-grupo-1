import java.util.Scanner;
/***
 * Año Bisiesto: Comprobar si un año ingresado es bisiesto o no. Si es bisiesto, mostrar un mensaje especial.
 * @author juampyz7
 */
public class Problema5_AñoBisiesto {
    public static void main(String[] args) {
        int año, añoBisiesto;
        Scanner tcl = new Scanner(System.in);
        System.out.print("INGRESA UN AÑO A LAZAR: ");
        añoBisiesto = tcl.nextInt();
        if ((añoBisiesto % 4 == 0 && añoBisiesto % 100 != 0) ||(añoBisiesto % 400 == 0)){
            System.out.println("FELICIDADES ESTE AÑO ES BIBIESTO");
        } else {
            System.out.println("ESTE AÑO NO ES BISIESTO");
                
      
            
            
        }
    }
}
