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
 * Clase en la que se calcula la suma, resta, multiplicación y división de dos números.
 * 
 * @author Ángel Miguel Cubino Aragón
 * @version 1.0
 * 
 */
public class Ejercicio2 {
    /**
     * Método principal de la clase.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce el primer número:");
        double num1 = teclado.nextDouble();
        System.out.println("Ahora introduzca el segundo número:");
        double num2= teclado.nextDouble();
       
        System.out.print("Suma: " + num1 + " + " + num2 + " = ");
        System.out.printf("%1.2f", num1+num2);
        System.out.print("\nResta: " + num1 + " - " + num2 + " = ");
        System.out.printf("%1.2f", num1-num2);
        System.out.print("\nMultiplicación: " + num1 + " x " + num2 + " = ");
        System.out.printf("%1.2f", num1*num2);
        System.out.print("\nDivisión: " + num1 + " / " + num2 + " = " );
        System.out.printf("%1.2f", num1/num2);
    }
    
}
