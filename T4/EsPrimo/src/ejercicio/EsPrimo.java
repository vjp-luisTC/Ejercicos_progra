/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio;
import java.util.Scanner; //Importamos scanner 
/**
 *
 * @author danielcoello
 */
public class EsPrimo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1 = pedirNumero();
       
        boolean resultado = esPrimo(num1);
        if (resultado) {
          //  System.out.println(num1 + " es un número primo.");    cambiale cosas por tu madre
        } else {
           // System.out.println(num1 + " no es un número primo.");
        }
       
        // TODO code application logic here
    }
   
     // Método para pedir un número para comprobar si es primo o no
    public static int pedirNumero() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        return scanner.nextInt();
    }
   
    //metodo para comprobar que el numero introducido es primo
    public static boolean esPrimo(int num1){
    // Los números menores o iguales a 1 no son primos
    if (num1 <= 1) {
        return false;
    }
   
    // Verificamos si tiene divisores distintos de 1 y de sí mismo, si encontramos un divisor, no es primo
    for (int i = 2; i <= Math.sqrt(num1); i++) {
        if (num1 % i == 0) {
            return false;
        }
   
    }return true;
}
}