/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_2_if_2;

import java.util.Scanner;

/**
 *
 * @author Alberto
 */
public class EVA2_2_IF_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int valor1,valor2;
        Scanner input= new Scanner(System.in);
      
       
        System.out.println("Introduce valor 1");
        valor1= input.nextInt();
        System.out.println("intruduce el valor 2");
        valor2= input.nextInt();
        if(valor1>valor2){
            System.out.println("El valor mas grande es"+valor1); 
        }
            else{
                    if(valor1==valor2)
                    System.out.println("Ambos valores son iguales");
                    else 
                        System.out.println("El valor mas grande es:"+valor2);
                    
                    }
        
    }
    
}
