/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg22;

import java.util.Scanner;
/**
 *
 * @author admin
 */
public class Ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int ladoTri, perimetroTri, areaTri, alturaTri;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Por favor, introduzca la medida de un lado: ");
        ladoTri = entrada.nextInt();
        System.out.println("Por favor, introduzca la altura del triangulo; ");
        alturaTri = entrada.nextInt();
        perimetroTri = ladoTri*3;
        System.out.println("El perimetro del triangulo de lado "+ ladoTri + " es: "+ perimetroTri);
        areaTri = ladoTri*alturaTri/2;
        System.out.println("El area del triangulo de lado "+ ladoTri + " es: "+ areaTri);
    }
    
}
