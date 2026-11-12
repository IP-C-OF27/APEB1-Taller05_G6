import java.util.Scanner;
/**
 * Ejercicio 03: "Dados tres números distintos, determinar cuál es el mayor."
 * @author Gabriel Cueva y José Paccha
 * @version 1.0
 */
public class Ejercicio03_MayorTresNumeros {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese 3 numeros distintos: ");
        double valor1 = tcl.nextDouble(), valor2 = tcl.nextDouble(), valor3 = tcl.nextDouble(), mayor;
        if (valor1 != valor2 && valor2 != valor3 && valor1 != valor3){
            if (valor1 > valor2)
                mayor = valor1;
            else
                mayor = valor2;
            if (mayor < valor3)
                mayor = valor3;
        System.out.println("El mayor de los valores es: "+ mayor);
        }
        else
            System.out.println("Entrada inválida, por favor revise que sean números distintos.");
    }
}
/***
run:
Ingrese 3 numeros: 2,20
-75
1200
El mayor de los valores es: 1200.0
BUILD SUCCESSFUL (total time: 17 seconds)
*/