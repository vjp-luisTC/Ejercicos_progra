/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author alumno
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          
        String nombreAsignatura ;
        float notaPrimerExamen ;
        float notaSegundoExamen ;
        float notaMedia;
        
        
        nombreAsignatura = " Programacion";
        notaPrimerExamen = 9f;
        
        
        notaSegundoExamen = 8f;
        notaMedia = ( notaPrimerExamen + notaSegundoExamen )/2 ;
        
        System.out.println(" Asignatura  "+ nombreAsignatura);
        System.out.println("");
        System.out.println("Nota 1º Examen  " +   notaPrimerExamen);
        System.out.println("");
        System.out.println("Nota 2º Examen " + notaSegundoExamen);
        System.out.println("");
        System.out.println("Nota media " + notaMedia);
        
        
    }
    
}
