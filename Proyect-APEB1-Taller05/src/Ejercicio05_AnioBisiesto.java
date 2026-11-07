import java.util.Scanner;
/**
 * Ejercicio 05: "Comprobar si un año ingresado es bisiesto o no. Si es 
 * bisiesto, mostrar un mensaje especial."
 * @author Gabriel Cueva y José Paccha
 * @version 1.0
 */
public class Ejercicio05_AnioBisiesto {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Escriba un año: ");
        int anio = tcl.nextInt();
        if ((anio % 4 == 0 && anio % 100 > 0) || anio % 400 == 0)
            System.out.println(anio + " SI es un año bisiesto.");
        else
            System.out.println(anio + " NO es un año bisiesto.");
    }
}
/***
run-single:
Escriba un a�o: 2000
2000 SI es un a�o bisiesto.
BUILD SUCCESSFUL (total time: 4 seconds)
 */