/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practico1;

/**
 *
 * @author santi
 */
public class Practico1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // System.out.println("El numero invertido es: " + ejercicio5(1234));
        System.out.println(ejercicio1());
    }

    public static String ejercicio1() {
        String aux = "El resultado es: ";
        for (int i = 1; i < 26; i++) {
            aux+= " ";
            aux += (i * 2) - 1;
        }

        return aux;
    }

    public static String ejercicio5(int valor) {
        String valorString = "" + valor;
        String invertido = "";

        for (int i = valorString.length() - 1; i >= 0; i--) {
            invertido += valorString.charAt(i);
        }

        return invertido;
    }

}
