/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_ejercicio_5;

import java.util.Scanner;

/**
 *
 * @author mayen
 */
public class EVA2_EJERCICIO_5 {

    
    public static void main(String[] args) {

      Scanner input = new Scanner (System.in);
           System.out.println("Introduce la base:");
           int base = input.nextInt();
           System.out.println("Intorduce el exponente:");
           int exponente= input.nextInt();
           int resultado=1;
           for (int i = 0; i < exponente; i++) {
               resultado= resultado*base;
           }
           System.out.println("El resultado de " +  " elevado a " + exponente + " es " + resultado);
          
       
    }
} 

