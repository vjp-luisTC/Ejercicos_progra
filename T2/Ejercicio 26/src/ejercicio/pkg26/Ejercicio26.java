/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg26;

import java.util.Scanner;//Scanner para que el usuario introduzca los datos 

/**
 *
 * @author admin
 */
public class Ejercicio26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //programa en el que le pidas al usuario un número de 4 cifras y
        //muestre por pantalla cada una de las cifras que lo forman.
        
        //Atributo
        int numero, primeraCifra, segundaCifra, terceraCifra, cuartaCifra;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduzca un numero de 4 cifras: ");//Sout para pedir las cifras 
        numero = entrada.nextInt();
        primeraCifra = numero / 1000;
        System.out.println("La primera cifra es: " + primeraCifra);//Sout para pedir la primera  cifra
        segundaCifra = numero % 1000 / 100;
        System.out.println("La segunda cifra es: " + segundaCifra);//Sout para pedir la segunda  cifra
        terceraCifra = numero % 100 / 10;
        System.out.println("La tercera cifra es: " + terceraCifra);//Sout para pedir tercera cifras 
        cuartaCifra = numero % 10;
        System.out.println("La cuarta cifra es: " + cuartaCifra);//Sout para pedir cu cifras 
    }

}
