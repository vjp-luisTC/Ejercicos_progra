/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entrenamiento_deportivo_inteligente;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author danielcoello
 */
public class Entrenamiento_deportivo_inteligente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //Declaro las variables y el scanner
        int opcion=0, series, segundos, totalsegs, mediosegs, minutos, pulsaciones, peso, altura, imc;
        Scanner entrada = new Scanner(System.in);
       
        // Con un do while muestro el menu y con el try catch capturo la excepcion para que si elige una opcion
        //incorrecta vuelva a pedirle una opcion.
        do {
            System.out.println("1. Series de velocidad: ");
            System.out.println("2. Entrenamiento de resistencia: ");
            System.out.println("3. Calculadora de IMC: ");
            System.out.println("4. Salir");
           
            try {
                opcion = entrada.nextInt();
               
                if (opcion <= 0 || opcion >4) {
                    System.out.println("Error: Debe elegir una opcion valida");
                }                                                                                                                  
            } catch (InputMismatchException e) {
                System.out.println("Error: debes introducir un numero entero");
                entrada.next();  // limpiar buffer
            }
           
            //Un switch para elegir que opcion queremos
           
            switch (opcion) {
           
                case 1 -> {
                    totalsegs = 0;              //Inicio el acumulador de segundos
                   
                    System.out.println("¿Cuántas series de 100 metro va a realizar?");                                        //Le pido las series
                    series = entrada.nextInt();
                   
                    System.out.println("Introduce los segundos que ha tardado en realizar cada una: ");
                    for (int i = 0; i < series; i++) {
                        segundos = entrada.nextInt();
                        totalsegs = totalsegs + segundos;       //Acumulador de segundos
                    }
                   
                    //Calculamos la media de los segundos que ha tardado entre todas las series
                    mediosegs = totalsegs / series;
                   
                    //Calculamos los minutos y segundos que ha tardado en total de todas las series
                    minutos = totalsegs / 60;
                    segundos = totalsegs  % 60;
                   
                    //Imprimimos los resultados
                    System.out.println("El tiempo total que has tardado es: " + minutos + " minutos " + segundos + " segundos.");
                    System.out.println("El tiempo medio de las series es de: " + mediosegs);
                   
                    //Para salir del menu
                    opcion = 4;
                }
                   
                case 2 -> {
                    System.out.println("Introduce las pulsaciones (el entrenamiento terminará al superar 170):");

                    // Mientras sea menor de 170, seguimos pidiendo pulsaciones y si lo supera le indicamos que ha alcanzado el limite
                    do {
                        pulsaciones = entrada.nextInt();
                    } while (pulsaciones < 170);
                    
                    System.out.println("¡Límite alcanzado! Fin del entrenamiento");
                    
                    //Para que finalice el entrenamiento
                    opcion = 4;
                }
                   
                case 3 -> {
                    //Le pedimos al usuario su peso y su altura
                    System.out.println("Indica tu peso: ");
                    peso = entrada.nextInt();
                   
                    System.out.println("Indica tu altura: ");
                    altura = entrada.nextInt();
                   
                    //Calculamos su IMC
                    imc = peso / (altura * altura);
                   
                    //Calculamos en que categoria se encuentra
                    if (imc < 18.5) {
                        System.out.println("Bajo peso");
                    } else if (imc > 18.5 && imc < 25) {
                        System.out.println("Peso normal");
                    }else if (imc >25 && imc < 30) {
                        System.out.println("´Sobre peso");
                    } else if (imc >= 30) {
                        System.out.println("Obesidad");
                    }
                   
                    //Para salir del menu
                    opcion = 4;
                }
                   
                case 4 -> //Imprimimos el mansaje al salir del menu
                    System.out.println("Hasta pronto");
                   
              }
               
        } while (opcion != 4);
       
        entrada.close();
       
       
         
       
    }
   
}