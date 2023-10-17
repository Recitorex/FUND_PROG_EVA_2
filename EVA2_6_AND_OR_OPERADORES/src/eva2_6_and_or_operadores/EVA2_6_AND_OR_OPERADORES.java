/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_6_and_or_operadores;

import java.util.Scanner;

/**
 *
 * @author Alberto
 */
public class EVA2_6_AND_OR_OPERADORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int califa;  
        Scanner input = new Scanner(System.in);
        System.out.println("Captura la calificacion");
        califa= input.nextInt();
        // vamos a evaluar
        if((califa >=0)&&(califa<=100)){
           
            System.out.println("La calificacion "+ califa + "es valida!!");
            if(califa >=70)
                System.out.println("Acredita!!");
            else  
                System.out.println("No acredita!!");
           
        

    } else 
            System.out.println("La calificacion " + califa + "no es valida");
                    
    
}
}