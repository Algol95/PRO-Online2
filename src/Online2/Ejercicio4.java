/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Online2;

/**
 * Se importa las clases del paquete java.util
 */
import java.util.*;

/**
 * Clase en la que se comprueba si un número es negativo.
 *
 * @author Ángel Miguel Cubino Aragón
 * @version 1.0
 *
 */
public class Ejercicio4 {

    /**
     * Método principal de la clase.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número: ");
        double n = teclado.nextDouble();

        if (n < 0) {
            System.out.println("El número introducido es negativo.");
        }
    }

}
