/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg24;

import java.util.Scanner;
/**
 *
 * @author admin
 */
public class Ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float notaProg, notaLM, notaBD, notaED, notaSI, notaFOL, notaMedia;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Introduzca su nota de programacion: ");
        notaProg = entrada.nextFloat();
        System.out.println("Introduzca su nota de lenguaje de marcas: ");
        notaLM = entrada.nextFloat();
        System.out.println("Introduzca su nota de bases de datos: ");
        notaBD = entrada.nextFloat();
        System.out.println("Introduzca su nota de entornos de desarrollo: ");
        notaED = entrada.nextFloat();
        System.out.println("Introduzca su nota de sistemas informaticos: ");
        notaSI = entrada.nextFloat();
        System.out.println("Introduzca su nota de FOL: ");
        notaFOL = entrada.nextFloat();
        notaMedia = (notaProg + notaLM + notaBD + notaED + notaSI + notaFOL) / 6;
        System.out.println("Su nota media es " + notaMedia);
    }
    
}
