import java.util.Scanner;
/**
 * Ejercicio 06: "Clasificar a una persona en una categoría de edad (niño, 
 * adolescente, adulto) en función de su edad."
 * @author José Paccha y Gabriel Cueva
 * @version 1.0
 */
public class Ejercicio06_CategoriaEdad {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        int edad = tcl.nextInt();
        if (edad>=0 && edad<=11)
            System.out.println("Usted es un niño");
        else 
            if (edad >=12 && edad <= 17)
                System.out.println("Usted es adolescente");
            else
                if (edad>=18)
                    System.out.println("Usted es adulto");
    }
}
/***
 * EVIDENCIA DEL RUN:
 * run-single:
Ingrese su edad: 10
Usted es un ni�o
BUILD SUCCESSFUL (total time: 5 seconds)
* run-single:
Ingrese su edad: 17
Usted es adolescente
BUILD SUCCESSFUL (total time: 4 seconds)
* run-single:
Ingrese su edad: 21
Usted es adulto
BUILD SUCCESSFUL (total time: 2 seconds)
 */