/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 *
 * @author danielcoello
 */
public class Multiplicacion extends Calculadora {

    private int multiplicador;

    public Multiplicacion(int numero, int multiplicador) {
        super(numero);
        this.multiplicador = multiplicador;
    }

    @Override
    public void realizarOperacion() {
        int resultado = numero * multiplicador;
        System.out.println("Multiplicación: " + resultado);
    }
}