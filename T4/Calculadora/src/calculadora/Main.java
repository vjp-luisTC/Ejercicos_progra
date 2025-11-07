/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 *
 * @author danielcoello
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    //metodo que imprime un saludo
    public static void saludo() {
        System.out.println("Hola mundo");
    }

    //metodo que imprime un mensaje con un dato que recibe por parametro
    public static void saludoConParametro(int num) {
        System.out.println("Hola mundo" + num);
    }

    //metodo que muestra la suma de dos numeros que recibe por parametros
    public static void suma(int num1, int num2) {
        System.out.println("La suma de " + num1 + " + " + num2 + " = " + (num1 + num2));

    }

    //metodo que devuelve la suma de dos numeros que recibe por parametro tipo int
    public static int sumaqueDevuelveElResultado(int num1, int num2) {
        int resultado = num1 + num2;
        return resultado;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int num1;
        int num2;
        double resultado;

      
        num1=Utilidades.pedirNumero();
        num2=Utilidades.pedirNumero();
        

        //mostramos las variables de calculadora
        try {
            resultado = Calculadora.suma(num1, num2);
            System.out.println(num1 + " + " + num2 + " = " + resultado);

            resultado = Calculadora.resta(num1, num2);
            System.out.println(num1 + " - " + num2 + " = " + resultado);

            resultado = Calculadora.multiplicacion(num1, num2);
            System.out.println(num1 + " * " + num2 + " = " + resultado);

            resultado = Calculadora.division(num1, num2);
            System.out.println(num1 + " / " + num2 + " = " + resultado);

            resultado = Calculadora.raizCuadrada(num1);
            System.out.println("La raiz cuadrada de " + num1 + " es " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Ha sucedido una excepcion aritmetica");
        }

        resultado = Calculadora.cuadrado(num1);
        System.out.println("El cuadrado de " + num1 + " es " + resultado);

        resultado = Calculadora.cubo(num1);
        System.out.println("El cubo de " + num1 + " es " + resultado);

        resultado = Calculadora.maximo(num1, num2);
        System.out.println("El resultado es " + resultado);

        resultado = Calculadora.minimo(num1, num2);
        System.out.println("El resultado es " + resultado);

        resultado = Calculadora.alza(num1);
        System.out.println("El resultado es " + resultado);

        resultado = Calculadora.baja(num1);
        System.out.println("El resultado es " + resultado);

        System.out.println("Letra aleatoria: " + Utilidades.Utilidades);

       
    }
}
