/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg21;
import java.util.Scanner;

/**
 *
 * @author danielcoello
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //Declaramos las variable 
        Scanner  entrada = new Scanner (System.in );
        int  num1;  //Declaramos la 1º variable 
        System.out.println("Por favor, introduzca un número:");// Imprimo por pantalla que el usuario introduzca el 1º número 
        num1 = entrada.nextInt ();
        
        int num2 ; //Declaramos la 2º variable 
        System.out.println("Por favor, introduzca un número:");// Imprimo por pantalla que el usuario introduzca el 1º número 
        num2 = entrada.nextInt() ;
        float  resultado ; //Declaramos la variable para el 1º resultado
       
         try {     // Ponemos try para el que el programa controle los errores   
               resultado = num1 / num2 ;     
        }
         catch (ArithmeticException e) { //  Ponemos cath para que tenga encuenta los errores 
                  System.out.print("Error" + e.getMessage () ); //Imprimos por pantalla el error ArithmeticExpection 
                  resultado =0;
                  
         
         }
         System.out.println(" ") ;// Espacio
         System.out.println("Primer resultado " + resultado ) ; // Imprimimos por pantalla el primer resultado1 
    }   
}