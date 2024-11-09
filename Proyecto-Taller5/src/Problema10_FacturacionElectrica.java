
import java.util.Scanner;

/***
 * Facturación eléctrica: Desarrollar una solución que permita calcular y mostrar el valor a cancelar de una planilla de luz. 
 * Se debe ingresar el valor de costo por kilovatio/hora y el número de kilovatios consumidos en el mes. 
 * Si el usuario tiene edad mayor a 65 años, se debe descontar el 10% por pertenecer a la tercera edad.
 * @author PatitoCorrea
 */
public class Problema10_FacturacionElectrica {
        public static void main(String[] args) {
        double vplanillaluz, costokxh, k_consumidos, edad_u, valor_base, descuento;
        Scanner teclado = new Scanner(System.in);
        System.out.print("INGRESE EL VALOR DEL COSTO DE KILOVATIO POR HORA: ");
        costokxh = teclado.nextDouble();
        System.out.print("INGRESE EL NUMERO DE KILOVATIOS CONSUMIDOS: ");
        k_consumidos = teclado.nextDouble();
        System.out.print("INGRESE LA EDAD DEL USUARIO: ");
        edad_u = teclado.nextDouble();
        valor_base = costokxh * k_consumidos;
        if (edad_u > 65) {
        valor_base =  (costokxh * k_consumidos) * (0.9);
        vplanillaluz = valor_base;
        System.out.println("EL VALOR A PAGAR DE LA PLANILLA DE LUZ ES: $ " + vplanillaluz);
        }
        else { 
        vplanillaluz = valor_base;
        System.out.println("EL VALOR A PAGAR DE LA PLANILLA DE LUZ ES: $ " + valor_base);
        }        
    }
}
    
