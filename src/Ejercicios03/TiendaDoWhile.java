
package Ejercicios03;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Oriana
 */
public class TiendaDoWhile {
 
    private static ArrayList<Articulos> myArticulos = new ArrayList<>();
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        entrada.useDelimiter("\n");
        int numero = (int)(Math.random()*5+1);
        String aux1, aux2="", aux3="";
        
        int i=0;
        do{
            System.out.println("Articulo "+(i+1)+": ");
            System.out.print("Nombre: ");
            aux1 = entrada.next();
            do{
                System.out.print("Cantidad: ");
                aux2 = entrada.next();
            }while(!EsNumero(aux2));
            do{
                System.out.print("Precio: ");
                aux3 = entrada.next();
            }while(!EsNumero(aux3));
            int num1;
            double num2;
            num1=Integer.parseInt(aux2);
            num2=Double.parseDouble(aux3);
            Articulos aux4 = new Articulos(aux1,num1,num2);
            myArticulos.add(aux4);
            i++;
        }while(i<numero);
        
        System.out.println("Total: ");
        i=0;
        do{
            System.out.println(myArticulos.get(i).getNombre()+"\t\tx"+myArticulos.get(i).getCantidad()+"\t$$: "+myArticulos.get(i).getPrecio());            
            i++;
        }while(i<numero);
        
    }
    public static boolean EsNumero(String text) {
        int k;
        try {
          k=Integer.parseInt(text);
          return true;
        } catch (NumberFormatException ex) {
           return false;
        }
    }
}