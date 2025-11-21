package ejercicio;

import java.util.Scanner;

/**
 *
 * @author danielcoello
 */
public class Multiplos {

    public static void main(String[] args) {

        int numero = pedirNumero(); // 1. Pedimos el número
        while (!esMayorQueCero(numero)) { // 2. Validamos que sea > 0
            System.out.println("Error: el número debe ser mayor que 0.");
            numero = pedirNumero();
        }

        mostrarMultiplosDeTres(numero); // 3. Mostramos resultados
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