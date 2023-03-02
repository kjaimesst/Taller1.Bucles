package Ejercicios03;

/**
 *
 * @author Oriana
 */
import java.util.ArrayList;
import java.util.Scanner;
public class TiendaFor {

    private static final ArrayList<Articulos> myArticulos = new ArrayList<>();
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        entrada.useDelimiter("\n");
        int numero = (int)(Math.random()*5+1);
        String aux1, aux2="", aux3="";
                
        System.out.println("Ingresa los articulos a comprar");
        for(int i=0;i<numero;i++){
            System.out.println("Articulo "+(i+1)+": ");
            System.out.print("Nombre del articulo: ");
            aux1 = entrada.next();
            for(int k=0;k<1;k++){
                System.out.print("Cantidad: ");
                aux2 = entrada.next();
                if(!EsNumero(aux2)){
                    k--;
                }
            }
            for(int k=0;k<1;k++){
                System.out.print("Precio: ");
                aux3 = entrada.next();
                if(!EsNumero(aux3)){
                    k--;
                }
            }
            int num1;
            double num2;
            num1=Integer.parseInt(aux2);
            num2=Double.parseDouble(aux3);
            Articulos aux4 = new Articulos(aux1,num1,num2);
            myArticulos.add(aux4);
        }
        
        System.out.println("Total: ");
        for(int i=0;i<numero;i++){
            System.out.println(myArticulos.get(i).getNombre()+"\t\tx"+myArticulos.get(i).getCantidad()+"\t$$: "+myArticulos.get(i).getPrecio());            
        }
        
    }
    public static boolean EsNumero(String text) {
        int o;
        try {
          o=Integer.parseInt(text);
          return true;
        } catch (NumberFormatException ex) {
           return false;
        }
    }
}

