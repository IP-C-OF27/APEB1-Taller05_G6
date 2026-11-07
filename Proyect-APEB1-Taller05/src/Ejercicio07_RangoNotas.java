import java.util.Scanner;
/**
 * Ejercicio 07: "Asignar una letra (A, B, C, D) a una calificación en función 
 * de su rango (A para 90-100, B para 80-89, etc.)."
 * @author Gabriel Cueva y José Paccha
 * @version 1.0
 */
public class Ejercicio07_RangoNotas {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese su calificacion sobre 100 puntos: ");
        double nota = tcl.nextDouble();
        if (nota >= 0 && nota <= 100){
            if (nota >= 90)
            System.out.println("Su rango es: A");
            else
                if (nota >= 80)
                System.out.println("Su rango es: B");
                else
                    if (nota >= 70)
                    System.out.println("Su rango es: C");
                    else
                        if (nota >= 60)
                        System.out.println("Su rango es: D");
                        else
                            System.out.println("Su rango es: F");
        }
        else
            System.out.println("Nota inválida");
    }
}
/***
 * EVIDENCIA DEL RUN:
 * run-single:
Ingrese su calificaci�n sobre 100 puntos: 67
Su rango es: D
BUILD SUCCESSFUL (total time: 2 seconds)
 */