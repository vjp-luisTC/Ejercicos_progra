/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

/**
 *
 * @author danielcoello
 */
public class Calculadora {

      /**
     * metodo resta dos numero pasados por parametro
     * @param num1
     * @param num2
     * @return la resta de dos numeros
     */
    public static int resta (int num1, int num2) {
    return num1 - num2;
    }
   
    /**
     * metodo que suma dos numeros pasados por parametro
     * @param num1
     * @param num2
     * @return  la suma de dos numeros
     */
    public static int suma (int num1, int num2) {
        int resultado = num1 + num2;
        return resultado;
    }
   
    /**
     * metodo que multiplica dos numero pasados por parametro
     * @param num1
     * @param num2
     * @return  la multiplicacion de dos numero
     */
    public static int multiplicacion (int num1, int num2) {
    return num1 * num2;
    }
   
     /**
     * metodo que divide dos numero pasados por parametro
     * @param num1
     * @param num2
     * @return  la division de dos numero
     */
    public static int division (int num1, int num2) {
    return num1 / num2;
    }
   
    /**
     * Metodo que calcula la raiz cuadrada de numero pasado por parametro
     * @param num1
     * @return la raiz cuadrada
     */
    public static double raizCuadrada(int num1){
        return Math.sqrt(num1);
    }
   
    /**
     * Metodo para calcular el cuadrado de un numero pasado por parametro
     * @param num1
     * @return el cuadrado
     */
    public static double cuadrado(int num1) {
     return Math.pow(num1, 2);
    }
   
    /**
     * Metodo para calcular el cubo de un numero pasado por parametro
     * @param num1
     * @return el cubo
     */
    public static double cubo(int num1) {
     return Math.pow(num1, 3);
    }
     
    /**
     * Para calcular el maximo de numeros pasados por parametro
     * @param num1
     * @param num2
     * @return el maximo
     */
    public static double maximo(int num1, int num2) {
     return Math.max(num1, num2);
    }
   
    /**
     * Para calcular el minimo pasado por parametros
     * @param num1
     * @param num2
     * @return El minimo
     */
    public static double minimo(int num1, int num2) {
     return Math.min(num1, num2);
    }
   
    /**
     * Para calcular al alza pasado por parametros
     * @param num1
     * @return  el alza
     */
    public static double alza(int num1) {
     return Math.ceil(num1);
    }
   
    /**
     * Para calcular a la baja pasado por parametros
     * @param num1
     * @return a la baja
     */
    public static double baja(int num1) {
     return Math.floor(num1);
    }
}
