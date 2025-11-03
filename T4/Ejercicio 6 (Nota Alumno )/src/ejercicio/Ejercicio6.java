/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio;
import java.util.Scanner;


/**
 *
 * @author danielcoello
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //Atributo scanner

        System.out.print("Introduce la nota del alumno (0 a 10): "); //Sout para pedir notaa
        int nota = entrada.nextInt();

        Nota.mostrarCalificacion(nota); //LLamamo al m,etodo
    }
}
