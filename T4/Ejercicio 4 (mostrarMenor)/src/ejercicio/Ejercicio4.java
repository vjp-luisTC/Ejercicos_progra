/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio;

import java.util.Scanner;//Impoetaos scanner 

/**
 *
 * @author danielcoello
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escribir un programa en Java que pida tres números en el main y los pase a un método, 
        //ubicado en otra clase del mismo paquete, que muestre por pantalla el menor de ellos.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");//Sout para pedir 1º num al usuario
        int numero1 = scanner.nextInt();//Atributos para el 1º numero del usuario

        System.out.print("Introduce el segundo número: ");//Sout para pedir 2º num ...
        int numero2 = scanner.nextInt();//Atributos  para el 2º numero del usuario

        System.out.print("Introduce el tercer número: ");//Sout para pedir 3º num ...
        int numero3 = scanner.nextInt();//Atributo  para el 3º numero del usuario

        // Llamada al método de la otra clase
        Utilidades.mostrarMenor(numero1, numero2, numero3);//Llamamos al metodo que ordena los numeros 
    }
}
