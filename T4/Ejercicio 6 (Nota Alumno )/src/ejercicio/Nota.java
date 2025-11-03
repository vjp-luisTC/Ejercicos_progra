/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio;

/**
 *
 * @author danielcoello
 */
public class Nota {

    //Metodo para mostrar la calificacion
    public static void mostrarCalificacion(int nota) {
        if (nota < 0 || nota > 10) { // Si la nota es menor que 0 o mayor que 10  error
            System.out.println(" Error: la  nota debe estar entre 0 y 10.");
        } else if (nota <= 4) { // menons o iguales a 4 
            System.out.println(" Suspenso "); // Sout menons o iguales a 4 suspenso 
        } else if (nota <= 6) {//menons o iguales a 6 Bien
            System.out.println(" Bien "); // Sout menons o iguales a 6 Bien
        } else if (nota <= 8) { //menons o iguales a 8  NOtable
            System.out.println(" Notable ");// Sout menos o iguales a 8  NOtable
        } else {
            System.out.println(" Sobresaliente " ); //Los demas que no cumplan esas conciones 
        }
    }
}