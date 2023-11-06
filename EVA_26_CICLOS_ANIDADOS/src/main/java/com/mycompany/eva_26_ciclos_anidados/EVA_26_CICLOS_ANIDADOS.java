/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva_26_ciclos_anidados;

import java.util.Scanner;

/**
 *
 * @author Alberto
 */
public class EVA_26_CICLOS_ANIDADOS {

    public static void main(String[] args) {
        int nume;
        Scanner input= new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        nume = input.nextInt();
        for (int i = 1; i <= nume; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
                
            }
            System.out.println("");
            
        }
         for (int i = nume; i >=1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
                
            }
             System.out.println(""); 
         }
    }
}
