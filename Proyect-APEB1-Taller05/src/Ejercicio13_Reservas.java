import java.util.Scanner;
/**
 * Ejercicio 13: "En una hostería de la ciudad de Loja se hace un descuento del 
 * 10% si el cliente se hospeda más de 5 días, del 15% si se hospeda más de 10 
 * días y del 20% si se hospeda más de 15 días. Elaborar una solución que pida 
 * el número de días y el precio diario de la habitación y luego calcule e 
 * imprima el subtotal por pagar, el descuento y el total por pagar."
 * @author Gabriel Cueva y José Paccha
 * @version 1.0
 */
public class Ejercicio13_Reservas {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese el números de días de hospedaje: ");
        int numDias = tcl.nextInt();
        System.out.print("Ingrese el precio por día: ");
        double precioDia = tcl.nextInt();
        double subtotal = precioDia * numDias;
        double descuento = 0;
        double total = 0;
        if (numDias > 15){
            descuento = subtotal * 0.2;
            total = subtotal - descuento;
        }
        else
            if (numDias > 10){
                descuento = subtotal * 0.15;
                total = subtotal - descuento;
            }
            else
                if (numDias > 5){
                    descuento = subtotal * 0.1;
                    total = subtotal - descuento;
                }
                else
                    total = subtotal;
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("El descuento aplicado es de: $" + descuento);
        System.out.println("El total a pagar es: $" + total);
    }
}
/***
 * EVIDENCIA DEL RUN:
run-single:
Ingrese el n�meros de d�as de hospedaje: 14
Ingrese el precio por d�a: 20
Subtotal: $280.0
El descuento aplicado es de: $42.0
El total a pagar es: $238.0
BUILD SUCCESSFUL (total time: 7 seconds)
 */