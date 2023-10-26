/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_14_ciclo_for;

import java.awt.BorderLayout;

/**
 *
 * @author Alberto
 */
public class EVA2_14_CICLO_FOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //for---> desde
      // se ejecuta dede un punto hasta otro 
      //for (punto de inicio; condicion para el termino; manera de avanzar(o retroceder))
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            System.out.println("-----------------");
        }
        for(int i =9; i >= 0; i--)
            System.out.println(i); 
                    //----------------- 
                    //numeros pares de 0 a 100
                    for(int i = 0; i <=100; i +=2)
                        System.out.print(i+ "-");
    }
    
}
