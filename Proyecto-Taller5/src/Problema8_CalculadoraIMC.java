
import java.util.Scanner;

/***
 * Calculadora de IMC: Calcular el índice de masa corporal (IMC) de una persona y clasificarla en función de su valor (bajo peso, peso normal, sobrepeso, etc.).
 * @author PatitoCorrea
 */
public class Problema8_CalculadoraIMC {
    public static void main(String[] args) {
        double peso_kg, altura, peso;
        Scanner tcl = new Scanner(System.in);
        System.out.print("INGRESE SU PESO EN KILOGRAMOS: ");
        peso_kg = tcl.nextDouble();
        System.out.print("INGRESE SU ESTATURA: ");
        altura = tcl.nextDouble();
        peso = (peso_kg / (altura * altura));
        if (peso > 0 && peso <= 18)
            System.out.println("EL IMC DE LA PERSONA SE ENCUENTRA EN BAJO PESO");
        else
            if (peso > 18.5 && peso <= 25)
                System.out.println("EL IMC DE LA PERSONA SE ENCUENTRA EN UN PESO NORMAL");
        if (peso > 25 && peso <= 30)
            System.out.println("EL IMC DE LA PERSONA SE ENCUENTRA EN SOBREPESO");
        if (peso > 30 && peso <= 35)
            System.out.println("EL IMC DE LA PERSONA SE ENCUENTRA EN OBESIDAD LEVE");
        if (peso > 35 && peso <= 40)
            System.out.println("EL IMC DE LA PERSONA SE ENCUENTRA EN OBESIDAD MODERADA");
        if (peso > 40 && peso <= 100)
            System.out.println("EL IMC DE LA PERSONA SE ENCUENTRA EN OBESIDAD MORBIDA");
        
    }
    
}
