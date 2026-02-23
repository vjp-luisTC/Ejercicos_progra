/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg31;

/**
 *
 * @author danielcoello
 */
public class Ejercicio31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declaro las variables y las inicializo
        int impar1 = 0, impar2 = 0, impar3 = 0, contadorImpares = 0, contadorTotal = 0;

        //Con un bucle while busco los numeros
        while (contadorImpares < 3) {
            int numero = (int) (Math.random() * 100) + 1; // 1 al 100
            contadorTotal++;

            if (numero % 2 != 0) {
                contadorImpares++;

                switch (contadorImpares) {
                    case 1:
                        impar1 = numero;
                        break;
                    case 2:
                        impar2 = numero;
                        break;
                    default:
                        impar3 = numero;
                        break;
                }
            }
        }

        //Imprimo el resultado
        System.out.println("Números impares generados:");
        System.out.println(impar1);
        System.out.println(impar2);
        System.out.println(impar3);

        System.out.println("Cantidad total de números generados: " + contadorTotal);
    }
}
