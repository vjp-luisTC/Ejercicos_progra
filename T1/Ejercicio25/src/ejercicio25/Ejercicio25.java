/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio25;

import java.util.Scanner;

/**
 *
 * @author danielcoello
 */
public class Ejercicio25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        //Atributos
        int num1;
        int num2;
        int num3;
        int suma;
        int producto;

        System.out.println("Introduce el 1º numero :");
        num1 = entrada.nextInt();
        System.out.println("Introduce el 2º numero : ");
        num2 = entrada.nextInt();
        System.out.println("Introduce el 3º numero:");
        num3 = entrada.nextInt();

        suma = num1 + num2 + num3;
        System.out.println("La suma de los numeros introducidos es : " + suma);

        producto = num1 * num2 * num3;
        System.out.println("El producto de los numeros introducidos es :  " + producto);
    }
}