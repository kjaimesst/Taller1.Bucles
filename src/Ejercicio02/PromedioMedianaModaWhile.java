package Ejercicio02;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Oriana
 */
public class PromedioMedianaModaWhile {

    public static ArrayList<String> listaModas = new ArrayList<>(); 
     public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        int numero = 4;
        int[] registro = new int [numero];
        double aux=0,promedio, mediana, moda=0;
        System.out.println("Promedio, Mediana y Moda");
        System.out.println("Numero random generado: "+numero+"\n");
        System.out.println("Ingrese los numeros:");
        int o=0;
        while(o<numero){
            System.out.print((o+1)+": ");
            registro[o] = entrada.nextInt();
            aux += registro[o];
            o++;
        }
        promedio = aux/numero;
        System.out.println("La media es: "+promedio);
        
        Arrays.sort(registro);
        if(numero%2==0){
            int k = numero/2;
            mediana = (registro[k]+registro[k-1])/2;
        }else{
            int k = (numero-1)/2;
            mediana = registro[k];
        }
        System.out.println("La mediana de la lista es: "+mediana);
        
        int maximoNumRepeticiones= 0;
        int aux2 =0;
        
        o=0;
        while(o<numero){
            int numRepeticiones= 0;
            int anteriorMaxNumRepeticiones = aux2;
            int k=0;
            while(k<numero){
                if(registro[k]==registro[k]){
                    numRepeticiones++;
                }
                if(numRepeticiones>maximoNumRepeticiones){
                    moda= registro[k];
                    maximoNumRepeticiones= numRepeticiones;
                }
                k++;
            }
            if(numRepeticiones>aux2){
                aux2 = numRepeticiones;
            }
            if(numRepeticiones>anteriorMaxNumRepeticiones){
                listaModas.clear();
            }
            if(numRepeticiones==maximoNumRepeticiones && !esIgualModa(registro[k])){
                String numModa = String.valueOf(registro[k]);
                listaModas.add(numModa);
            }
            k++;
        }
        if(listaModas.size()==numero){
            System.out.println("Todos los numeros son diferentes y no existe un numero moda");
        }else{
            System.out.print("La moda es: ");
            for(String modas:listaModas){
                System.out.print(modas+" ");
            }
        }
    }
    public static boolean esIgualModa(int moda){
        String aux3 = String.valueOf(moda);
        boolean r = false;
        int k=0;
        while(k<listaModas.size()){
            if(aux3.equals(listaModas.get(k))){
                r = true;
            }else{
                r=false;
            }
            k++;
        }
        return r;
    }
    
}
