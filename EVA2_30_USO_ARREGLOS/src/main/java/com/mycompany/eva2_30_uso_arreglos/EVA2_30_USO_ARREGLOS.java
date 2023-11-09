/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_30_uso_arreglos;

import java.util.Scanner;

/**
 *
 * @author Alberto
 */
public class EVA2_30_USO_ARREGLOS {

    public static void main(String[] args) {
        String[] listaProd = new String[10];
        listaProd[0] = "Tacos";
        listaProd[1] = "Tortas";
        listaProd[2] = "Tamales";
        listaProd[3] = "Tlacoyos";
        listaProd[4] = "Tlayudas";
        listaProd[5] = "Tampiqueñas";
        listaProd[6] = "Tortas ahogadas";
        listaProd[7] = "Tchilaquiles";
        listaProd[8] = "T-bone";
        listaProd[9] = "Tripas";
        // si tenemos los datos previamente, se aconseja hacerls asi:
        //String[] listaProd = {tacos,tortas}; //equivalente
        double[] listaPrecios = {20,40,15,50,30,54,60,200,400,10};
        
        System.out.println("----MENU-----");
        for (int i = 0; i < listaProd.length; i++) {
            System.out.println(i + "-" + listaProd[i]+ ": $" + listaPrecios[i]);    
            
        }
        Scanner input= new Scanner(System.in);
        int opc, cant;
        System.out.println("¿Que deseas ordenar?");
        opc = input.nextInt();
        System.out.println("¿Cuantas ordenes?");
        cant = input.nextInt();
        System.out.println("Tu total es de: $" + (cant*listaPrecios[opc])); 
    }
}
