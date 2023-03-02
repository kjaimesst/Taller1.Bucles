package Ejercicio02;

import java.util.Arrays;

/**
 *
 * @author Oriana
 */
public class PromedioMedianaModaFor {
public class FOR {
         public static void main (String[] args){
         int n_elementos = 47;
         int numerosRandom [] = new int[n_elementos];
         for (int posN = 0; posN < numerosRandom.length; posN++){
             int n = (int) (Math.random() * 48) + 1;
             numerosRandom[posN] =n;
         }
         Arrays.sort(numerosRandom);
         for( int posN = 0; posN < numerosRandom.length; posN++){
             System.out.println(""+ numerosRandom[posN]);
         }
         System.out.println("");
         double promedio = 0.0;
         for( int posP = 0; posP < numerosRandom.length; posP++){
             promedio = promedio + numerosRandom[posP];
         }
         promedio=promedio / numerosRandom.length;
         System.out.println("promedio="+promedio);
         
         int mediana = 0;
         if (numerosRandom.length ==1){
             mediana = numerosRandom[0];
         }else{
             if(numerosRandom.length % 2 == 0){
                 mediana = (numerosRandom[(numerosRandom.length /2) -1] + numerosRandom[(numerosRandom.length /2)]) /2;
             }else{
                 mediana = numerosRandom[numerosRandom.length/2];
             }
         }
         System.out.println("mediana=" + mediana);
         
         int numerosDistintos [] = new int[numerosRandom.length];
         for (int posN = 0; posN < numerosDistintos.length; posN++){
             numerosDistintos[posN] = -1;   
     }
         int posND = 0;
         int posR = 0;
         while (posR < numerosDistintos.length){
             int nr = numerosRandom[posR];
             int contarNumero = 0;
           for (int pos = 0; pos < numerosDistintos.length; pos++){   
               if (nr == numerosDistintos[pos]){
                   contarNumero++;
               }
           } 
           if (contarNumero == 0){
               numerosDistintos[posND] = nr;
               posND++;
           }
           posR++;
         }
         int cuentanumero[] = new int [posND];
         for (int posNL = 0; posNL < posND; posNL++){  
             int nd = numerosDistintos[posNL];
             for (int posCN = 0; posCN < numerosRandom.length; posCN++){
                 if( nd == numerosRandom[posCN]){
                     cuentanumero[posNL]++;
                 }
             }
         }
         int max = Integer.MIN_VALUE;
         int numeroEncontrado = -1;
         for (int posN = 0; posN < cuentanumero.length; posN++){ 
             if( max < cuentanumero[posN]){
                 numeroEncontrado = numerosDistintos[posN];
                 max = cuentanumero[posN];
             }
         }
          int moda = numeroEncontrado;
          System.out.println("moda=" +moda);    
     }
   }
}
