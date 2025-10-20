/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg12;

/**
 *
 * @author danielcoello
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
       
        //declaro la variable desde donde empieza a imprimir
        int num = 11;
       
        do {
              if (num % 2 == 0) {  //para verificar que es par
                    System.out.println(num);
              }
              //para incrementar en 1
              num++;
        }
        //hasta que la variable llegue a 133
        while (num <= 133);
        // TODO code application logic here
    }
   
}