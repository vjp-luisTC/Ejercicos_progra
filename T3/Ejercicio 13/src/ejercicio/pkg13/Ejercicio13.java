/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg13;

/**
 *
 * @author danielcoello
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crea un algoritmo en JAVA que, utilizando un
        //bucle while, imprima los números pares que existen entre el
        //número 11 y el número 133
        
        
        
        int num;//Declaramos variable 
        num = 11;//La inicializamos en 11 el inicio del intervalo 
        
        while (num <=133){ //mientras 11 sea menor o iguala 133 
            if (num % 2 == 0) {  //para verificar que es par
                    System.out.println(num) ; //Se iimprimen por pantalla los numeros pares del intervalo del 11 al 133 
              }
              //para incrementar en 1
              num++; // Se incremeta para que solo se impriman porpantalloa los numeros pares 
        }
    }
}