/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg25;

import java.util.Scanner;
/**
 *
 * @author admin
 */
public class Ejercicio25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2, num3;
        int sumaNum, productoNum;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Introduzca el primer numero: ");
        num1 = entrada.nextInt();
        System.out.println("Introduzca el segundo numero: ");
        num2 = entrada.nextInt();
        System.out.println("Introduzca el tercer numero: ");
        num3 = entrada.nextInt();
        sumaNum = num1 + num2 + num3;
        System.out.println("La suma de sus numeros es : " + sumaNum);
        productoNum = num1 * num2 * num3;
        System.out.println("El producto de sus numeros es: " + productoNum);
    }
    
}
