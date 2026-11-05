import java.util.Scanner;
/**
 * Ejercicio 02: "Día de la semana: Mostrar el nombre del día de la semana en
 * función del número ingresado (1 para lunes, 2 para martes, etc.)."
 *
 * @author José Paccha y Gabriel Cueva
 * @version 1.0
 */
public class Ejercicio02_Diasemana {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Escriba un numero 1-7: ");
        int dia = tcl.nextInt();
        String msjDia;
        switch (dia) 
        {//INICIO DE SENTENCIA DE SELECCION MULTIPLE
            case 1:
                msjDia= "Lunes";
                break;
            case 2:
                msjDia= "Martes";
                break;
            case 3:
                msjDia= "Miercoles";
                break;
           case 4:
                msjDia= "Jueves";
                break;
            case 5:
                msjDia= "Viernes";
                break;
            case 6:
                msjDia= "Sabado";
                break;
            case 7:
                msjDia= "Domingo";
                break;
            default:
                msjDia= "Error";
        }//FIN DE SENTENCIA DE SELECCOIN MULTIPLE
        System.out.println("El nro: " + dia + " es "+ msjDia);
    }
}
/***
 * EVIDENCIA DEL RUN:
run-single:
Escriba un numero 1-7: 5
El nro: 5 es Viernes
BUILD SUCCESSFUL (total time: 1 second)
 */
