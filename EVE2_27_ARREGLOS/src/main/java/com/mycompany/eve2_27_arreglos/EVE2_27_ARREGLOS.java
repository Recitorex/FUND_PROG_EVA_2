/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eve2_27_arreglos;

/**
 *
 * @author Alberto
 */
public class EVE2_27_ARREGLOS {

    public static void main(String[] args) {
        //declaramos un arreglo que almacena 10 enteros
        //accseso a los arreglos es aleatorio.
        // se accede a los valores a traves de un INDICE
        // Los valores almacenados tienen una direccion:
        // el primer elemento esta en la posicion 0
        // el ultio en la posicion N - 1, donde N es el tamaño del arreglo 
        int [] arregloEnteros = new int[10];
        //ACCEDER A VALORES EN UN ARREGLO 
        arregloEnteros[0] = 100;
        arregloEnteros[1] = 200;
        arregloEnteros[2] = 300;
        arregloEnteros[3] = 400;
        arregloEnteros[4] = 500;
        arregloEnteros[5] = 600;
        arregloEnteros[6] = 700;
        arregloEnteros[7] = 800;
        arregloEnteros[8] = 900;
        arregloEnteros[9] = 1000;
        System.out.println("Valor en posicion 0: " + arregloEnteros[0]);
        
        String[] arregloCade = new String[5];
        arregloCade[0] = "Hola";
        arregloCade[1] = "";
        arregloCade[2] = "Mundo";
        arregloCade[3] = "";
        arregloCade[4] = "Cruel!!!";
        
        /*String[] arregloCade = {"Hola ", "", "mundo", "", "Cruel!!"}
        */
        int[]arreglo ={5,4,3,2,1};
        System.out.println("Posicion arreglo[3]: " + arreglo[3]); 
    }
}
