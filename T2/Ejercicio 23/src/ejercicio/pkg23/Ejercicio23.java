/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg23;

import java.util.Scanner;
/**
 *
 * @author admin
 */
public class Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int unidadProd;
        float precioProd, precioTotal;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Introduzca el precio del producto: ");
        precioProd = entrada.nextFloat();
        System.out.println("Introduzca cuantas unidades quiere: ");
        unidadProd = entrada.nextInt();
        precioTotal = unidadProd*precioProd;
        System.out.println("El precio total es " +precioTotal);
    }
    
}
