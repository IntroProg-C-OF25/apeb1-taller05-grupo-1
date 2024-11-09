
import java.util.Scanner;

/**
 * Calculo de impuestos: Desarrollar una solución que permita leer los datos de
 * un automóvil (marca, origen y costo) imprima el impuesto por pagar y el
 * precio de venta (incluido el impuesto). Si el origen es Alemania el impuesto
 * es 20%, si es de Japón el impuesto es 30%, si es de Italia, 15%, y si es de
 * USA, 8%
 *
 * @author PatitoCorrea
 */
public class Problema12_CalculoImpuestos {

    public static void main(String[] args) {
        double costo, montoImpuesto, precioVenta, impuesto;
        Scanner tcl = new Scanner(System.in);

        System.out.print("Ingrese la marca del automóvil: ");
        String marca = tcl.nextLine();

        System.out.print("Ingrese el origen del automóvil (Alemania, Japón, Italia, USA): ");
        String origen = tcl.nextLine();

        System.out.print("Ingrese el costo del automóvil: ");
        costo = tcl.nextDouble();

        switch (origen) {
            case "Alemania":
                impuesto = 0.20;
                break;
            case "Japon":
                impuesto = 0.30;
                break;
            case "Italia":
                impuesto = 0.15;
                break;
            case "USA":
                impuesto = 0.08;
                break;
            default:
                System.out.println("Origen no válido.");
                return;
        }

        montoImpuesto = costo * impuesto;
        precioVenta = costo + montoImpuesto;

        System.out.println("\n--- Detalles del Automóvil ---");
        System.out.println("Marca: " + marca);
        System.out.println("Origen: " + origen);
        System.out.println("Costo: $" + costo);
        System.out.println("Impuesto a pagar: $" + montoImpuesto);
        System.out.println("Precio de venta (incluido el impuesto): $" + precioVenta);

    }
}
