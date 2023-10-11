/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_4_bisiesto;

import java.util.Scanner;

/**
 *
 * @author Alberto
 */
public class EVA2_4_BISIESTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int año,residuo;
       Scanner input = new Scanner(System.in);
       System.out.println("Introduce El año a evaluar");
       año=input.nextInt(); 
       residuo=año%4;
       if (residuo==0){// verdad: es divisible entre 4
           residuo= año%100;
           if(residuo==0){
             residuo=año%400;
             if(residuo==0)
                 System.out.println("Es año bisiesto");
             else 
                   System.out.println("El año no es bisiesto");
                 
             
           }
           else 
               System.out.println("Es año bisiesto");
       }
       else
            System.out.println("No es año bisiesto");
    }
    
}
