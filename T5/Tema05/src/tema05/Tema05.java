/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema05;
import java.util.Scanner;
/**
 *
 * @author danielcoello
 */
public class Tema05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // 1. Instancio un objeto del tipo que he creado
        // 1.1. Con constructor parametrizado y estableciendo valores con setters
        
        Coche miCoche = new Coche ();
        System.out.println(miCoche);
        
        miCoche.setEspejos(5);
        System.out.println(miCoche.toString());
        
        System.out.println(miCoche.getEspejos());
        
        miCoche.acelerar();
        
        // 1.2. Con constructor parametrizado, inicializando los atributos
        // con los valores pasados por parámetro
        
        Coche tuCoche = new Coche ("MIchelin","Baja" , 3 );
        System.out.println(tuCoche);
        
        // Esto hace lo mismo que la línea anterior, porque detecta el toString() automáticamente
        System.out.println(tuCoche);
        
        System.out.println(tuCoche.getRuedas());
    }

}
