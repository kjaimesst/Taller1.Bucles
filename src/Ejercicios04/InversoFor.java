
package Ejercicios04;

import java.util.Scanner;

/**
 *
 * @author Oriana
 */
public class InversoFor {
     public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        entrada.useDelimiter("\n");
        String palabra = "";
        
        System.out.println("Ingresa una palabra: ");
        palabra = entrada.next();
        System.out.println("");
        
        System.out.print("El inverso de esta palabra es: ");
        for(int i=palabra.length();i>0;i--){
            System.out.print(palabra.charAt(i-1));
        }
        System.out.println("");
    }
}
