/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Alberto
 */
public class EVA2_EJERCICIO2 {

    public static void main(String[] args) {
        int nume, nume1;
        Scanner input = new Scanner(System.in);
        System.out.println("Captura el primer numero");
        nume = input.nextInt();
        System.out.println("Captura el segundo numero");
        nume1 = input.nextInt();
       if((nume>=0)&&(nume1>=0)){
        if(nume<nume1){
            for (int i = nume; i <= nume1; i++) {
                if((i%2)!=0)
                    continue;
                System.out.print(i + " - ");
                
            }
        }else            
            for (int i = nume1; i <= nume; i++) {
                if((i%2)!=0)
                    continue;
                System.out.print(i + " - ");
                
               
            }
    }      else 
            System.out.println("No es un numero valido"); 
       
    }
}
