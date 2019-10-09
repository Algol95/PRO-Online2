/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.¨
 */
package Online2;

/**
 * Se importa las clases del paquete java.util
 */
import java.util.*;

/**
 * Clase en la que se calcula el paso de pulgadas a centimetros.
 *
 * @author Ángel Miguel Cubino Aragón
 * @version 1.0
 *
 * Una pulgada es el equivalente a 2,54 cm.
 */
public class Ejercicio1 {

    /**
     * Método principal de la clase.
     *
     * @param args the command line arguments.
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca el número de pulgadas que desea convertir:");

        double pulg = teclado.nextDouble();

        System.out.print(pulg + " pulgadas son ");
        System.out.printf("%1.2f", pulg * 2.54);
        System.out.println(" centimetros.");
    }

}
