/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio01;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Implementa un algoritmo en JAVA que le pida al usuario un número por teclado. 
        
        int numero ;
         
        System.out.println("Por favor, introduzca un numero:");
        
        Scanner entrada = new Scanner  (System.in); 
        numero = entrada.nextInt() ; 
        
        if (numero >0){ // Cuando el numero introducido es mas que cero es positivo
              System.out.println("El numero es positivo ");
        } else  //`Pero i el numero initroducido es menos sera  negativo 
        System.out.println("El numero intoducicdo es negrativo:");
         }
    
}
