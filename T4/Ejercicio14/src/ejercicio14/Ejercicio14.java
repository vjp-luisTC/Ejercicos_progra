/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14;
import java.util.Scanner;
/**
 *
 * @author danielcoello
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // 1. Pedimos el número al usuario y validamos que sea > 0
          int numero = pedirNumero();
        while (!esMayorQueCero(numero)) {
            System.out.println("Error: el número debe ser mayor que 0.");
            numero = pedirNumero();
        }
        // 3. Mostramos los resultados
        mostrarMultiplosDeTres(numero);
    }

    // Método para pedir un número al usuario
    public static int pedirNumero() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número mayor que 0: ");
        return scanner.nextInt();
    }

    // Método para comprobar que el número es mayor que 0
    public static boolean esMayorQueCero(int numero) {
        return numero > 0;
    }

    // Método que calcula y muestra los múltiplos de 3 entre 1 y el número introducido
    public static void mostrarMultiplosDeTres(int limite) {
        int contador = 0;
        System.out.println("Los múltiplos de 3 entre 1 y " + limite + " son:");
        for (int i = 1; i <= limite; i++) {
            if (i % 3 == 0) {
                System.out.println(i + " ");
                contador++;
            }
        }
        System.out.println("Total de múltiplos de 3 encontrados: " + contador);
    }
}