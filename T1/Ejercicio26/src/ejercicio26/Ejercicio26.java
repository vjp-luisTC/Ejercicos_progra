/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio26;

import java.util.Scanner;

/**
 *
 * @author danielcoello
 */
public class Ejercicio26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

      // Declaro las variables
        int num;
        int cifra1;
        int cifra2;
        int cifra3;
        int cifra4;
       
       
        // Declaro el Scanner
        Scanner entrada = new Scanner(System.in);
       
        // Pido el numero al usuario
        System.out.println("Por favor, introduzca un número de 4 cifras: ");
        num = entrada.nextInt();
       
        // Utilizo el modulo y la division para ir descomponiendo el numero
        cifra1 = num / 1000;
        System.out.println("La primera cifra es:  " + cifra1);
       
        cifra2 = (num / 100) % 10;
        System.out.println("La primera cifra es:  " + cifra2);
       
        cifra3 = (num / 10) % 10;
        System.out.println("La primera cifra es:  " + cifra3);
       
        cifra4 = num % 10;
        System.out.println("La primera cifra es:  " + cifra4);
    }

}
