/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio;

/**
 *
 * @author danielcoello
 */
public class Utilidades {
    public static void mostrarMenor(int a, int b, int c) { 
// Metodo estático, datos deben entrar por parámetro,no hay atributos (Varibles ) donde guardarlos.
       
     int menor = a;
       
        if (b < menor) {
            menor = b;
        }
        if (c < menor) {
            menor = c;
        }

        System.out.println("El número menor es: " + menor);
    }
    
}
