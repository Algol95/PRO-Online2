/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Online2;
import java.util.*;

/**
 *
 * @author Ángel Miguel Cubino Aragón
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     * Pasar de Pulgadas a Centimetros.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduzca el número de pulgadas que desea convertir");
        
        int pulg=teclado.nextInt();
        
        System.out.println(pulg + " pulgadas son " + pulg*2.54 + " centimetros.");
    }
    
}
