/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg2;
import java.util.Scanner;
/**
 *
 * @author danielcoello
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //programa en el que le solicites al usuario 2 números y, si el primer número introducido es mayor que 10, se
        //multipliquen, y en caso contrario que se sumen. Muestra al usuario la
        //operación realizada y el resultado. 
        
        //Declaramos Variables 
        
        int primerNumero;
        int segundoNumero;
        int resultado ;
        String operacion ;
                
        //Declaro la variable del scanner 
        
        Scanner entrada = new Scanner (System.in); 
        
        System.out.println("Por favor introduzca un numero :");
        primerNumero = entrada.nextInt();
        
        System.out.println("Por favor introduzca un segundo numero :");
        segundoNumero = entrada.nextInt();
        
        if (primerNumero > 10 ){
            resultado = primerNumero * segundoNumero;
            operacion = "producto";
        } else {
            resultado = segundoNumero+primerNumero;
            operacion ="suma";
        }
        
        System.out.println("La operacion que se a realizado" + operacion + "y el resultado es :"+ resultado);
    }
    
}
