/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg6;
import java.util.Scanner;
/**
 *
 * @author danielcoello
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declaro la variable
        int nota;

        //declaro el scanner para leer el dato introducido por el usuario
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduzca la nota del alumno");
        nota = entrada.nextInt();

        //creo el switch para cada nota
        switch (nota) {

            case 0, 1, 2, 3, 4 ->  {
                System.out.println("Suspenso");
            }

            case 5, 6 ->  {
                System.out.println("Bien");
            }

            case 7, 8 ->  {
                System.out.println("Notable");
            }

            case 9, 10 ->  {
                System.out.println("Sobresaliente");
            }

            default -> {
                System.out.println("El numero introducido no esta entre el 0 y el 10");
            }

        }

        System.out.println("La calificscion es: " + nota);

        // TODO code application logic here// TODO code application logic here
    }

}
