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
        ejercicio2();
    }

    public static String ejercicio1() {
        String aux = "El resultado es: ";
        for (int i = 1; i < 26; i++) {
            aux += " ";
            aux += (i * 2) - 1;
        }

        return aux;
    }

    public static String ejercicio2() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        java.util.Scanner scanner2 = new java.util.Scanner(System.in);
        System.out.println("Ingrese un segundo numero: ");
        int numero1 = (int) scanner.nextInt();
        int numero2 = (int) scanner2.nextInt();
        int aux;
        if (numero1 > numero2) {
            aux = numero1;
            numero1 = numero2;
            numero2 = aux;
        }

        String response = "La lista de números pares entre " + numero1 + " y " + numero2 + " es: ";

        if (numero2 % 2 == 0 && numero1 % 2 == 0 && (numero2 - numero1) > 2) {
            --numero2;
        } else if (numero2 - numero1 <= 1) {
            response = ("No hay numeros entre los dos ingresados. El promedio es: " + (numero1 + numero2) / 2);
        }
        int[] numeros = new int[(int) Math.floor((numero2 - numero1) / 2)];
        int j = 0;
        for (int i = numero1 + 1; i < numero2; i++) {

            if (i % 2 == 0) {

                numeros[j] = i;
                ++j;
            }
        }
        for (int i : numeros) {
            response += i + " ";
        }
        System.out.println(response);
        return (response);

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
