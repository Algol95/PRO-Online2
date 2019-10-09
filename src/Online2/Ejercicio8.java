/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Online2;

/**
 * Clase que calcula los 100 siguientes números impares.
 *
 * @author Ángel Miguel Cubino Aragón
 * @version 1.0
 *
 */
public class Ejercicio8 {

    /**
     * Método principal de la clase.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int cont = 0;
        int n = 1;
        while (cont != 100) {
            if (n % 2 != 0) {
                cont++;
                System.out.println("Impar " + cont + ": " + n);
            }
            n++;
        }
    }

}
