/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_2_5_anio_bisiesto;

import java.util.Scanner;

/**
 *
 * @author Alberto
 */
public class EVA_2_5_ANIO_BISIESTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int year, resi4, resi100, resi400;
               Scanner input = new Scanner(System.in);
               System.out.println("Captura el año");
               year = input.nextInt();
               
               resi4 = year%4;
               resi100 = year%100;
               resi400 = year%400;
               
               if((resi4 == 0)&&((resi100 != 0)||(resi400 ==0)))
                   System.out.println(" El año " +  year + "es bisiesto");
               else 
                   System.out.println("El año" + year + "No es bisiesto");
               
                   //&& operador de Y (and)
                   // || operador de O (or)
                   // ! operador negacion (not)
                   // != operador diferente a  
               
               
               
    }
    
}
