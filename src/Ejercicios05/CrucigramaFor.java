package Ejercicios05;

import java.util.Scanner;

/**
 *
 * @author Oriana
 */
public class CrucigramaFor {
     public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        String[] palabras = new String [5];
        for (int i= 0; i<palabras.length; i++){
            System.out.println("Ingresa las palabras:" + (i + 1)+ ":");
            palabras[i] = entrada.nextLine();
        }
        for(int i = 0; i <palabras.length; i++){
            System.out.println("Palabra Raiz:" + palabras[i]);
            boolean[] letraAjustada = new boolean[palabras[i].length()];
            for(int j=0; j < palabras.length; j++){
                if(i == j)
                    continue;
            for(int k = 0; k < palabras[j].length(); k++){
                char letra = palabras [j].charAt(k);
                int index= palabras[i].indexOf(letra);
                if(index != -1&& !letraAjustada[index]){
                    letraAjustada[index] = true;
                    System.out.println(letra+ "Encaja con" +palabras[j]);
                    break;
                }           
            }
            }
        }
     }
}
          

