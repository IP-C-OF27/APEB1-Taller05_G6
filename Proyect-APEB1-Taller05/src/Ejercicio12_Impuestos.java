import java.util.Scanner;
/**
 * Ejercicio 12: "Desarrollar una solución que permita leer los datos de un 
 * automóvil (marca, origen y costo) imprima el impuesto por pagar y el precio 
 * de venta (incluido el impuesto). Si el origen es Alemania el impuesto es 20%, 
 * si es de Japón el impuesto es 30%, si es de Italia, 15%, y si es de USA, 8%"
 * @author José Paccha y Gabriel Cueva
 * @version 1.0
 */
public class Ejercicio12_Impuestos {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double impuesto=0, precVenta;
        System.out.print("Ingrese la marca del automovil: ");
        String marca = tcl.nextLine();
        System.out.print("Ingrese el pais de origen del automovil (Alemania, Japon, Italia, USA): ");
        String origen = tcl.nextLine();
        System.out.print("Ingrese el costo del automovil: ");
        double costoVeh = tcl.nextDouble();
        if (origen.equalsIgnoreCase("Alemania")) 
            impuesto = costoVeh * 0.20;
        else 
            if (origen.equalsIgnoreCase("Japon")) 
                impuesto = costoVeh * 0.30;
            else 
                if (origen.equalsIgnoreCase("Italia")) 
                    impuesto = costoVeh * 0.15;
                else 
                    if (origen.equalsIgnoreCase("USA")) 
                        impuesto = costoVeh * 0.08;
                    else {
                        System.out.println("Pais de origen no valido.");
                        return;
                    }
        precVenta = costoVeh + impuesto;
        System.out.printf("Impuesto por pagar: $ %.2f\n" , impuesto);
        System.out.printf("Precio de venta del vehiculo: $ %.2f\n" , precVenta);
    }
}
/***
 * EVIDENCIA DEL RUN:
 * run-single:
Ingrese la marca del automovil: Ford
Ingrese el pais de origen del automovil (Alemania, Japon, Italia, USA): USA
Ingrese el costo del automovil: 57000,32
Impuesto por pagar: $ 4560,03
Precio de venta del vehiculo: $ 61560,35
BUILD SUCCESSFUL (total time: 11 seconds)
* run-single:
Ingrese la marca del automovil: Scania
Ingrese el pais de origen del automovil (Alemania, Japon, Italia, USA): Brasil
Ingrese el costo del automovil: 250000
Pais de origen no valido.
BUILD SUCCESSFUL (total time: 16 seconds)
 */