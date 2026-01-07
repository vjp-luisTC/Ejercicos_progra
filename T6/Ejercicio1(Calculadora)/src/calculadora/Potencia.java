/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 *
 * @author danielcoello
 */
public class Potencia extends Calculadora {

    private int exponente;

    public Potencia(int numero, int exponente) {
        super(numero);
        this.exponente = exponente;
    }

    @Override
    public void realizarOperacion() {
        int resultado = 1;

        for (int i = 0; i < exponente; i++) {
            resultado = resultado * numero;
        }

        System.out.println("Potencia: " + resultado);
    }
}