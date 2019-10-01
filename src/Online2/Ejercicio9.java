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
 * Clase en la que se indica si un número ENTERO es par o impar
 */
public class Ejercicio9 {

    /**
     * Método principal de la clase.
     * @param args the command line argument. 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        
        System.out.println("Introduzca un número entero:");
        int n=teclado.nextInt();
        
        if (n%2==0){
            System.out.println("El número introducido es par");
        } else System.out.println("El número introducido es impar");
    }
    
}
