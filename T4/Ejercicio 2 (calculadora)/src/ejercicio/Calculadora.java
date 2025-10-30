/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio;

import java.util.Scanner;

/**
 *
 * @author danielcoello
 */

public class Calculadora {

    // Método
    public static void calculadora() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, introduzca un número: ");
        double numero1 = scanner.nextDouble(); //Variable num1º 

        System.out.print("Ahora, introduzca un segundo número: ");
        double numero2 = scanner.nextDouble();//Variable num2º

        double resultado; //Variable que guarda el resultado 
        String operacion; //Variable para la oprecion 

        if (numero1 > 10) {
            resultado = numero1 * numero2;
            operacion = "producto";
        } else {
            resultado = numero1 + numero2;
            operacion = "suma";
        }

        System.out.println("La operación que se realizó es " + operacion +
                           " y el resultado es " + resultado);

        scanner.close();
    }
}