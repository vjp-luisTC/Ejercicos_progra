/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora.Utilidades;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author danielcoello
 */
public class Utilidades {
       public static int pedirNumero() {
        int num = 0;
        try {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe un numero:" );
         num = entrada.nextInt();
        } catch(InputMismatchException e) {
            System.out.println("Ha sucedido una excepcion aritmetica");
        }
           
        return num;
   
    }
    public static String letraAleatoria() {
        int numero = (int)(Math.random() * 26) + 97;  // genera un número entre 97 y 122
        String letra = "" + (char)numero;             // convierte el número ASCII en letra
        return letra;
    }
}
