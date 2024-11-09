
import java.util.Scanner;

/**
 * *
 * Pedidos online: Desarrollar una solución que imprima el costo de un pedido de
 * un artículo del cual se tiene la descripción, la cantidad que se requiere y
 * el precio unitario. Si la cantidad pedida excede de 50 unidades, se hace un
 * descuento de 15%.
 *
 * @author juampyz7
 */
public class Problema11_PedidosOnline {

    public static void main(String[] args) {
        int cantidad;
        double precioUnitario, costoTotal, descuento;
        Scanner tcl = new Scanner(System.in);
        System.out.println("INGRESE LA DESCRIPCION DEL ARTICULO: ");
        String descripcion = tcl.nextLine();
        System.out.println("INGRESE LA CANTIDAD REQUERIDA: ");
        cantidad = tcl.nextInt();
        System.out.println("EL PRECIO UNITARIO DEL PRODUCTO ES: ");
        precioUnitario = tcl.nextDouble();
        costoTotal = cantidad * precioUnitario;
        if (cantidad > 50) {
            descuento = (costoTotal * 15/100);
            costoTotal -= descuento;
            System.out.println("Descripción del artículo: " + descripcion);
            System.out.println("Cantidad solicitada: " + cantidad);
            System.out.println("Precio unitario: $" + precioUnitario);
            System.out.println("Costo total del pedido: $" + costoTotal);
        } else {
            costoTotal = cantidad * precioUnitario;
            System.out.println("Descripción del artículo: " + descripcion);
            System.out.println("Cantidad solicitada: " + cantidad);
            System.out.println("Precio unitario: $" + precioUnitario);
            System.out.println("Costo total del pedido: $" + costoTotal);

            
        }
    }
}
