/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_12_califas_eua;

import java.util.Scanner;

/**
 *
 * @author Alberto
 */
public class EVA2_12_CALIFAS_EUA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int califa;
               System.out.println("Captura tu calificacion"); 
        Scanner input = new Scanner(System.in);
                
                califa=input.nextInt();
             if((califa<=100)&&(califa>=90))
                 System.out.println("La calificacion es una A");
                 if((califa<=89)&&(califa>=80))
                     System.out.println("La calificacion es una B");
                 if((califa<=79)&&(califa>=70))
                     System.out.println("La calificacion es una C");
                 if((califa<=69)&&(califa>=60))
                     System.out.println("La calificacion es una D");
                 if((califa<60))
                     System.out.println("La calificacion es una F");
                 
              
                       
        
    }
    
}
