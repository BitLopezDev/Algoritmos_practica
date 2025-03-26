/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practico3.pkg1;

import java.util.Arrays;
import java.lang.Math;

/**
 *
 * @author santi
 */
public class Practico31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr11 = new int[] { 3, 4, 5, 3, 7, 3, 0 };
        int[] arr6 = new int[] { 1, 2, 3, 5, 1 };
        // Arrays.toString(arr)
        // System.out.println(ejercicio5caso2(arr11));

        /*
         * 01) System.out.println(ejercicio1(arr11));
         * 02) System.out.println(ejercicio2(arr11));
         * 03) System.out.println(ejercicio3(arr11));
         * 04) System.out.println(ejercicio4(arr11));
         * 05)
         * * 01) System.out.println(ejercicio5caso1(arr11));
         * * 02) System.out.println(ejercicio5caso2(arr11));
         * 06) if(ejercicio6(arr6)){System.out.println("Es simetrico");}else{System.out.
         * println("No es simetrico");}
         * 07)
         * 11) System.out.println(Arrays.toString(ejercicio11(arr11, 3)));
         */

    }

    public static boolean ejercicio6(int[] arr) {
        int start1, end1, middle, start2, end2;
        start1 = 0;
        end2 = arr.length - 1;
        if (arr.length % 2 == 0) {
            middle = (arr.length / 2) - 1;
            // -1 porque array empieza en 0
            end1 = middle;
            start2 = middle + 1;

        } else {
            middle = (int) Math.floor(arr.length / 2);
            start2 = middle++;
            end1 = middle - 1;
        }
        int aux1 = 0;
        int aux2 = 0;
        for (int i = start1; i <= end1; i++) {
            aux1 *= 10;
            aux1 += arr[i];

        }
        for (int i = end2; i >= start2; i--) {
            aux2 *= 10;
            aux2 += arr[i];

        }
        if (aux1 == aux2) {
            return true;
        }

        return false;
    }

    /**
     * PRE: No ordenado
     * POST: máximo valor del arreglo
     * 
     * @param arr
     * @return
     */

    public static int ejercicio5caso1(int[] arr) {
        int aux = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > aux) {
                aux = arr[i];
            }
        }

        return aux;

    }

    public static int ejercicio5caso2(int[] arr) {
        return arr[arr.length - 1];
    }

    public static String ejercicio4(int[] arr) {
        String saux = "";
        for (int i = 0; i < arr.length; i += 2) {
            saux += arr[i] + "-";
        }
        saux = saux.substring(0, saux.length() - 1);
        return saux;

    }

    public static String ejercicio3(int[] arr) {
        String saux = "";

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                saux += arr[i] + "-";
            }

        }
        saux = saux.substring(0, saux.length() - 1);
        return saux;

    }

    public static double ejercicio2(int[] arr) {
        double aux = 0;
        for (int i = 0; i < arr.length; i++) {
            aux += arr[i];
        }

        return aux / arr.length;
    }

    public static String ejercicio1(int[] arr) {
        String aux = "";
        for (int i = 0; i < arr.length; i++) {
            aux += arr[i] + "-";
        }
        aux = aux.substring(0, aux.length() - 1);
        return aux;
    }

    public static int ejercicio11aux(int[] arreglo, int elemento) {
        int aux = 0;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == elemento) {
                aux++;
            }
        }
        return aux;
    }

    public static int[] ejercicio11(int[] arreglo, int elemento) {
        /* Entrada: v = [3, 4, 5, 3, 7], elemento = 3 Salida: [4, 5, 7] */
        int[] aux = new int[arreglo.length - ejercicio11aux(arreglo, elemento)];
        int posicion = 0;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] != elemento) {
                aux[posicion] = arreglo[i];
                posicion++;
            }

        }
        return aux;

    }

    public static boolean esSimetrico(int[] v) {
        for (int i = 0; i < v.length / 2; i++) {
            if (v[i] != v[((v.length) - 1) - i]) {
                return false;
            }
        }
        return true;
    }

}
