/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio;

/**
 *
 * @author danielcoello
 */
public class Test {

    public static void main(String[] args) {

        System.out.println("=== EMPLEADO 1 ===");
        Empleado emp1 = new Empleado();

        System.out.println("\n=== EMPLEADO 2 ===");
        Empleado emp2 = new Empleado();

        System.out.println("\n=== EMPLEADO 3 ===");
        Empleado emp3 = new Empleado();

        mostrarSueldo(emp1);
        mostrarSueldo(emp2);
        mostrarSueldo(emp3);
    }

    public static void mostrarSueldo(Empleado e) {
        double sueldo = e.calcularSueldo();

        System.out.println("\n" + e.getNombre() + " trabajó " 
                + e.getHoras() + " horas, cobra " 
                + e.getTarifa() + " euros la hora, por lo que le corresponde un sueldo de " 
                + sueldo + " euros.");
    }
}