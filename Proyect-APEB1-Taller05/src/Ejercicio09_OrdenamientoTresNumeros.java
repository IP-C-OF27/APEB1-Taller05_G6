import java.util.Scanner;
/**
 * Ejercicio 09: "Dados tres números, ordenarlos en orden ascendente."
 * @author Gabriel Cueva y José Paccha
 * @version 1.0
 */
public class Ejercicio09_OrdenamientoTresNumeros {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese tres valores: ");
        int val1 = tcl.nextInt();
        int val2 = tcl.nextInt();
        int val3 = tcl.nextInt();
        if (val1 <= val2 && val1 <= val3) {
            System.out.print("Orden ascendente: " + val1 + ", ");
            if (val2 <= val3)
                System.out.println(val2 + (", ") + val3);
            else
                System.out.println(val3 + (", ") + val2);
        } 
        else 
            if (val2 <= val1 && val2 <= val3) {
            System.out.print("Orden ascendente: " + val2 + ", ");
            if (val1 <= val3) 
                System.out.println(val1 + (", ") + val3);
            else 
                System.out.println(val3 + (", ") + val1);
            } 
            else 
                if (val3 <= val1 && val3 <= val2) {
                System.out.print("Orden ascendente: " + val3 + ", ");
                if (val1 <= val2)
                    System.out.println(val1 + (", ") + val2);
                else
                    System.out.println(val2 + (", ") + val1);
                }
    }
}
/***
 * EVIDENCIA DEL RUN:
Ingrese tres valores: 4
6
3
Orden ascendente: 3, 4, 6
BUILD SUCCESSFUL (total time: 2 seconds)
 */