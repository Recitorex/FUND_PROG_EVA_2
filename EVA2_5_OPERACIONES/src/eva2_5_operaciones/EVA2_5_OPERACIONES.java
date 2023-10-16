/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_5_operaciones;

/**
 *
 * @author Alberto
 */
public class EVA2_5_OPERACIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//OPWEsoe--> simbolo que ejecuta alguna accion        
//SUMA -->+
int suma, val1,val2;
val1=100;
val2=200;
suma= val1+val2;// suma aritemeitca 
System.out.println("SUMA------------------------------");
        System.out.println("La suma es ="+suma);// concatenacion
        //RESTA
        int resta;
        resta= val1-val2;
        System.out.println("RESTA---------------------");
        System.out.println("La resta es = " + resta);
        //MULTIPLICACION-->*
        int multi;
        multi= val1*val2;
        System.out.println("MULTIPLICACION------------------");
        System.out.println("La multiplicacion es = "+ multi);
        //DIVISION --> /
        int division;
        division = val2/val1;
        System.out.println("DIVISION-------------");
        System.out.println("La division es = "+ division);
        val1 =11;
        val2= 2;
        division = val1/val2;
        System.out.println("La division de 11/2 = "+division);
        int residuo= val1%val2;
        System.out.println("El residuo de 11/2 es = "+ residuo);
        //---------------
        double resu = val1/ val2;
        System.out.println("La division de 11/2 es="+resu);
        double val2double= 2;
        resu= val1/val2double;
        System.out.println("La division es 11/2.0 = "+ resu);
       //int resu2 = 11/2.0;// perdidad de informacion
        System.out.println("La division 11/2.0 = "+ resu);
        //Potencia --> no hay operador de potencia 
        double potencia=Math.pow(3, 3);
        System.out.println("POTENCIA------------");
        System.out.println("3 elevado a la 3 = "+ potencia);
        // RAIZ --> NO HAY OPERADOR7
         double raiz =Math.pow(100, 0.5);
                
                 System.out.println("RAIZ-------------");
                 System.out.println("La raiz cuadrada de 100 "+ raiz);
                 //precedencia de operadores
                 int resuOp, x =3, y=2, z= 5;
                 resuOp = (x*z)+ (x*y)/ 2 -(y-z);
                 // (15)+ (6)/2-3
                 //15+3-(-3)
                 // 15+3+3=21
                 System.out.println("EL resultado es = "+ resuOp);
                 // FORMULA GENERAL:
                 double resuform, a=3,b=9,c=3;
                 resuform = ((-b)-Math.pow((b*b)-(4 *a*c), 0.5))/(2*a);
                 System.out.println("El resultado es = " + resuform); 
                                
                         
                         
                 
                         
       
        
                
        
        
        
        
        
    }
    
}
