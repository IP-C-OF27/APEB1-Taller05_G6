import java.util.Scanner;
/**
 * Ejercicio 03: "Dados tres números distintos, determinar cuál es el mayor."
 * @author Gabriel Cueva y Jose Paccha
 * @version 1.0
 */
public class Ejercicio03_MayorTresNumeros {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese 3 numeros: ");
        double valor1 = tcl.nextDouble();
        double valor2 = tcl.nextDouble();
        double valor3 = tcl.nextDouble();
        if (valor1 > valor2 && valor1 > valor3)
            System.out.println("El mayor de los valores es: " + valor1);
        if (valor2 > valor1 && valor2 > valor3)
            System.out.println("El mayor de los valores es: " + valor2);
        if (valor3 > valor2 && valor3 > valor1)
            System.out.println("El mayor de los valores es: " + valor3);
    }
}
/***
run:
Ingrese 3 numeros: 2,20
-75
1200
El mayor de los valores es: 1200.0
BUILD SUCCESSFUL (total time: 17 seconds)
*/