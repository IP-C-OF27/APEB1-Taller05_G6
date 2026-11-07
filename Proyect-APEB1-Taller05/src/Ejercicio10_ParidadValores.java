import java.util.Scanner;
/**
 * Ejercicio 10: "Dado un valor entero ingresado por teclado (positivo o 
 * negativo), determinar si se trata de un valor par o impar."
 * @author José Paccha y Gabriel Cueva
 * @version 1.0
 */
public class Ejercicio10_ParidadValores {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese un numero entero: ");
        int numero=tcl.nextInt();
        if (numero % 2 ==0)
            System.out.println("El numero "+numero+" es par.");
        else 
            System.out.println("El numero "+numero+" es impar.");
    }
}
/***
 * EVIDENCIA DEL RUN:
 run-single:
Ingrese un numero entero: -208
El numero -208 es par.
BUILD SUCCESSFUL (total time: 5 seconds)
* run-single:
Ingrese un numero entero: 93
El numero 93 es impar.
BUILD SUCCESSFUL (total time: 2 seconds)
 */