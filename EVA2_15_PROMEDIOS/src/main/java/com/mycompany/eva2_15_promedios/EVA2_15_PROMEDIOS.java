/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_15_promedios;

import java.util.Scanner;

/**
 *
 * @author mayen
 */
public class EVA2_15_PROMEDIOS {

    public static void main(String[] args) {
       int cantcalifas;
       int sumacalifas = 0;
       Scanner input = new Scanner (System.in);
        System.out.println("Captura el numero de calificaciones");
        cantcalifas = input.nextInt();
        for (int i = 1; i <= cantcalifas; i++) {
            System.out.println("Introduce la calificacion");
            int califas = input.nextInt();  //acumulador  
            sumacalifas = sumacalifas + califas;
        }
        double promedio = sumacalifas/(cantcalifas*1.0);
        System.out.println(" El primedio de las calificaciones es " + promedio);
        
              
    }
}
