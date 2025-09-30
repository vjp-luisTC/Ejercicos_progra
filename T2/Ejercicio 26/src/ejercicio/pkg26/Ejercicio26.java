/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg26;

import java.util.Scanner;
/**
 *
 * @author admin
 */
public class Ejercicio26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero, primeraCifra, segundaCifra, terceraCifra, cuartaCifra;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Introduzca un numero de 4 cifras: ");
        numero = entrada.nextInt();
        primeraCifra = numero / 1000 ;
        System.out.println("La primera cifra es: " + primeraCifra);
        segundaCifra = numero % 1000 / 100 ;
        System.out.println("La segunda cifra es: " + segundaCifra);
        terceraCifra = numero % 100 / 10;
        System.out.println("La tercera cifra es: " + terceraCifra);
        cuartaCifra = numero % 10;
        System.out.println("La cuarta cifra es: " + cuartaCifra);
    }
    
}
