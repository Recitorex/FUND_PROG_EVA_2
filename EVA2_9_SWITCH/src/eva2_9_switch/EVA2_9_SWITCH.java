/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_9_switch;

import java.util.Scanner;

/**
 *
 * @author Alberto
 */
public class EVA2_9_SWITCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int mes; 
        Scanner input = new Scanner(System.in);
                 System.out.println("Captura el numero del mes");
                 mes = input.nextInt(); 
                 
                 
                 switch(mes){
                     case 1:
                         
                         System.out.println("ENERO");
                         break; // TERMINA LA EJEUCION DEL SWITCH
                     case 2:
                         
                         System.out.println("FEBRERO");
                         break;
                     case 3:
                         
                         System.out.println("MARZO");
                         break;
                     case 4:
                         
                         System.out.println("ABRIL");
                         break;
                     case 5:
                         
                         System.out.println("MAYO");
                         break;
                     case 6:
                         
                         System.out.println("JUNIO");
                         break;
                     case 7:
                         
                         System.out.println("JULIO");
                         break;
                     case 8:
                         
                         System.out.println("AGOSTO");
                         break;
                     case 9:
                         
                         System.out.println("SEPTIEMBRE");
                         break;
                     case 10:
                         
                         System.out.println("OCTUBRE");
                         break;
                     case 11:
                         
                         System.out.println("NOCIEMBRE");
                         break;
                     case 12:
                         
                         System.out.println("DICIEMBRE");
                         break;
                     default: 
                         System.out.println(" El numero " + mes + " No es un mes valido ");
                 
                 }
    }
    
}
