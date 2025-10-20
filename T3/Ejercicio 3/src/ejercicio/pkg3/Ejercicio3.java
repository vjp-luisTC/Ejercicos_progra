/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg3;
import java.util.Scanner;
/**
 *
 * @author danielcoello
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // programa en JAVA que lea tres números e
        //imprima por pantalla el mayor de ellos.
        //Declaro la variable del scanner 
        Scanner entrada = new Scanner (System.in);
        
        
        //Declaramos variables 
        int primerNumero;
        int segundoNumero;
        int tercerNumero;
        int numeroMayor ; 
        
        
        //Sout 
        System.out.println("Por favor, introduzca el primer numero:");
        primerNumero = entrada.nextInt();
        
        System.out.println("Ahora, introduzca un segundo numero:");
        segundoNumero = entrada.nextInt();
        
        System.out.println("Por último, introduzca un tercer numero:");
        tercerNumero = entrada.nextInt();
        


        // Comparamos los números para encontrar el mayor
        if (primerNumero >= segundoNumero && primerNumero >= tercerNumero) {
            numeroMayor = primerNumero;
        } else if (segundoNumero >= primerNumero && segundoNumero >= tercerNumero) {
            numeroMayor = segundoNumero;
        } else {
            numeroMayor = tercerNumero;
        }
        
        System.out.println("El numero mayor de los introducidos es " + numeroMayor );
                      
    }  
}
