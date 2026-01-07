/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

/**
 *
 * @author danielcoello
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Suma suma = new Suma(10, 5);
        Multiplicacion multiplicacion = new Multiplicacion(4, 3);
        Potencia potencia = new Potencia(2, 4);

        suma.realizarOperacion();
        multiplicacion.realizarOperacion();
        potencia.realizarOperacion();
     
        Calculadora calc1 = new Suma(20, 7);
        Calculadora calc2 = new Multiplicacion(6, 5);
        Calculadora calc3 = new Potencia(3, 3);

        calc1.realizarOperacion();
        calc2.realizarOperacion();
        calc3.realizarOperacion();
    }
}
