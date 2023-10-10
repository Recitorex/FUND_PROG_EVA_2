/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_3_numeros_pares;

import java.util.Scanner;

/**
 *
 * @author Alberto
 */
public class EVA2_3_NUMEROS_PARES {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   int valor,residuo;
   Scanner input = new Scanner(System.in);
        System.out.println("Intoduce el valor a evaluar"); 
   valor=input.nextInt();
  
   residuo = valor%2;//operacion para residui
   if(residuo==0){
       System.out.println("El numero es par");
   }
   else{
       System.out.println("El numero es impar");
   }
    }
    
}
