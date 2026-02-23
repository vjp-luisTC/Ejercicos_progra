/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg23;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author danielcoello
 */
public class Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declaro las variables y el scanner
        int num=0, i;
        Scanner entrada = new Scanner(System.in);
       
        //Creo un do while para que se repita hasta la condicion que sea
        do {
            System.out.println("Introduce un numero mayor que 1:");
           
            //Pruebo para detectar qie el usuario ha introducido algo correcto
            try {
                num = entrada.nextInt();
                if (num <= 1) {
                    System.out.println("Error: el numero debe ser mayor que 1");
                }
            }
            catch(InputMismatchException e){
                System.out.println("Error: debes introducir un numero entero");
                entrada.next();  //Limpiar buffer
            }
           
        } while (num <= 1);
       
        //Utilizo el for para imprimir los numeros
        for (i=1; i <= num; i++){
            System.out.println(i);
            }
       
    }

    }