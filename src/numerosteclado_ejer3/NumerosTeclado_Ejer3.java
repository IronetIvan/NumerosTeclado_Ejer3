/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosteclado_ejer3;
import java.util.*;
/**
 *
 * @author Usuario DAM 1
 */
public class NumerosTeclado_Ejer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 

        int i;
        int[] numeros = new int[10];
        int aux;

        Scanner teclado = new Scanner(System.in);

        for (i = 0; i < numeros.length; i++) {
            System.out.printf("Introduzca elemto " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }

        System.out.println("El array es: ");
        for (i = 0; i < numeros.length; i++) {
            System.out.print("  " + i + "  ");
        }
        System.out.println("\n");

        for (i = 0; i < numeros.length; i++) {

            System.out.print("  " + numeros[i] + "  ");
        }

        System.out.println("\n");

        System.out.println("El array es con los primos es: ");
        for (i = 0; i < numeros.length; i++) {
            System.out.print("  " + i + "  ");
        }
        System.out.println("\n");

        for (i = 0; i < numeros.length; i++) {

            if (numeros[i] % numeros[i] == 0 && numeros[i] % 1 == 0) {
                aux = numeros[1 + i];
                numeros[1 + i] = numeros[i];
                numeros[i] = aux;
            }

            System.out.print("  " + numeros[i] + "  ");
        }
    }

}