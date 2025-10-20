/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg4;

import java.util.Scanner;

/**
 *
 * @author danielcoello
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escribir un algoritmo en JAVA que pida tres
        //números e imprima por pantalla el menor de ellos.
        
         Scanner entrada = new Scanner (System.in);
         
         
        int num1;
        int num2;
        int num3 ; 
        int menor;
                
       // Pedir los tres números
        System.out.print("Introduce el primer número: ");
        num1 = entrada.nextInt();
        
        System.out.print("Introduce el segundo número: ");
        num2 = entrada.nextInt();
        
        System.out.print("Introduce el tercer número: ");
        num3 = entrada.nextInt();

        // Determinar el menor
        menor = num1; // asumimos que el primero es el menor

        if (num2 < menor) {
            menor = num2;
        }
        if (num3 < menor) {
            menor = num3;
        }

        // Imprimir el resultado
        System.out.println("El número menor es: " + menor);
    }
}