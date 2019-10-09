/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Online2;

/**
 * Se importan las clases del paquete java.util
 */
import java.util.*;

/**
 * Clase en la que se calcula multiples divisiones a partir del dividendo 100,
 * hasta que el usuario introduzca un 0.
 *
 * @author Ángel Miguel Cubino Aragón
 * @version 1.0
 *
 */
public class Ejercicio7 {

    /**
     * Método principal de la clase.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner teclado = new Scanner(System.in);
        double dividendo = 100;
        double divisor;

        do {
            System.out.println("Introduce el divisor:");
            divisor = teclado.nextDouble();
            if (divisor != 0) {
                System.out.println(dividendo + "/" + divisor + "=" + dividendo / divisor);
                dividendo = dividendo / divisor;
            }
        } while (divisor != 0);
        System.out.println("No es posible realizar una división entre 0");
    }

}
