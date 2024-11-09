
import java.util.Scanner;

/***
 * Sistema de reservas hoteleras: En una hosteria de la ciudad de Loja se hace un descuento del 10% si el cliente se hospeda más de 5 días, 
 * del 15% si se hospeda más de 10 días y del 20% si se hospeda más de 15 días. Elaborar un solución que pida como datos de entrada el número de días 
 * y el precio diario de la habitación y luego calcule e imprima el subtotal por pagar, el descuento y el total por pagar.
 * @author juampyz7
 */
public class Problema13_ReservasHoteleras {
    public static void main(String[] args) {
        int numeroDias;
        double precioDiario, subTotal, descuento, Total;
        Scanner tcl = new Scanner(System.in);
        System.out.println("INGRESE EL NUMERO DE DIAS DE HOSPEDAJE: ");
        numeroDias = tcl.nextInt();
        System.out.println("INGRESE EL PRECIO DIARIO DE LA HABITACION: ");
        precioDiario = tcl.nextDouble();
        subTotal = numeroDias * precioDiario;
        descuento = 0;
        if (numeroDias > 15)
            descuento = (subTotal * 2/10);
        else
        if (numeroDias > 10)
            descuento = (subTotal * 15/100);
        if (numeroDias > 5)
            descuento = (subTotal * 1/10);
        Total = subTotal - descuento; 
        System.out.println("EL SUBTOTAL A PAGAR ES DE: " + subTotal);
        System.out.println("EL DESCUENTO APLICADO ES DE: " + descuento);
        System.out.println("EL TOTAL A PAGAR ES DE: " + Total);
        
        
    }
    
}
