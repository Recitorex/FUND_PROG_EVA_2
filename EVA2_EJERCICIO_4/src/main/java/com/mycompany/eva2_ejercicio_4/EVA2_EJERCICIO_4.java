/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_ejercicio_4;

import java.util.Scanner;

/**
 *
 * @author mayen
 */
public class EVA2_EJERCICIO_4 {

    public static void main(String[] args) {
         Scanner input = new Scanner (System.in);
         String continuar;
         do{
             System.out.println("Captura el numero: ");
             int numero = input.nextInt();
             if (numero>0){
                 System.out.println("El numero es positivo");
             }
             else if(numero<0){
                 System.out.println("El numero es negativo");
             } else {
                 System.out.println("El numero es cero");
             }
             System.out.println("Deseas terminar el programa? (si/no)");
             continuar= input.next();
             
         } while(!continuar.equalsIgnoreCase("si"));
         System.out.println("el programa finalizo correctamente");
    } 
}
