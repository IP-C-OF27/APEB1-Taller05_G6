import java.util.Scanner;
/**
 * Ejercicio 08: "Calcular el índice de masa corporal (IMC) de una persona y 
 * clasificarla en función de su valor (bajo peso, peso normal, sobrepeso, etc)."
 * @author José Paccha y Gabriel Cueva
 * @version 1.0
 */
public class Ejercicio08_IMC {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double imc;
        System.out.print("Ingrese su peso en kg: ");
        double peso=tcl.nextDouble();
        System.out.print("Ingrese su estatura en m: ");
        double estatura=tcl.nextDouble();
        imc= peso / (estatura*estatura);
        System.out.printf("Su IMC es: %.2f.\n", imc);
        if (imc<=18.5)
            System.out.println("Bajo peso");
        else
            if (imc>=18.5 && imc <=24.9)
                System.out.println("Peso normal");
            else 
                if (imc >=25 && imc <= 29.9)
                    System.out.println("Sobrepeso");
                else 
                    if (imc>=30)
                        System.out.println("Obesidad");
    }
}
/***
 * EVIDENCIA DEL RUN:
 * run-single:
Ingrese su peso en kg: 72,3
Ingrese su estatura en m: 1,70
Su IMC es: 25,02.
Sobrepeso
BUILD SUCCESSFUL (total time: 37 seconds)
 */