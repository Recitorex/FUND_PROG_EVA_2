/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva_2_31_uso_arreglos_2;

import java.util.Scanner;

/**
 *
 * @author Alberto
 */
public class EVA_2_31_USO_ARREGLOS_2 {

    public static void main(String[] args) {
        //GENERAR UN ARREGLO TAMAÑO 15 
        //LLENARLO CON VALORES ALEATORIOS: 0-99
        int[] arreglo = new int [15];
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i]=  (int)(Math.random() * 100);
            
        }
        for (int i = 0; i < 10; i++) {
            System.out.print("[" + arreglo[i] + "]");
            
        }
        System.out.println("");
        System.out.println("¿Que valor necesitas");
        Scanner input = new Scanner(System.in);
        int valor = input.nextInt();
        int posi = -1;
        //busqueda
        for (int i = 0; i < arreglo.length; i++) {
            if(valor== arreglo[i]){
                posi=i;
              
                break;
            }
            
             
            }
        if(posi != -1)
            System.out.println("El valor est en la posicion " + posi); 
        else 
            System.out.println("Valor no encontrado ");
            
                
            
        }
    }

