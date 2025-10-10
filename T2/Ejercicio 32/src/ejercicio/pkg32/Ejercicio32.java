/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg32;

import java.util.Scanner;//Scanner para que el usuario introduzca los datos 

/**
 *
 * @author danielcoello
 */
public class Ejercicio32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // programa que dado un importe en euros nos indique número
        //óptimo de billetes de 50, 20, 10 y 5, así como la cantidad sobrante
        //en monedas de 2 y de 1 euro.

        Scanner entrada = new Scanner(System.in);

        System.out.print("Por favor, indique una cantidad de dinero: ");//Indico al usuario que meta los datos.
        int dineroTotal = entrada.nextInt();

        int billetesDe50 = dineroTotal / 50;
        dineroTotal = dineroTotal % 50;

        int billetesDe20 = dineroTotal / 20;
        dineroTotal = dineroTotal % 20;

        int billetesDe10 = dineroTotal / 10;
        dineroTotal = dineroTotal % 10;

        int billetesDe5 = dineroTotal / 5;
        dineroTotal = dineroTotal % 5;

        int monedasDe2 = dineroTotal / 2;
        dineroTotal = dineroTotal % 2;
        
        //Cada vez que usamos % , calculamos lo que sobra d usar esos billetes o monedas.

        int monedasDe1 = dineroTotal; // lo que queda son monedas de 1 euro

        System.out.println("La cantidad se descompone en:");
        System.out.println(billetesDe50 + " billetes de 50 euros");
        System.out.println(billetesDe20 + " billetes de 20 euros");
        System.out.println(billetesDe10 + " billetes de 10 euros");
        System.out.println(billetesDe5 + " billetes de 5 euros");
        System.out.println(monedasDe2 + " monedas de 2 euros");
        System.out.println(monedasDe1 + " monedas de 1 euro");
    }
}