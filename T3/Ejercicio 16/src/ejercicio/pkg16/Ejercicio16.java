/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg16;

/**
 *
 * @author alumno
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //declaro e inicializo la variable
        int num = 20;
        int contador = 0;
       
        System.out.println("Los numeros impares existentes entre el 20 y el 160 son: ");
       
        //mientras la variable sea menor o igual que 133
        while (num<=160){
         if (num % 2 != 0) {  //para verificar que es par
                    System.out.println(num);
                     //para incrementar 1
                      contador++;
        }
         num++;
        }
        System.out.println("La cantidad de números impares impresos han sido: " + contador);
       
        // TODO code application logic here
    }
   
}