import java.util.Scanner;
/**
 * Ejercicio 04: "Calcular el precio final de un producto con un descuento del 
 * 10% si el precio original es mayor de $100; de lo contrario, no hay descuento."
 * @author José Paccha y Gabriel Cueva
 * @version 1.0
 */
public class Ejercicio04_DescuentoCompras {
    public static void main(String[] args) {
        double precio;
        Scanner tcl = new Scanner(System.in);
        System.out.print("Deme el precio: ");
        precio=tcl.nextDouble();
        if (precio > 100)
            precio=precio*0.9;
        System.out.println(precio);
    }
}
/***
 * EVIDENCIA DEL RUN:
run-single:
Deme el precio: 1000
900.0
BUILD SUCCESSFUL (total time: 3 seconds)
 */