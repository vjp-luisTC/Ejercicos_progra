/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg9;

import java.util.Scanner;

/**
 *
 * @author danielcoello
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);

        System.out.print("Por favor, introduzca el primer número: ");
        int a = entrada.nextInt();

        System.out.print("Ahora, introduzca un segundo número: ");
        int b = entrada.nextInt();

        System.out.print("Introduzca el tercer número: ");
        int c = entrada.nextInt();

        System.out.print("Por último, introduzca un cuarto número: ");
        int d = entrada.nextInt();

        // Ordenar los números de menor a mayor 
	//Cada if compara dos números y, si están desordenados, los intercambia.

        int temp; // temp se usa como variable temporal para intercambiar valores.

        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }
        if (a > c) {
            temp = a;
            a = c;
            c = temp;
        }
        if (a > d) {
            temp = a;
            a = d;
            d = temp;
        }
        if (b > c) {
            temp = b;
            b = c;
            c = temp;
        }
        if (b > d) {
            temp = b;
            b = d;
            d = temp;
        }
        if (c > d) {
            temp = c;
            c = d;
            d = temp;
        }

        System.out.println("El orden de los números introducidos es el "
                + a + " - " + b + " - " + c + " - " + d);
    }
}