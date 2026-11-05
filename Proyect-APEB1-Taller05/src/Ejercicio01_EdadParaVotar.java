import java.util.Scanner;
/**
 * Ejercicio 01: "Determinar si una persona es elegible para votar en función de 
 * su edad (mayor o igual a 16 años)."
 * @author Gabriel Cueva y Jose Paccha
 * @version 1.0
 */
public class Ejercicio01_EdadParaVotar {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int edad;
        System.out.print("Escriba su edad: ");
        edad = tcl.nextInt();
        if (edad >= 16)
            System.out.println("Puede votar");
        else
            System.out.println("No puede votar");
    }
}
/***
run:
Escriba su edad: 18
Puede votar
BUILD SUCCESSFUL (total time: 5 seconds)
*/