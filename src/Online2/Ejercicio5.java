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
 * Clase que calcula los 10 siguientes números pares a partir del introducido
 * por teclado.
 *
 * @author Ángel Miguel Cubino Aragón
 * @version 1.0
 *
 */
public class Ejercicio5 {

    /**
     * Método principal de la clase.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner teclado = new Scanner(System.in);
        int cont = 0;

        System.out.println("Introduzca un número entero: ");
        int n = teclado.nextInt();

        while (cont != 10) {
            if (n % 2 == 0) {
                cont++;
                System.out.println("Par " + cont + ": " + n);
            }
            n++;
        }
    }

}
