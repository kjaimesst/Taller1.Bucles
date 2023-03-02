package Ejercicio02;
  import java.util.ArrayList;
  import java.util.Arrays;
  import java.util.Scanner;
/**
 *
 * @author Oriana
 */
public class PromedioMedianaModaDoWhile {
 
    public static ArrayList<String> listaModas = new ArrayList<>();
    
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        int numero = (int)(Math.random()*47+1);
        int[] lista = new int [numero];
        double aux=0,promedio, mediana, moda=0;
        System.out.println("Promedio, Mediana y Moda:");
        
        System.out.println("Ingrese los numeros:");
        int k=0;
        do{
            System.out.print((k+1)+": ");
            lista[k] = entrada.nextInt();
            aux += lista[k];
            k++;
        }while(k<numero);
      
        promedio = aux/numero;
        System.out.println("El promedio es: "+promedio);

        Arrays.sort(lista);
        if(numero%2==0){
            int o = numero/2;
            mediana = (lista[o]+lista[o-1])/2;
        }else{
            int o = (numero-1)/2;
            mediana = lista[o];
        }
        System.out.println("La mediana es: "+mediana);
        
        int maximoNumRepeticiones= 0;
        int aux2 =0;
    
        k=0;
        do{
            int numRepeticiones= 0;
            int anteriorMaxNumRepeticiones = aux2;
            int o=0;
            do{  if(lista[o]==lista[o]){
                    numRepeticiones++;
                }
                if(numRepeticiones>maximoNumRepeticiones){
                    moda= lista[k];
                    maximoNumRepeticiones= numRepeticiones;
                }
                o++;
            }while(k<numero);
    
            if(numRepeticiones>aux2){
                aux2 = numRepeticiones;
            }
            if(numRepeticiones>anteriorMaxNumRepeticiones){
                listaModas.clear();
            }
            if(numRepeticiones==maximoNumRepeticiones && !esIgualModa(lista[k])){
                String numModa = String.valueOf(lista[k]);
                listaModas.add(numModa);
            }
            k++;
        }while(k<numero);
        
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
        
        if(listaModas.isEmpty()){
            return r;
        }else{
            do{
                if(aux3.equals(listaModas.get(k))){
                    r = true;
                }else{
                    r=false;
                }
                k++;
            }while(k<listaModas.size());
        
            return r;
        }
        
    }
    
}

