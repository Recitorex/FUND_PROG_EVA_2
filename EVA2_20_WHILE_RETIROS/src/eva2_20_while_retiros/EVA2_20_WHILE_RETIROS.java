/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_20_while_retiros;

import java.util.Scanner;

/**
 *
 * @author Alberto
 */
public class EVA2_20_WHILE_RETIROS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int canti= 1000;
        Scanner input = new Scanner(System.in);
        while(canti > 0){// mientra tenga saldo, se puede retirar
            System.out.println("¡cuanto deseas retirar?");
            int retiro = input.nextInt();
            //acumulador
            //canti=canti - retiro 
            canti-= retiro;
            System.out.println("Te quedan $ " + canti + " de saldo"); 
        
        }
    }
    
}
