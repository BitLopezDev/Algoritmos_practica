/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practico2;

/**
 *
 * @author santi
 */
public class Practico2 {

    /**
     * PRE: Recibe un arreglo de enteros
     * POS: Devuelve la suma de los elementos del arreglo
     * 
     * @param arreglo
     * @param args    the command line arguments
     */
    public static void main(String[] args) {
        int x = maxValue(new int[] { -1, 2, 3, -4, 5, 6, 7, 15, 8, 9, -10, -5 });
        System.out.println("El máximo es : " + x);

    }

    /**
     * 
     * PRE: Recibe un arreglo de enteros
     * POS: Retorna el máximo valor
     * 
     * @param {int[]} arreglo
     * @return {int}
     */

    public static int maxValue(int[] arreglo) {
        int aux = arreglo[0];
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] > aux) {
                aux = arreglo[i];
            }
        }
        return aux;
    }

}
