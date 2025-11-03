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
        //Declarar la variables 
        double numero1;
        double numero2;
        double resultado; //Variable que guarda el resultado 
        String operacion; //Variable para la oprecion 

        //Dividir metodo en submetodos 
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, introduzca un número: ");
        numero1 = scanner.nextDouble(); //Variable num1º 

        System.out.print("Ahora, introduzca un segundo número: ");
        numero2 = scanner.nextDouble();//Variable num2º

        if (numero1 > 10) {
            resultado = numero1 * numero2;
            operacion = "producto";
        } else {
            resultado = numero1 + numero2;
            operacion = "suma";
        }

        System.out.println("La operación que se realizó es " + operacion
                + " y el resultado es " + resultado);

    }
}
