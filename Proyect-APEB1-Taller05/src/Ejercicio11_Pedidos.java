import java.util.Scanner;
/**
 * Ejercicio 11: "Desarrollar una solución que imprima el costo de un pedido de 
 * un artículo del cual se tiene la descripción, la cantidad que se requiere y 
 * el precio unitario. Si la cantidad pedida excede de 50 unidades, se hace un 
 * descuento de 15%."
 * @author Gabriel Cueva y José Paccha
 * @version 1.0
 */
public class Ejercicio11_Pedidos {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese el precio unitario del producto que desea comprar: ");
        double precioUnit = tcl.nextDouble();
        System.out.print("Ingrese la cantidad que desea comprar: ");
        double cantidad = tcl.nextDouble();
        double precioTotal = precioUnit * cantidad;
        if (cantidad > 50)
            precioTotal *= 0.85;
        System.out.println("El valor final a pagar será: $" + precioTotal);
    }
}
/***
 * EVIDENCIA DEL RUN:
 run-single:
Ingrese el precio unitario del producto que desea comprar: 1,25
Ingrese la cantidad que desea comprar: 60
El valor final a pagar ser�: $63.75
BUILD SUCCESSFUL (total time: 13 seconds)
 */