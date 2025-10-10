/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg8;

import java.util.Scanner;

/**
 *
 * @author danielcoello
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        // Se pide al usuario que introduzca una cantidad de dinero en euros
        System.out.print("Por favor, indique una cantidad de dinero: ");
        int cantidad = entrada.nextInt();
        
 
        // Se calculan los billetes y monedas necesarios de cada tipo
        int billetes50 = cantidad / 50;
        cantidad %= 50;

        int billetes20 = cantidad / 20;
        cantidad %= 20;

        int billetes10 = cantidad / 10;
        cantidad %= 10;

        int billetes5 = cantidad / 5;
        cantidad %= 5;

        int monedas2 = cantidad / 2;
        cantidad %= 2;

        int monedas1 = cantidad;

         // Se muestra el resultado final solo para los billetes y monedas 
        System.out.println();
        System.out.println("Descomposición:");
        if (billetes50 > 0) {
            System.out.println("Billetes de 50: " + billetes50);
        }
        if (billetes20 > 0) {
            System.out.println("Billetes de 20: " + billetes20);
        }
        if (billetes10 > 0) {
            System.out.println("Billetes de 10: " + billetes10);
        }
        if (billetes5 > 0) {
            System.out.println("Billetes de 5: " + billetes5);
        }
        if (monedas2 > 0) {
            System.out.println("Monedas de 2 euros: " + monedas2);
        }
        if (monedas1 > 0) {
            System.out.println("Monedas de 1 euro: " + monedas1);
        }
    }
}