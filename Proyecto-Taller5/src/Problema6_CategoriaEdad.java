
import java.util.Scanner;

/***
 * Categoría de Edad: Clasificar a una persona en una categoría de edad (niño, adolescente, adulto) en función de su edad.
 * @author PatitoCorrea
 */
public class Problema6_CategoriaEdad {
    public static void main(String[] args) {
        int edad;
        Scanner tcl = new Scanner(System.in);
        System.out.println("INGRESE LA EDAD DEL USUARIO: ");
        edad = tcl.nextInt();
        if (edad<13)
            System.out.println("LA CATEGORIA DEL USUARIO ES NIÑO");
        else 
            if (edad >= 13 && edad < 18)
             System.out.println("LA CATEGORIA DEL USUARIO ES ADOLESCENTE");
        if (edad >= 18)
            System.out.println("LA CATEGORIA DEL USUARIO ES ADULTO");
                    
        
    }
    
}

