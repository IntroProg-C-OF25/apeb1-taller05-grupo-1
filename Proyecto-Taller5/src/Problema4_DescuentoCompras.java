
import java.util.Scanner;

/***
 *Descuento en Compras: Calcular el precio final de un producto con un descuento del 10% si el precio original es mayor de $100; de lo contrario, no hay descuento.
 * @author PatitoCorrea
 */
public class Problema4_DescuentoCompras {
    public static void main(String[] args) {
        double preciofd, preciofinal, precioproducto;
        Scanner tcl = new Scanner(System.in);
        System.out.println("INGRESE EL PRECIO DEL PRODUCTO: ");
        precioproducto = tcl.nextInt();
        preciofinal = precioproducto;
        if (preciofinal>100) {
            preciofinal = precioproducto;
            System.out.println("EL PRECIO FINAL DEL PRODUCTO ES: " + preciofinal);
        }
        else {
            preciofd = (precioproducto * 0.90);
            preciofinal = preciofd;
            System.out.println("EL PRECIO FINAL DEL PRODUCTO ES: " + preciofinal);
        }
           
        
    }
    
}

