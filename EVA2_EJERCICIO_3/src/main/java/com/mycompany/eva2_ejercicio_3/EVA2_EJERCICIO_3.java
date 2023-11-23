/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_ejercicio_3;

import java.util.Scanner;

/**
 *
 * @author mayen
 */
public class EVA2_EJERCICIO_3 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Intorduce el numero");
        int numero = input.nextInt();
        int sumatoria = 0;
        for (int i = 1; i <= numero; i++) {
            sumatoria += i;
            
        }
        System.out.println("La sumatoria de los numeros 1 hasta  " + numero + " es " + sumatoria );
        
    }
}
