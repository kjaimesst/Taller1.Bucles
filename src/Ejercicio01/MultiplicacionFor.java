/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio01;

/**
 *
 * @author Oriana
 */

public class MultiplicacionFor {
     public static void main(String[] args) {
        System.out.println("Tablas de Multiplicar:");    
        int numeroA = (int)(Math.random()*2024);
        int numeroB = (int)(Math.random()*2024);
        System.out.println("Numeros random:");
        System.out.println(numeroA+" - "+numeroB+"\n");
        for(int k=0;k<=numeroB;k++){
            System.out.println(numeroA+"x"+k+"="+numeroA*k);
        }
    }
}