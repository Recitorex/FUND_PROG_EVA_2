/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_28_uso_arreglos;

import java.util.Scanner;

/**
 *
 * @author Alberto
 */
public class EVA2_28_USO_ARREGLOS {

    public static void main(String[] args) {
        int cant;
        int[] califas;// aqui el arreglo no existe 
        Scanner input = new Scanner(System.in);
        System.out.println("Cuantas calificaciones quieres capturar ");
        cant =  input.nextInt();
        //ya sabemos cuanta califas necesitamos, creamos el arreglo
        califas = new int[cant];//creamos el arreglo 
        for (int i = 0; i < cant; i++) {
            System.out.println("Introduce la calificacion: ");
            califas[i] = input.nextInt();
            
        }
          for (int i = 0; i < cant; i++) {
            System.out.print("[ " + califas [i] + "]"); 
            
            
        }
        
      
    }
}
