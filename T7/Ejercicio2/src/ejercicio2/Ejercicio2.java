/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author danielcoello
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] array = new int[7];

        pedirNumeros(array);
        mostrarArray(array);
    }

    //Metodos uno para introducir los datos, otro para mostrar los datos y otro para ntercambiar los datos.
    //Metodo para rellenar array 
    public static void pedirNumeros(int array[]) {
        Scanner scanner = new Scanner(System.in);
        int i;
        System.out.println("Vamos a rellenar el array de 7 posiciones. ");
        for (i = 0; i < 7; i++) {
            System.out.println("Intruduz el valor para la posicion " + i + ":");
            array[i] = scanner.nextInt();
        }
    }
    //Metodo intercambiar datos ????     variable auxxxxxx 

    //Metodo para mostrar datos 
    public static void mostrarArray(int array[]) {
        int i;
        for (i = 0; i < 7; i++) {
            System.out.println("Los valores son " + i + " es de : " + array[i]);
        }
    }
}
