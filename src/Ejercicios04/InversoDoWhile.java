
package Ejercicios04;

import java.util.Scanner;

/**
 *
 * @author Oriana
 */
public class InversoDoWhile {
     public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        entrada.useDelimiter("\n");
        String palabra = "";
        System.out.println("Ingresa una palabra: ");
        palabra = entrada.next();
        System.out.println("");
        
        System.out.print("El inverso es: ");
        int i=palabra.length();
        do{
            System.out.print(palabra.charAt(i-1));
            i--;
        }while(i>0);
        System.out.println("");
    }
}
