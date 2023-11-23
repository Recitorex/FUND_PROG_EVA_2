/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_ejercicio_7;

import java.util.Scanner;

/**
 *
 * @author mayen
 */
public class EVA2_EJERCICIO_7 {

    public static void main(String[] args) {
      Scanner input = new Scanner (System.in);
      int maxNumber = Integer.MIN_VALUE;
      int minNumber = Integer.MAX_VALUE;
      while(true){
          System.out.println(" Introduce un numero ");
          int numero= input.nextInt();
          if (numero < 0){
              System.out.println("Colocaste el numero correcto");
          break; 
          }
          if(numero > maxNumber ){
              maxNumber = numero;
          
          }
          if (numero <  minNumber){
              minNumber = numero;
              
          }
          System.out.println("El numero mas grande intoducido fue: " + maxNumber );
          System.out.println("El numero mas peque;o introducido fue: " + minNumber);
      }
      

    } //NO ESCUSAS SE ME OLVIDO UNA DISCULPA PROFE
}
