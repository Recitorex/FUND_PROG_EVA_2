/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_ejercicio_6;

import java.util.Scanner;

/**
 *
 * @author mayen
 */
public class EVA2_EJERCICIO_6 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Introduce un nuemero entero positivo ");
        int numero= input.nextInt();
        if(numero < 0){
            System.out.println("No se admiten numeros negativos");
        }else{ 
            String binario = 
                    Integer.toBinaryString(numero);
            System.out.println("El quivalente en sistema binario de " + numero + " es = " + binario );
            
    }
} 
}