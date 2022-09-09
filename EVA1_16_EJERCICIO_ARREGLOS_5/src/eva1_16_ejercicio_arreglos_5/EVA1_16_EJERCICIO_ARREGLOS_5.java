/*
 * "
 * "
 */
package eva1_16_ejercicio_arreglos_5;

/**
 * @author Usuario
 */
public class EVA1_16_EJERCICIO_ARREGLOS_5 {

    public static void main(String[] args) {
        int[] arregloDatos = new int[50];
        llenar(arregloDatos);
        imprimir(arregloDatos);
        pares(arregloDatos);
        
    }
    //Fill the original array
    public static void llenar(int[] arregloDatos){
        for (int i = 0; i < arregloDatos.length; i++) {
            arregloDatos[i] = (int) ((Math.random()*100)+1);
        }
    }
    
    //Print the original array
    public static void imprimir(int[] arregloDatos){
        for (int i = 0; i < arregloDatos.length; i++) {
            System.out.print(" [" + arregloDatos[i] + "]");
        }  
    }
    //
    public static void pares(int[] arregloDatos){
        int contador=0;     
        
        for (int i = 0; i < arregloDatos.length; i++) {
            if ((arregloDatos[i] % 2) == 0) {
                contador++;
            } 
        }      
        int[] arregloPares= new int[contador];
        System.out.println("");
        int count=0;
        
        for (int i = 0; i < arregloDatos.length; i++) {
            if ((arregloDatos[i] % 2) == 0) {
               arregloPares[count] = arregloDatos[i];
               count++;
            }          
        }
        for (int i = 0; i < arregloPares.length; i++) {
            System.out.print("["+arregloPares[i]+"] ");
        }
        System.out.println("");
    }
}

    

