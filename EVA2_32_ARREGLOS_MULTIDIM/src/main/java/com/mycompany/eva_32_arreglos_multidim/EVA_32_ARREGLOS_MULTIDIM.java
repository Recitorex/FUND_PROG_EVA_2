/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva_32_arreglos_multidim;

/**
 *
 * @author Alberto
 */
public class EVA_32_ARREGLOS_MULTIDIM {

    public static void main(String[] args) {
        int[][] matriz = new int [3][4];
        //poner datos manuales
        //Scanner input = new Scanner(system.in);
    matriz[1][3] = 100; 
        System.out.println("matriz[1][3] = " + matriz[1][3]);
        //-------------------
        System.out.println(matriz.length);
        //llenar con valores aleatorios la matriz:
        //filas  -- primer dimension
        for (int i = 0; i < matriz.length; i++) {
            //por cada fila, debo recorrer cada columna 
            //columnas 
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int)(Math.random()* 100);    
            }
        }
            for (int i = 0; i < matriz.length; i++) {
            //por cada fila, debo recorrer cada columna 
            //columnas 
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("[" + matriz[i][j] + "]");  
            }
                System.out.println(""); 
        }
    }
    
}
