/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg14;

/**
 *
 * @author danielcoello
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Implementa un algoritmo en JAVA que,
        //utilizando bucles, imprima los 100 primeros números pares.

        int num = 1; //Declarmos la variable y la inicializamos a 1 

        do {
            if (num % 2 == 0) {  //para verificar que es par
                System.out.println(num);
            }
            //para incrementar en 1
            num++;
        } while (num <= 100); //se incrementa hasta que lllegue a 100
        // TODO code application logic here
    }

}
