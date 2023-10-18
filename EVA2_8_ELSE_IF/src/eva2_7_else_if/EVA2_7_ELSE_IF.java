/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_7_else_if;

import java.util.Scanner;

/**
 *
 * @author Alberto
 */
public class EVA2_7_ELSE_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int mes; 
        Scanner input = new Scanner(System.in);
                 System.out.println("Captura el numero del mes");
                 mes = input.nextInt();
                 //if((mes >=1)&&(mes<=12)){// (mes>0)&&(mes<13)
                     //System.out.println( "El numero " + mes + " es un mes  valido");
                     if(mes ==1)
                         System.out.println("ENERO");
                     else if (mes==2)
                         System.out.println("Febrero");
                     else if (mes==3)
                         System.out.println("Marzo");
                     else if (mes==4)
                         System.out.println("abril");
                     else if (mes==5)
                         System.out.println("Mayo");
                     else if (mes==6)
                         System.out.println("Junio");
                     else if (mes==7)
                         System.out.println("Julio");
                     else if (mes==8)
                         System.out.println("Agosto");
                     else if (mes==9)
                         System.out.println("Septiembre");
                     else if (mes==10)
                         System.out.println("Ovtubre");
                     else if (mes==11)
                         System.out.println("Noviembre");
                     else if (mes==12){
                         System.out.println("Diciembre");
                         System.out.println("Cumple años mi hermana");
                     }else 
                         System.out.println(" El numero " + mes + " No es un mes valido ");
                 }//else 
                  // System.out.println( "El numero "  + mes +  " es un mes invalido");  

    }
    

