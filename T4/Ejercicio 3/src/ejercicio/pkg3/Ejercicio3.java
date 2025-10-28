/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg3;
import   ejercicio.utilidades.Mayor; // Importamos la clase del otro paquete

import java.util.Scanner;
/**
 *
 * @author danielcoello
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Diseñar un programa en Java que lea tres números en el main y los envíe a un método 
        //(ubicado en otra clase y en otro paquete) que muestre por pantalla el mayor de ellos.
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce el primer número: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Introduce el segundo número: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Introduce el tercer número: ");
        int num3 = scanner.nextInt();
        
        // Llamamos al método de la otra clase
        Mayor.mostrarMayor(num1, num2, num3);
    }
}