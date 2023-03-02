package Ejercicios03;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Oriana
 */
public class TiendaWhile {
    


    private static ArrayList<Articulos> myArticulos = new ArrayList<>();
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        entrada.useDelimiter("\n");
        int numero = (int)(Math.random()*23+1);
        String aux1, aux2, aux3;
        int i=0;
        while(i<numero){
            aux2="a"; aux3="a";
            System.out.println("Producto "+(i+1)+": ");
            System.out.print("Nombre: ");
            aux1 = entrada.next();
            while(!EsNumero(aux2)){
                System.out.print("Cantidad: ");
                aux2 = entrada.next();
            }
            while(!EsNumero(aux3)){
                System.out.print("Precio: ");
                aux3 = entrada.next();
            }
            int num1;
            double num2;
            num1=Integer.parseInt(aux2);
            num2=Double.parseDouble(aux3);
            Articulos aux4 = new Articulos(aux1,num1,num2);
            myArticulos.add(aux4);
            i++;
        }
        
        System.out.println("Total: ");
        i=0;
        while(i<numero){
            System.out.println(myArticulos.get(i).getNombre()+"\t\tx"+myArticulos.get(i).getCantidad()+"\t$$: "+myArticulos.get(i).getPrecio());            
            i++;
        }
        
    }
    public static boolean EsNumero(String text) {
        int n;
        try {
          n=Integer.parseInt(text);
          return true;
        } catch (NumberFormatException ex) {
           return false;
        }
    
    }
}


