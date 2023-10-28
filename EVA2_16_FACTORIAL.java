/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_16_factorial;

import java.util.Scanner;

/**
 *
 * @author mayen
 */
public class EVA2_16_FACTORIAL {

    public static void main(String[] args) {
        int factorial= 1;
        int factorial2= 1;
        int numero;
        Scanner input = new Scanner (System.in);
        System.out.println("Introduce el numero:");
        numero = input.nextInt();
        for (int i = 1; i <= numero; i++) {
            System.out.println(i);
            factorial= factorial*i;
                       
        }
        System.out.println("Factorial de " + numero + " es " + factorial);
        System.out.println("----------------");
        for (int i = numero; i >=1; i--) {
            System.out.println(i + " - ");
            factorial2 = factorial2*i;
            
        }
        System.out.println("factorial de " +  numero + " es " + factorial2); 
    }
}
