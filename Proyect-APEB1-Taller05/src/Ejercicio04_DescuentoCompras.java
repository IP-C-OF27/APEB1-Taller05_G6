import java.util.Scanner;
/**
 * Ejercicio 04: "Calcular el precio final de un producto con un descuento del 
 * 10% si el precio original es mayor de $100; de lo contrario, no hay descuento."
 * @author José Paccha y Gabriel Cueva
 * @version 1.0
 */
public class Ejercicio04_DescuentoCompras {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double precFin;
        System.out.print("Iingrese el precio original: ");
        double precOrig = tcl.nextDouble();
        if (precOrig>100){
            precFin = precOrig-(precOrig*0.10);
            System.out.println("Tiene un 10% de descuento el precio final es: : $" + precFin);
        }
        else{
            precFin=precOrig;
            System.out.println("NO tine descuento, el precio final es: $" + precFin);
        }     
    }
}
/***
 * EVIDENCIA DEL RUN:
 * run-single:
Iingrese el precio original: 200
Tiene un 10% de descuento el precio final es: : $180.0
BUILD SUCCESSFUL (total time: 2 seconds)
* run-single:
Iingrese el precio original: 30
NO tine descuento, el precio final es: $30.0
BUILD SUCCESSFUL (total time: 3 seconds)
 */