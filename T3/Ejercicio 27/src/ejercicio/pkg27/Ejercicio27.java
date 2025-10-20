/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg27;
import java.util.Scanner;
import java.util.InputMismatchException;


/**
 *
 * @author alumno
 */
public class Ejercicio27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          //declaro las variables numero 1 y numero 2 que se pediran al usuario y el resultado de las operaciones.
        int num1, num2, resultadosuma, resultadoresta, resultadomultiplicacion, resultadodivision;
       
         //declaro el scanner
        Scanner entrada =  new Scanner (System.in);
       
        //declaro la variable con la que el usuario va a elegir la opcion, la inicializo a 0 porque sino me da un fallo
        int opcion = 0;
       
        //hago el menu
        do{
       
        //defino el try para que si el usuario introduce una letra en vez de un numero no se pare el programa
        try {
        //le pido al usuario el primer numero
            System.out.println("Introduce el primero numero: ");
            num1 = entrada.nextInt();
       
        //le pido al usuario el segunfo numero
            System.out.println("Introduce el segundo numero: ");
            num2 = entrada.nextInt();
           
            //inicializo las variables de operaciones
        resultadosuma = num1 + num2;
        resultadoresta = num1 - num2;
        resultadomultiplicacion = num1 * num2;
       
            System.out.println("Opcion 1: Suma");
            System.out.println("Opcion 2: Resta");
            System.out.println("Opcion 3: Multiplicacion");
            System.out.println("Opcion 4: Division");
            System.out.println("Opcion 5: Salir");
            System.out.println("Introduce una opcion: ");
            opcion = entrada.nextInt();
            switch (opcion){
                case 1: {
                System.out.println(resultadosuma);
                break;
                }
                case 2: {
                System.out.println(resultadoresta);
                break;
                }
                case 3: {
                System.out.println(resultadomultiplicacion);
                break;
                }
                case 4: {
                    try {
                        resultadodivision = num1 / num2;
                    }
                    catch (ArithmeticException e) {
                        System.out.println("Error " + e.getMessage());
                        resultadodivision = 0;
                    }
                System.out.println(resultadodivision);
                break;
                }
                case 5: {
                break;
                }
                default: {
                System.out.println("Esa opcion no es valida");
                }
           
            }
        } catch (InputMismatchException e) {
            System.out.print("Error, el numero que has introducido no es entero ");
            entrada.nextLine(); // limpiar el buffer del scanner
        }
       
        } while (opcion != 5);
       
    }
    
}
