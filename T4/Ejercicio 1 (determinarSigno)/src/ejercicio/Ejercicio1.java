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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Realiza un programa en JAVA en el cual se le pide al usuario (en el main) un número por teclado

        Scanner scanner = new Scanner(System.in);//Inicializo la variable del scanner 

        System.out.print("Por favor, introduzca un número: "); //Sout para pedir al usuario que introduzca un numero
        double numero = scanner.nextDouble();

        // Llamamos al método que determina si es positivo o negativo
        String resultado = determinarSigno(numero); // String ya que nos devuelve caracteres

        // Mostramos el resultado
        System.out.println("El número introducido es " + resultado + ".");

    }

    // Método que determina si un número es positivo o negativo
    public static String determinarSigno(double num) {
        if (num > 0) {
            return "positivo";
        } else if (num < 0) {
            return "negativo";
        } else {
            return "cero";
        }
    }
}