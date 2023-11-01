/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_24_recorrer.cadena;

import java.util.Scanner;

/**
 *
 * @author Alberto
 */
public class EVA2_24_RECORRERCADENA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String cade;
     Scanner input = new Scanner(System.in);
        System.out.println("Introfuce un texto:");
cade= input.nextLine();
        for (int i = 0; i < cade.length(); i++) {
            System.out.println(cade.charAt(i)); 
            
        }
// TODO code application logic here
    }
    
}
