/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caritmetica2;

/**
 *
 * @author alumno
 */
public class CAritmetica2 {

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) {
        int dato1; //Declaro la variable entera dato1
        int dato2, resultado; //Declaro, a la vez, dos variables enteras: dato2 y resultado
        int dato3;
       
        dato1 = 20; //Asigno el valor 25 a la variable dato1
        dato2 = 10;
        dato3 = 9;
       
        //Suma
        resultado = dato1 + dato2 + dato3; //Guardo la suma de las dos variables en la variable resultado
        System.out.println(dato1 + " + " + dato2 + " + " + dato3 + "  = " + resultado);
       
        //Resta
        resultado = dato1 - dato2 - dato3;
        System.out.println(dato1 + " - " + dato2 + " - "   + dato3 + " = " + resultado);
       
        //Producto
        resultado = dato1 * dato2 * dato3;
        System.out.println(dato1 + " * " + dato2 + "  *  " + dato3 + " = " +  resultado);
       
        //Cociente
        resultado = dato1 / dato2 / dato3;
        System.out.println(dato1 + " / " + dato2 + " / "  + dato3 + " = " +  resultado);
        // TODO code application logic HERE 
    }
   
}
