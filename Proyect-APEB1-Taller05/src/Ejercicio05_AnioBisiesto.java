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
        System.out.print("Escriba un anio: ");
        int anio = tcl.nextInt();
        if ((anio % 4 == 0 && anio % 100 > 0) || anio % 400 == 0)
            System.out.println(anio + " SI es un anio bisiesto.");
        else
            System.out.println(anio + " NO es un anio bisiesto.");
    }
}
/***
*run-single:
Escriba un anio: 2020
2020 SI es un anio bisiesto.
BUILD SUCCESSFUL (total time: 3 seconds)
* run-single:
Escriba un anio: 2023
2023 NO es un anio bisiesto.
BUILD SUCCESSFUL (total time: 4 seconds)
 */