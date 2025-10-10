/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg1;

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
        // TODO code application logic here

        //declaro la variable
        int numero;

        //declaro el scanner para leer el dato introducido por el usuario
        Scanner entrada = new Scanner(System.in);

        System.out.println("Porfavor introduzca un numero");
        numero = entrada.nextInt();

        if (numero >= 0) {
            System.out.println("El numero introducido es positivo");
        } else {
            System.out.println("El numero introducido es negativo");
        }
        // TODO code application logic here
    }

}
