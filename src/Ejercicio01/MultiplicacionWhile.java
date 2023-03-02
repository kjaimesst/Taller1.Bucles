/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio01;

/**
 *
 * @author Oriana
 */
public class MultiplicacionWhile {
    public static void main(String[] args){   
        int numeroA = (int)(Math.random()*2024);
        int numeroB = (int)(Math.random()*2024);
        System.out.println("Tablas de Multiplicar:");
        System.out.println("Numeros random:");
        System.out.println(numeroA+" - "+numeroB+"\n");  
        int k = 0;

        while(k<=numeroB){
            System.out.println(numeroA+"x"+k+"="+numeroA*k);
            k++;
        }
    }
}
