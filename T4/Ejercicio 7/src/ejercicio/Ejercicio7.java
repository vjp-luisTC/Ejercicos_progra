/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio;
import java.util.Scanner;

/**
 *
 * @author danielcoello
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Programa donde el usuario introduzca cuatro números enteros desde el main.
        // despues enviar esos números a un método que los muestre ordenados de menor a mayor.

        Scanner entrada = new Scanner(System.in); //Atributo scanner

        System.out.println("Introduzca el 1º numero :");
        int num1 = entrada.nextInt();
        
        
        System.out.println("Imtroduzca el 2º numero :");
        int num2 = entrada.nextInt();
        
        System.out.println("Imtroduzca el 3º numero :");
        int num3 = entrada.nextInt();
        
        System.out.println("Imtroduzca el 4º numero :");
        int num4 = entrada.nextInt();

    }

}
