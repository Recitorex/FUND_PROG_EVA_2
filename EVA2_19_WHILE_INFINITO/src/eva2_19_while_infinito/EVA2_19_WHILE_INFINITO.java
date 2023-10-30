/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_19_while_infinito;

import java.util.Scanner;

/**
 *
 * @author Alberto
 */
public class EVA2_19_WHILE_INFINITO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nume = 100;
        int captu = 0;
        Scanner input = new Scanner(System.in);
        
        
        while(true){// ciclo infinito, por si solo, nunca se va a detener
            System.out.println("Inroduce un numero:");
            captu = input.nextInt();
            if(captu== nume){
                System.out.println("Adivinaste");
                break;//romper --> detiene la ejecucion del ciclo 
            }
        }
        // TODO code application logic here
    }
    
}
