/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg26;

/**
 *
 * @author danielcoello
 */
public class Ejercicio26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declaro las variables
        int suma = 0, i;

        //Declaro un for porque se que el rango es desde 111 hasta 222
        for (i = 111; i <= 222; i++) {
            if ((i % 2) != 0) {
                suma = suma + i;
            }
        }

        //Imprimo el resultado
        System.out.println("La suma de los numeros es: " + suma);

    }
}
