/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio24;

import java.util.Scanner;

/**
 *
 * @author danielcoello
 */
public class Ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        
        //Atributo
        int prog;
        int lmsgi;
        int bbdd;
        int entornos;
        int ssinf;
        int ing;
        int ipe;
        int nota_media;

        System.out.println("Por favor, introduzca la nota de Programación: ");
        prog = entrada.nextInt();
        System.out.println("Introduzca la nota de Lenguajes de Marcas: ");
        lmsgi = entrada.nextInt();
        System.out.println("Introduzca la nota de Bases de Datos: ");
        bbdd = entrada.nextInt();
        System.out.println("Introduzca la nota de Entornos de Desarrollo: ");
        entornos = entrada.nextInt();
        System.out.println("Introduzca la nota de Sistemas Informáticos: ");
        ssinf = entrada.nextInt();
        System.out.println("Introduzca la nota de Inglés Profesional: ");
        ing = entrada.nextInt();
        System.out.println("Por último, introduzca la nota de Itinerario Personal para la Empleabilidad: ");
        ipe = entrada.nextInt();

        nota_media = (prog + lmsgi + bbdd + entornos + ssinf + ing + ipe) / 7;

        System.out.println("Su nota media del curso es de: " + nota_media);
    }
}