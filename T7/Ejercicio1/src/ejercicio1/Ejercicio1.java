/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import java.util.Scanner;//Importamos scanner 

/**
 *
 * @author danielcoello
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Inicializamos el array para guardar los 10 num  
        int[] array = new int[10];

        //LLamamos a los metodos en el main 
        pedirNumeros(array);
        mostrarPares(array);
    }

    //Metod para pedir num
    public static void pedirNumeros(int array[]) {
        Scanner scanner = new Scanner(System.in);
        int i;
        System.out.println("Vamos a rellenar el array de 10 posiciones. ");
        for (i = 0; i < 10; i++) {
            System.out.println("Intruduz el valor para la posicion " + i + ":");
            array[i] = scanner.nextInt();
        }
    }

    //Metodo para mostrar pares 
    public static void mostrarPares(int array[]) {
        int i;
        for (i = 0; i < 10; i++) {
            if (array[i] % 2 == 0) { //Compobamos que es par 
                System.out.println("Los valores son " + i + " es de : " + array[i]);
            }
        }
    }
}
