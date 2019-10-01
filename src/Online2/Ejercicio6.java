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
 *
 * @author Ángel Miguel Cubino Aragón
 * @version 1.0 
 * Clase que da a elegir entre la resta o la suma de dos números.
 */
public class Ejercicio6 {

    /**
     * Método principal de la clase.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca el primer número:");
        double n1 = teclado.nextDouble();
        System.out.println("Introduzca segundo número:");
        double n2 = teclado.nextDouble();

        System.out.println("¿Qué desea hacer?\n1. Sumar\n2. Restar");
        int a = teclado.nextInt();

        switch (a) {

            case 1:
                System.out.println(n1 + " + " + n2 + "=" + (n1 + n2));
                break;
            case 2:
                System.out.println(n1 + "+" + n2 + "=" + (n1 - n2));
                break;
            default:
                System.out.println("La opción introducida no se contempla.");
        }
    }

}
