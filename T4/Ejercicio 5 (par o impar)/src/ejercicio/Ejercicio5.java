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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // programa  que solicite un número al usuario y determine si es par o impar, 
        //utilizando un método ubicado en una clase de otro paquete.
       
         Scanner scanner = new Scanner(System.in);
         
         System.out.println("Introduzca un numero por favor :");
         
         int numero1 = scanner.nextInt();//Atributos para poedir un  numero al l usuario
         
         
        if (Utilidades.ParImpar.esPar(numero1)) {
            System.out.println("El número " + numero1 + " es par.");
        } else {
            System.out.println("El número " + numero1 + " es impar.");
        }
    } 
}
