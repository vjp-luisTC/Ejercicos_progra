/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilidades;

/**
 *
 * @author danielcoello
 */
public class Mayor {

    // Método que recibe tres números y muestra el mayor
    public static void mostrarMayor(int a, int b, int c) {
        int mayor = a; // asumimos que el primero es el mayor
       
        if (b > mayor) {
            mayor = b;
        }
        if (c > mayor) {
            mayor = c;
        }
        System.out.println("El número mayor es: " + mayor);

    }
}
