/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practico3;
import java.util.Arrays;

/**
 *
 * @author santi
 */
public class Practico3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = new int[] { 3, 4, 5, 3, 7, 3, 0 };
       //Arrays.toString(arr)

        System.out.println(Arrays.toString(ejercicio11(arr, 3)));
        /* Entrada: v = [3, 4, 5, 3, 7], elemento = 3 Salida: [4, 5, 7] */
    }

    public static int ejercicio11aux(int[] arreglo, int elemento){
        int aux =0;
        for(int i=0; i<arreglo.length; i++){
            if(arreglo[i] == elemento){
                aux++;
            }
        }
        return aux;
    }

    public static int[] ejercicio11(int[] arreglo, int elemento) {
        /* Entrada: v = [3, 4, 5, 3, 7], elemento = 3 Salida: [4, 5, 7] */
        int[] aux = new int[arreglo.length - ejercicio11aux(arreglo, elemento)];
        int posicion =0;
        for(int i=0; i<arreglo.length; i++){
            if(arreglo[i] != elemento){
                aux[posicion] = arreglo[i];
                posicion++;
            }

            
        }
        return aux;

    }
    public static boolean esSimetrico(int[]v){
        for(int i = 0; i < v.length / 2; i++){
            if(v[i] != v[((v.length)-1)-i]){
                return false;
            }
        }
        return true;
    }


}
